/** @format */

import React, { useState } from "react";
import axios from "axios";
import "./MainSignUpForm.css";
import CommonInput from "../CommonInput/CommonInput";
import CommonButton from "../CommonButton/CommonButton";

const MainSignUpForm = () => {
  const [id, setId] = useState("");
  const [password, setPassword] = useState("");
  const [name, setName] = useState("");
  const [phone, setPhone] = useState("");
  const [idError, setIdError] = useState("");
  const [passwordError, setPasswordError] = useState("");
  const [phoneError, setPhoneError] = useState(""); // 전화번호 오류 메시지 추가
  const [isIdValid, setIsIdValid] = useState(false);
  const [isPasswordValid, setIsPasswordValid] = useState(false);
  const [isPhoneValid, setIsPhoneValid] = useState(false); // 전화번호 유효성 상태 추가
  const [responseMessage, setResponseMessage] = useState("");

  // ID 유효성 검사 함수
  const validateID = (id) => {
    const idRegex = /^[a-zA-Z0-9]{4,12}$/; // 영문 대소문자와 숫자로 구성된 4자~12자
    if (!id) {
      setIsIdValid(false);
      return "아이디를 입력해주세요.";
    } else if (!idRegex.test(id)) {
      setIsIdValid(false);
      return "아이디는 4~12자의 영문 대소문자와 숫자만 가능합니다.";
    }
    setIsIdValid(true);
    return "가능한 아이디입니다.";
  };

  // PW 유효성 검사 함수
  const validatePassword = (password) => {
    const pwRegex = /^(?=.*[a-zA-Z])(?=.*\d)[A-Za-z\d!@#$%^&*]{6,}$/; // 영문과 숫자를 포함하는 최소 6자
    if (!password) {
      setIsPasswordValid(false);
      return "비밀번호를 입력해주세요.";
    } else if (!pwRegex.test(password)) {
      setIsPasswordValid(false);
      return "6자 이상으로, 영문자와 숫자를 포함해야 합니다.";
    }
    setIsPasswordValid(true);
    return "가능한 비밀번호입니다.";
  };

  // 전화번호 유효성 검사 함수
  const validatePhone = (phone) => {
    const phoneRegex = /^\d{3}-\d{4}-\d{4}$/; // 000-0000-0000 형식
    if (!phone) {
      setIsPhoneValid(false);
      return "전화번호를 입력해주세요.";
    } else if (!phoneRegex.test(phone)) {
      setIsPhoneValid(false);
      return "올바른 형식이 아닙니다.";
    }
    setIsPhoneValid(true);
    return "";
  };

  // 입력 값 변경 핸들러
  const handleIdChange = (newId) => {
    setId(newId);
    setIdError(validateID(newId)); // ID 유효성 검사 후 오류 메시지 설정
  };

  const handlePasswordChange = (newPw) => {
    setPassword(newPw);
    setPasswordError(validatePassword(newPw)); // PW 유효성 검사 후 오류 메시지 설정
  };

  const handleNameChange = (newName) => setName(newName);

  const handlePhoneChange = (newPhone) => {
    setPhone(newPhone);
    setPhoneError(validatePhone(newPhone)); // 전화번호 유효성 검사 후 오류 메시지 설정
  };

  // API 요청 함수
  const handleSubmit = async (e) => {
    e.preventDefault();

    const idValidationError = validateID(id);
    const passwordValidationError = validatePassword(password);
    const phoneValidationError = validatePhone(phone);

    // 폼 제출 전 오류 확인
    if (idValidationError || passwordValidationError || phoneValidationError) {
      setIdError(idValidationError);
      setPasswordError(passwordValidationError);
      setPhoneError(phoneValidationError);
      return;
    }

    try {
      // 회원가입 요청
      const response = await axios.post("http://3.35.79.219:8080/api/auth/signup", {
        id, password, name, phone
      });
      if (response.data.status === 200) {
        setResponseMessage("회원가입에 성공했습니다.");
      }
    } catch (error) {
      setResponseMessage("회원가입에 실패했습니다. 다시 시도해 주세요.");
      if (error.response) {
        alert("회원가입에 실패했습니다.");
      } else {
        alert("서버에 문제가 발생했습니다. 잠시 후 다시 시도해주세요.");
      }
    }
  };

  return (
    <form onSubmit={handleSubmit} id="container">
      <div className="form-wrapper">
        {/* ID 입력란 */}
        <div className="form">
          <div className="form-info">
            <div className="title">ID</div>
            {idError && (
              <p className="status" style={{ color: isIdValid ? "blue" : "red" }}>
                {idError}
              </p>
            )}
          </div>
          <CommonInput
            width="280px"
            height="40px"
            borderRadius="m"
            placeholder="4자 이상 12자 이하"
            color="#888888"
            borderColor="color-main-btn"
            limit="12"
            onChange={handleIdChange}
          />
        </div>

        {/* 비밀번호 입력란 */}
        <div className="form">
          <div className="form-info">
            <div className="title">Password</div>
            {passwordError && (
              <p className="status" style={{ color: isPasswordValid ? "blue" : "red" }}>
                {passwordError}
              </p>
            )}
          </div>
          <CommonInput
            width="280px"
            height="40px"
            borderRadius="m"
            placeholder="6자 이상, 영문과 숫자 포함"
            color="#888888"
            borderColor="color-main-btn"
            showLimit={false}
            onChange={handlePasswordChange}
            pwMode={true}
          />
        </div>

        {/* 이름 입력란 */}
        <div className="form">
          <div className="form-info">
            <div className="title">Name</div>
          </div>
          <CommonInput
            width="280px"
            height="40px"
            borderRadius="m"
            placeholder="이름을 입력하세요"
            color="#888888"
            borderColor="color-main-btn"
            showLimit={false}
            onChange={handleNameChange}
          />
        </div>

        {/* 전화번호 입력란 */}
        <div className="form">
          <div className="form-info">
            <div className="title">Phone</div>
            {phoneError && (
              <p className="status" style={{ color: isPhoneValid ? "blue" : "red" }}>
                {phoneError}
              </p>
            )}
          </div>
          <CommonInput
            width="280px"
            height="40px"
            borderRadius="m"
            placeholder="000-0000-0000"
            color="#888888"
            borderColor="color-main-btn"
            showLimit={false}
            onChange={handlePhoneChange}
          />
        </div>
      </div>

      {/* 회원가입 버튼 */}
      <CommonButton
        buttonTitle="SIGNUP"
        buttonIcon={<div />}
        backgroundColor="var(--color-main-btn)"
        buttonTextColor="var(--color-main-bcg)"
        buttonWidth="280px"
        buttonHeight="45px"
        fontSize="12px"
        buttonRadius="s"
        buttonFunction={handleSubmit}
      />

      {/* 응답 메시지 표시 */}
      {responseMessage && <p className="response-message">{responseMessage}</p>}
    </form>
  );
};

export default MainSignUpForm;
