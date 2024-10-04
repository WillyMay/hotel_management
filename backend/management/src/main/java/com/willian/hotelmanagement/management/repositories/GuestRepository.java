package com.willian.hotelmanagement.management.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.willian.hotelmanagement.management.entities.Guest;

public interface GuestRepository extends JpaRepository<Guest, Long>{

}
