import React from 'react';

const CommonRadio = ({handleClick, checked, shape, borderColor, checkedColor, size}) => {

  const radioStyles = {
        borderRadius : shape === 'circle' ? '50%' : '0%',
        border : `2px solid var(--${borderColor})`,
        width : size,
        height : size,
        padding : "0.3%",
        cursor: 'pointer'
      };

  const radioInnerStyle = {
    borderRadius : shape === 'circle' ? '50%' : '0%',
    height: "100%",
    width: "100%",
    backgroundColor: `var(--${checkedColor})`,
    display: checked? "block" : "none"
  }

  return (
    <div>
        <div style={radioStyles} onClick={handleClick}>
          <div style={radioInnerStyle}></div>
        </div>
    </div>
  );
};

export default CommonRadio;