/** @format */

import {
  SET_WEDDING_INFO,
  ADD_SHARED_ALBUM,
  ADD_ATTENDEE,
  ADD_GUESTBOOK_ENTRY,
  SET_GROOM_INFO,
  ADD_GROOM_FAMILY_MEMBER,
} from "../types/invitationTypes";

const initialState = {
  weddingInfo: { date: null, time: null, address: null, theme: null },
  groom: {
    name: null,
    phone: null,
    accountInfo: { bank: null, number: null, depositor: null },
    family: [],
  },
  sharedAlbums: [],
  attendees: [],
  guestBook: [],
};

const invitationReducer = (state = initialState, action) => {
  switch (action.type) {
    case SET_WEDDING_INFO:
      return { ...state, weddingInfo: action.payload };
    case ADD_SHARED_ALBUM:
      return {
        ...state,
        sharedAlbums: [...state.sharedAlbums, action.payload],
      };
    case ADD_ATTENDEE:
      return { ...state, attendees: [...state.attendees, action.payload] };
    case ADD_GUESTBOOK_ENTRY:
      return { ...state, guestBook: [...state.guestBook, action.payload] };
    case SET_GROOM_INFO:
      return { ...state, groom: { ...state.groom, ...action.payload } };
    case ADD_GROOM_FAMILY_MEMBER:
      return {
        ...state,
        groom: {
          ...state.groom,
          family: [...state.groom.family, action.payload],
        },
      };
    default:
      return state;
  }
};

export default invitationReducer;
