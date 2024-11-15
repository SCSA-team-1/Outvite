/** @format */

import React, { useState } from "react";
import MainLogInForm from "../../components/common/MainLogInForm/MainLogInForm";
import MainHeader from "../../components/common/MainHeader/MainHeader";
import "./css/LogInPage.css";
import MainFooter from "../../components/common/MainFooter/MainFooter";
const LogInPage = () => {
  return (
    <div className="body">
      <MainHeader></MainHeader>
      <main id="main">
        <MainLogInForm></MainLogInForm>
      </main>
      <MainFooter></MainFooter>
    </div>
  );
};
export default LogInPage;
