import React, { useState } from 'react';
import './CommonInput.css';

const CommonInput = ({width, height, borderRadius, placeholder, color, borderColor, showLimit, limit, limitColor, onChange, pwMode}) => {
    const inputStyles = {
        width,
        height,
        borderRadius: getBorderRadius(borderRadius),
        border: `1px solid var(--${borderColor})`,
        color,
        boxSizing: 'border-box',
        outlineColor: `var(--${borderColor})`,
    };

    const limitStyles = {
        color: `var(--${limitColor})`,
        display: showLimit ? 'inline' : 'none',
    };

    const [inputValue, setInputValue] = useState('');

    function handleChange(e) {
        const newValue = e.target.value;
        if (!showLimit || newValue.length <= limit) {
            setInputValue(newValue);
            onChange(newValue);
        }
    }

    function getBorderRadius(borderRadius) {
        switch (borderRadius) {
            case 'xs':
                return '2px';
            case 's':
                return '4px';
            case 'm':
                return '6px';
            case 'l':
                return '8px';
            default:
                return '0px';
        }
    }

    return (
        <div className='common-input-container'>
            <input
                className='common-input'
                type={pwMode ? 'password' : 'text'}  // pwMode가 true이면 type="password"
                value={inputValue}
                placeholder={placeholder}
                onChange={handleChange}
                style={inputStyles}
            />
            <span
                className='limit'
                style={limitStyles}
            >
                {inputValue.length}/{limit}
            </span>
        </div>
    );
}

export default CommonInput;
