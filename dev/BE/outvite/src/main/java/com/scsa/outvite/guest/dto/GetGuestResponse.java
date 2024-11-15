package com.scsa.outvite.guest.dto;

import com.scsa.outvite.entity.Guest;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class GetGuestResponse {
    private List<GuestDTO> guests;

    public GetGuestResponse(List<Guest> guestList) {
        this.guests = new ArrayList<GuestDTO>();
        for (Guest guest : guestList) {
            GuestDTO guestDTO = new GuestDTO(guest);
            guests.add(guestDTO);
        }
    }

}
