/** @format */

import {
  LOGIN,
  LOGOUT,
  UPDATE_USER_INFO,
  SET_AUTH_LOADING,
  SET_ERROR,
} from "../types/userTypes";

const initialState = {
  isLoggedIn: false,
  userId: null,
  userInfo: { name: null, phone: null },
  authLoading: false,
  error: null,
};

const userReducer = (state = initialState, action) => {
  switch (action.type) {
    case LOGIN:
      return {
        ...state,
        isLoggedIn: true,
        userId: action.payload.userId,
        userInfo: action.payload.userInfo,
      };
    case LOGOUT:
      return {
        ...state,
        isLoggedIn: false,
        userId: null,
        userInfo: { name: null, phone: null },
      };
    case UPDATE_USER_INFO:
      return { ...state, userInfo: { ...state.userInfo, ...action.payload } };
    case SET_AUTH_LOADING:
      return { ...state, authLoading: action.payload };
    case SET_ERROR:
      return { ...state, error: action.payload };
    default:
      return state;
  }
};

export default userReducer;
