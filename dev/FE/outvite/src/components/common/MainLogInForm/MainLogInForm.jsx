/** @format */

import React, { useState } from "react";
import axios from "axios";
import "./MainLogInForm.css";
import CommonInput from "../CommonInput/CommonInput";
import CommonButton from "../CommonButton/CommonButton";

const MainLogInForm = () => {
  const [id, setId] = useState("");
  const [password, setPassword] = useState("");
  const [idError, setIdError] = useState("");
  const [passwordError, setPasswordError] = useState("");
  const [responseMessage, setResponseMessage] = useState("");

  // 입력 값 변경 핸들러
  const handleIdChange = (newId) => {
    setId(newId);
    setIdError(""); // 입력 시 기존 오류 메시지 초기화
  };

  const handlePasswordChange = (newPw) => {
    setPassword(newPw);
    setPasswordError(""); // 입력 시 기존 오류 메시지 초기화
  };

  // API 요청 함수
  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      // 로그인 요청
      const response = await axios.post("http://3.35.79.219:8080/api/auth/login", {
        id,
        password,
      });

      if (response.data.status === 200) {
        setResponseMessage("로그인 되었습니다.");
        alert("홈페이지로 이동합니다.");
      }
    } catch (error) {
      alert(error.message)
      if (error.response) {
        const message = error.response.data.message;
        if (message === "해당 ID 유저가 없습니다.") {
          setIdError(message);
          setPasswordError("");
          setId("");
        } else if (message === "잘못된 비밀번호 입니다.") {
          setPasswordError(message);
          setIdError("");
          setPassword("");
        }
      } else {
        alert("서버에 문제가 발생했습니다. 관리자에게 문의 바랍니다.");
      }
    }
  };

  return (
    <form onSubmit={handleSubmit} id="login-container">
      <div className="form-wrapper">
        {/* ID 입력란 */}
        <div className="form">
          <div className="form-info">
            <div className="title">ID</div>
            {idError && (
              <p className="status" style={{ color: "red" }}>
                {idError}
              </p>
            )}
          </div>
          <CommonInput
            width="280px"
            height="40px"
            borderRadius="m"
            placeholder="아이디를 입력하세요"
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
              <p className="status" style={{ color: "red" }}>
                {passwordError}
              </p>
            )}
          </div>
          <CommonInput
            width="280px"
            height="40px"
            borderRadius="m"
            placeholder="비밀번호를 입력하세요"
            color="#888888"
            borderColor="color-main-btn"
            showLimit={false}
            onChange={handlePasswordChange}
            pwMode={true}
          />
        </div>
      </div>

      {/* 로그인 버튼 */}
      <CommonButton
        buttonTitle="LOGIN"
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

export default MainLogInForm;
