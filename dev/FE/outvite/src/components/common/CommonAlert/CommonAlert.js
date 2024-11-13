/** @format */

import React from "react";
import CommonButton from "../CommonButton/CommonButton";
import "./CommonAlert.css";

const CommonAlert = ({
  notiContent,
  buttonTitle,
  buttonFunction,
  backgroundColor = "light-color",
  buttonColor = "primary-color",
  buttonTextColor = "light-color",
  buttonWidth = "100px",
  buttonHeight = "40px",
}) => {
  return (
    <div
      className="common-alert"
      style={{ backgroundColor: `var(--${backgroundColor})` }}
    >
      <p className="alert-content">{notiContent}</p>
      <CommonButton
        title={buttonTitle}
        onClick={buttonFunction}
        color={buttonColor}
        textColor={buttonTextColor}
        width={buttonWidth}
        height={buttonHeight}
      />
    </div>
  );
};

export default CommonAlert;
