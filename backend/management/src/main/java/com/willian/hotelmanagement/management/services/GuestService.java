package com.willian.hotelmanagement.management.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.willian.hotelmanagement.management.entities.Guest;
import com.willian.hotelmanagement.management.repositories.GuestRepository;
@Service
public class GuestService {

    @Autowired
    private GuestRepository guestRepository;

    public List<Guest> findAll(){
        return guestRepository.findAll();
    }
    
    public Guest save(Guest guest){
        return guestRepository.save(guest);
    }
}
