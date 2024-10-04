package com.willian.hotelmanagement.management.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.willian.hotelmanagement.management.entities.*;
import com.willian.hotelmanagement.management.repositories.GuestRepository;
import com.willian.hotelmanagement.management.repositories.LodgingRepository;

@Service
public class LodgingService {

    @Autowired
    private LodgingRepository lodgingRepository;

    @Autowired
    private GuestRepository guestRepository;

    public List<Lodging> findAll() {
        return lodgingRepository.findAll();
    }

    public Lodging findById(Long id) {
        return lodgingRepository.findById(id).orElse(null);
    }

    public Lodging save(Lodging lodging) {
        return lodgingRepository.save(lodging);
    }

    public void deleteById(Long id) {
        lodgingRepository.deleteById(id);
    }

    public Lodging reservedBy(Long lodgdingId, Long guestId) {
        Lodging lodging = findById(lodgdingId);
        Guest guest = guestRepository.findById(guestId).orElse(null);

        if (lodging != null && guest != null) {
            lodging.setGuest(guest);

            return save(lodging);
        }
        return null;
    }

}
