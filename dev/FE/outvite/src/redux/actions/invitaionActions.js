import { SET_WEDDING_INFO, ADD_SHARED_ALBUM, ADD_ATTENDEE, ADD_GUESTBOOK_ENTRY, SET_GROOM_INFO, ADD_GROOM_FAMILY_MEMBER } from '../types/invitationTypes';

export const setWeddingInfo = (weddingInfo) => ({ type: SET_WEDDING_INFO, payload: weddingInfo });
export const addSharedAlbum = (album) => ({ type: ADD_SHARED_ALBUM, payload: album });
export const addAttendee = (attendee) => ({ type: ADD_ATTENDEE, payload: attendee });
export const addGuestbookEntry = (entry) => ({ type: ADD_GUESTBOOK_ENTRY, payload: entry });
export const setGroomInfo = (groomInfo) => ({ type: SET_GROOM_INFO, payload: groomInfo });
export const addGroomFamilyMember = (familyMember) => ({ type: ADD_GROOM_FAMILY_MEMBER, payload: familyMember });
