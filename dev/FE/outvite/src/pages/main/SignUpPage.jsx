/** @format */

import React, { useState } from "react";
import MainSignUpForm from "../../components/common/MainSignUpForm/MainSignUpForm";
import MainHeader from "../../components/common/MainHeader/MainHeader";
import "./css/SignUpPage.css";
import MainFooter from "../../components/common/MainFooter/MainFooter";
const SignUpPage = () => {
  return (
    <div className="body">
      <MainHeader></MainHeader>
      <main id="main">
        <MainSignUpForm></MainSignUpForm>
      </main>
      <MainFooter></MainFooter>
    </div>
  );
};
export default SignUpPage;
