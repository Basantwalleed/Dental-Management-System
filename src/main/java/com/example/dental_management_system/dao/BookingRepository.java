package com.example.dental_management_system.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dental_management_system.pojo.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
    
}
