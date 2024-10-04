package com.willian.hotelmanagement.management.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.willian.hotelmanagement.management.entities.Lodging;
import com.willian.hotelmanagement.management.services.LodgingService;

@RestController
@RequestMapping("/api/lodging")
public class LodgingController {

    @Autowired
    private LodgingService lodgingService;

    @GetMapping
    public List<Lodging> gettAllLodgings() {
        return lodgingService.findAll();
    }

    @GetMapping("/{id}")
    public Lodging getLodging(@PathVariable Long id) {
        return lodgingService.findById(id);
    }

    @PostMapping
    public Lodging addLodging(@RequestBody Lodging lodging) {
        return lodgingService.save(lodging);

    }

    @PutMapping("/{id}")
    public Lodging updateLodging(@PathVariable Long id, @RequestBody Lodging lodging) {
        return lodgingService.save(lodging);

    }

    @DeleteMapping("/{id}")
    public void deleteLodging(@PathVariable Long id) {
        lodgingService.deleteById(id);
    }

    @PostMapping("/{lodgingId}/lodging/{guestId}")
    public ResponseEntity<Lodging> reservedBy(@PathVariable Long lodgingId, @PathVariable Long guestId){
        Lodging reserved = lodgingService.reservedBy(lodgingId, guestId);
        if (reserved != null) {
                return ResponseEntity.ok(reserved);
        }   else {
            return ResponseEntity.badRequest().build();
        }
    }
}
