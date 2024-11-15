import React from 'react';
import './CommonButton.css';

const CommonButton = ({
  buttonTitle,
  buttonIcon,
  backgroundColor,
  buttonTextColor,
  buttonWidth,
  buttonHeight,
  fontWeight = "regular",
  buttonRadius = "m",
  buttonFunction,
  fontSize
}) => {
  const buttonStyles = {
    backgroundColor,
    color: buttonTextColor,
    width: buttonWidth,
    height: buttonHeight,
    borderRadius: getBorderRadius(buttonRadius),
    fontSize:fontSize,
    fontWeight:fontWeight
  };

  function getBorderRadius(radius) {
    switch (radius) {
      case 'xs':
        return '2px';
      case 's':
        return '4px';
      case 'm':
        return '5px';
      case 'l':
        return '6px';
      case 'xl':
        return '8px';
      default:
        return '5px';
    }
  }

  return (
    <button className="common-button" style={buttonStyles} onClick={buttonFunction}>
      <div className="button-title">{buttonTitle}</div>
      {buttonIcon && <span className="button-icon">{buttonIcon}</span>}
    </button>
  );
};

export default CommonButton;
