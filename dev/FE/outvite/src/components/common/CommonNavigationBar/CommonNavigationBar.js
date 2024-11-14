import React from 'react';
import './CommonNavigationBar.css';

const CommonNavigationBar = ({
  itemsList,
  layoutMode = 'space-between',
  showSeperator = false,
  itemSpacing = '12px',
  width = '100%',
}) => {
  return (
    <div
      className={`navbar-container ${layoutMode === 'padding' ? 'padding-mode' : 'space-mode'}`}
      style={{
        width: layoutMode === 'space-between' ? width : 'auto',
        gap: layoutMode === 'padding' ? itemSpacing : '0',
      }}
    >
      {itemsList.map((item, index) => (
        <React.Fragment key={index}>
          <div
            className="navbar-item"
            style={{ color: item.color }}
            onClick={item.onClick}
          >
            {item.name}
          </div>
          {showSeperator && index < itemsList.length - 1 && (
            <div className="navbar-separator">|</div>
          )}
        </React.Fragment>
      ))}
    </div>
  );
};

export default CommonNavigationBar;
