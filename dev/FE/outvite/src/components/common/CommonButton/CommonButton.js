import React from 'react';
import './CommonButton.css';

const CommonButton = ({
  buttonTitle,
  buttonIcon,
  backgroundColor,
  buttonTextColor,
  buttonWidth,
  buttonHeight,
  buttonRadius = "m"
}) => {
  const buttonStyles = {
    backgroundColor,
    color: buttonTextColor,
    width: buttonWidth,
    height: buttonHeight,
    borderRadius: getBorderRadius(buttonRadius),
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
    <button className="common-button" style={buttonStyles}>
      <span className="button-title">{buttonTitle}</span>
      {buttonIcon && <span className="button-icon">{buttonIcon}</span>}
    </button>
  );
};

export default CommonButton;
