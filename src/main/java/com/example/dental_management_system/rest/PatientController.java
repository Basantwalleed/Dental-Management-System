package com.example.dental_management_system.rest;
import com.example.dental_management_system.pojo.Booking;
import com.example.dental_management_system.pojo.Patient;
import com.example.dental_management_system.service.BookingService;
import com.example.dental_management_system.service.PatientService;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/patient")
public class PatientController {
   static  List<String> service;
        static{
            service=new ArrayList<>();
            service.add("Hollywood Smile");
            service.add("IMPLANT & ORAL SURGERY");
            service.add("Orthodontics");
            service.add("Endodontics");
            service.add("PEDIATRIC DENTISTRY");
            service.add("Laser Periodontal Treatment");
            service.add("Crowns & Bridges");
            service.add("Teeth Whitening");
            service.add("Cosmetic Fillings");
        }
        

    public final PatientService patientService;
    public final BookingService bookingService;

    //Constructor Injection
    
    public PatientController(PatientService patient , BookingService bookingService) {
        this.bookingService = bookingService;
        this.patientService = patient;
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {

        // create model attribute to bind form data
        Patient thePatient = new Patient();

        theModel.addAttribute("patient", thePatient);

        return "Sign-Up";
    }
    @GetMapping("/home")
	public String listEmployees(Model theModel) {
        Patient thePatient = new Patient();

		theModel.addAttribute("patient", thePatient);

		return "home";
	}

    @PostMapping("/save")
	public String saveEmployee(@ModelAttribute("patient") Patient thePatient) {

		// save the employee
		patientService.save(thePatient);

		// use a redirect to prevent duplicate submissions
		return "redirect:home";
	}


    @GetMapping("/showFormForBook")
    public String showFormForBook(Model theModel) {
       
        // create model attribute to bind form data
        Booking booking = new Booking();
        theModel.addAttribute("service",service);
        theModel.addAttribute("book", booking);

        return "booking";
    }
    @PostMapping("/booking")
	public String booking(@ModelAttribute("book") Booking booking) {

		// save the employee
		bookingService.save(booking);

		// use a redirect to prevent duplicate submissions
		return "payment";
	}
  

  


 


}
