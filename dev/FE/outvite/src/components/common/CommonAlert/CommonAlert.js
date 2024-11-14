/** @format */

import React from "react";
import CommonButton from "../CommonButton/CommonButton";
import "./CommonAlert.css";

const CommonAlert = ({
  notiContent,
  buttonTitle,
  buttonFunction,
  backgroundColor,
  buttonColor,
  buttonTextColor,
  buttonWidth,
  buttonHeight
}) => {
  return (
    <div
      className="common-alert"
      style={{ backgroundColor: `var(--${backgroundColor})` }}
    >
      <p className="alert-content">{notiContent}</p>
      <CommonButton
        buttonTitle="모바일 청첩장 제작"
        buttonIcon={<div/>}
        backgroundColor="#EAE3E3"
        buttonTextColor="#555555"
        buttonWidth="300px"
        buttonHeight="40px"
        buttonRadius="xs"
        buttonFunction={buttonFunction}
      />
    </div>
  );
};

export default CommonAlert;
