package com.willian.hotelmanagement.management.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.willian.hotelmanagement.management.entities.Guest;
import com.willian.hotelmanagement.management.services.GuestService;

@RestController
@RequestMapping("/api/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;

    @GetMapping
    public List<Guest> getAllGuests(){
        return guestService.findAll();
    }

    @PostMapping
    public Guest addGuest(@RequestBody Guest guest) {
        return guestService.save(guest);
    }
}
