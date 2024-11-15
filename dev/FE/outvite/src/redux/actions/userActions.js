import { LOGIN, LOGOUT, UPDATE_USER_INFO, SET_AUTH_LOADING, SET_ERROR } from '../types/userTypes';

export const login = (userId, userInfo) => ({ type: LOGIN, payload: { userId, userInfo } });
export const logout = () => ({ type: LOGOUT });
export const updateUserInfo = (userInfo) => ({ type: UPDATE_USER_INFO, payload: userInfo });
export const setAuthLoading = (loading) => ({ type: SET_AUTH_LOADING, payload: loading });
export const setError = (error) => ({ type: SET_ERROR, payload: error });
