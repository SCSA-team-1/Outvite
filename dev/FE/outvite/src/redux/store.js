// redux/store.js
import { createStore, combineReducers } from 'redux';
import userReducer from './reducers/userReducer';
import invitationReducer from './reducers/invitationReducer';

const rootReducer = combineReducers({
  user: userReducer,
  invitation: invitationReducer,
});

const store = createStore(rootReducer);

export default store;
