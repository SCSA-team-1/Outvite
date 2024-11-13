/** @format */

import "./App.css";
import CommonButton from "../src/components/common/CommonButton/CommonButton";
import { FiEdit2 } from "react-icons/fi";
import CommonAlert from "../src/components/common/CommonAlert/CommonAlert";
const App = () => {
  const handleAlertButtonClick = () => {
    alert("Button clicked!");
  };
  return (
    <>
      <CommonAlert
        notiContent="이것은 알림 메시지입니다."
        buttonTitle="확인"
        buttonFunction={handleAlertButtonClick}
        backgroundColor="light-color"
        buttonColor="primary-color"
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
      />
    </>
  );
};
export default App;
