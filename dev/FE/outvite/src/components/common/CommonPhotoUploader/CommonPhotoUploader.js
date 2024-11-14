/** @format */

import React, { useRef } from "react";
import "./CommonPhotoUploader.css";
import { FiPlusCircle } from "react-icons/fi";
const CommonPhotoUploader = ({
  uploaderSize = "80px",
  iconSize = "24px",
  uploaderRadius = "xs",
  imageUrl = null,
  onFilesSelected,
  onDelete,
}) => {
  const fileInputRef = useRef(null);

  const handleClick = () => {
    if (imageUrl) {
      // 이미지가 있는 경우 삭제
      if (onDelete) {
        onDelete();
        if (fileInputRef.current) {
          fileInputRef.current.value = null; // input 초기화
        }
      }
    } else {
      // 이미지가 없는 경우 파일 업로드 창 열기
      if (fileInputRef.current) {
        fileInputRef.current.click();
      }
    }
  };

  const handleFileChange = (event) => {
    const files = event.target.files;
    if (onFilesSelected) {
      onFilesSelected(files);
    }
  };

  const borderRadius = {
    xs: "4px",
    s: "8px",
    m: "12px",
    l: "16px",
    xl: "20px",
  };

  return (
    <div
      onClick={handleClick}
      className="uploader-container"
      style={{
        "--uploader-size": uploaderSize,
        "--uploader-radius": borderRadius[uploaderRadius],
        "--icon-size": iconSize,
      }}
    >
      {imageUrl ? (
        <img src={imageUrl} alt="Uploaded" className="uploader-image" />
      ) : (
        <FiPlusCircle className="uploader-icon">+</FiPlusCircle>
      )}
      <input
        type="file"
        ref={fileInputRef}
        style={{ display: "none" }}
        multiple
        onChange={handleFileChange}
      />
    </div>
  );
};

export default CommonPhotoUploader;
