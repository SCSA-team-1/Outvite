/** @format */
import React, { useState } from "react";
import CommonButton from "./components/common/CommonButton/CommonButton";
import { FiEdit2 } from "react-icons/fi";
import CommonAlert from "./components/common/CommonAlert/CommonAlert";
import CommonPhotoUploader from "./components/common/CommonPhotoUploader/CommonPhotoUploader";
import CommonNavigationBar from "./components/common/CommonNavigationBar/CommonNavigationBar";

const Test = () => {
  const handleAlertButtonClick = () => {
    alert("Button clicked!");
  };
  const [image, setImage] = useState(null);

  // 파일 선택 시 이미지 설정
  const handleFilesSelected = (files) => {
    if (files.length > 0) {
      const imageUrl = URL.createObjectURL(files[0]);
      setImage(imageUrl);
    }
  };

  // 이미지 삭제
  const handleDelete = () => {
    setImage(null);
  };

  const onDelete = () => {
    console.log("Delete clicked");
  };

  const onSelectAll = () => {
    console.log("Select All clicked");
  };

  const items = [
    { name: "삭제", color: "#FF0000", onClick: onDelete },
    { name: "전체선택", color: "#000000", onClick: onSelectAll },
  ];
  return (
    <>
      <CommonAlert
        notiContent="이것은 알림 메시지입니다."
        buttonTitle="확인"
        buttonFunction={handleAlertButtonClick}
        backgroundColor="#555553"
        buttonColor="#EAE3E"
        buttonTextColor="light-color"
        buttonWidth="120px"
        buttonHeight="45px"
      />
      <CommonButton
        buttonTitle="모바일 청첩장 제작"
        buttonIcon={<FiEdit2 />}
        backgroundColor="#EAE3E3"
        buttonTextColor="#555555"
        buttonWidth="300px"
        buttonHeight="40px"
        buttonRadius="xs"
        buttonFunction={handleAlertButtonClick}
      />
      <CommonPhotoUploader
        uploaderSize="80px"
        iconSize="24px"
        uploaderRadius="l"
        imageUrl={image}
        onFilesSelected={handleFilesSelected}
        onDelete={handleDelete}
      />
      <div style={{ margin: "20px" }}>
        <h2>Space-between Mode</h2>
        <CommonNavigationBar
          itemsList={items}
          layoutMode="space-between"
          showSeperator={false}
          width="80%"
        />

        <h2>Padding Mode with Separator</h2>
        <CommonNavigationBar
          itemsList={items}
          layoutMode="padding"
          showSeperator={true}
          itemSpacing="16px"
        />
      </div>
    </>
  );
};
export default Test;
