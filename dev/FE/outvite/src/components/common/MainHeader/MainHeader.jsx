/** @format */

import React from "react";
import "./MainHeader.css";
import CommonNavigationBar from "../CommonNavigationBar/CommonNavigationBar";
import CommonButton from "../CommonButton/CommonButton";
const MainHeader = () => {
  const items = [
    {
      name: "모바일청첩장제작",
      color: "#000000",
      onClick: () => {
        alert("모바일 청첩장 제작 클릭");
      },
    },
    {
      name: "내 청첩장 보기",
      color: "#000000",
      onClick: () => {
        alert("내 청첩장 보기 클릭");
      },
    },
    {
      name: "참석자 명단",
      color: "#000000",
      onClick: () => {
        alert("참석자 명단 클릭");
      },
    },
    {
      name: "공유앨범",
      color: "#000000",
      onClick: () => {
        alert("공유앨범 클릭");
      },
    },
  ];

  return (
    <>
      <div className="container">
        <div className="inner-container">
          <div className="inner-left">
            <a href="#" className="logoBox">
              <div className="logo"></div>
            </a>
            <CommonNavigationBar
              itemsList={items}
              layoutMode="padding"
              showSeperator={false}
              itemSpacing="15px"
            ></CommonNavigationBar>
          </div>
          <div className="buttonWrapper">
            <CommonButton
              buttonTitle="LOGIN"
              buttonIcon={<div />}
              backgroundColor="var(--color-main-btn)"
              buttonTextColor="var(--color-main-bcg)"
              buttonWidth="60px"
              buttonHeight="25px"
              fontSize="12px"
              buttonRadius="xs"
              buttonFunction={() => {
                alert("로그인 클릭");
              }}
            />
            <CommonButton
              buttonTitle="SIGNUP"
              buttonIcon={<div />}
              backgroundColor="var(--color-main-btn)"
              buttonTextColor="var(--color-main-bcg)"
              buttonWidth="60px"
              buttonHeight="25px"
              fontSize="12px"
              buttonRadius="xs"
              buttonFunction={() => {
                alert("회원가입 클릭");
              }}
            />
          </div>
        </div>
      </div>
    </>
  );
};
export default MainHeader;
