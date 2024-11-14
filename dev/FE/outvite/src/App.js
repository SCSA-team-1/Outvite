/** @format */
import React, { useState } from "react";
import "./App.css";
import CommonButton from "../src/components/common/CommonButton/CommonButton";
import { FiEdit2 } from "react-icons/fi";
import CommonAlert from "../src/components/common/CommonAlert/CommonAlert";
import CommonPhotoUploader from "./components/common/CommonPhotoUploader/CommonPhotoUploader";
import Test from "./Test";

const App = () => {
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
  return (
    <>
      <Test/>
    </>
  );
};
export default App;
