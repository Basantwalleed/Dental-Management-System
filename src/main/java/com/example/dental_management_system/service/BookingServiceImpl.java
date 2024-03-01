package com.example.dental_management_system.service;
import org.springframework.stereotype.Service;
import com.example.dental_management_system.dao.BookingRepository;
import com.example.dental_management_system.pojo.Booking;
@Service
public class BookingServiceImpl implements BookingService{

    private final BookingRepository bookingRepository;

    public BookingServiceImpl (BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public Booking save(Booking booking) {
        return bookingRepository.save(booking);
    }

    

    
}
