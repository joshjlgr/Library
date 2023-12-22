package com.mnl.mynewlibrary.rest;

import com.mnl.mynewlibrary.dao.StaffRepository;
import com.mnl.mynewlibrary.entity.Staff;
import com.mnl.mynewlibrary.exception.StaffNotFoundException;

import com.mnl.mynewlibrary.service.StaffService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000")
public class StaffController {

	@Autowired
    private StaffRepository staffRepository;

    @PostMapping("/addstaff")
    Staff newStaff(@RequestBody Staff newStaff) {
        return staffRepository.save(newStaff);
    }

    @GetMapping("/allstaff")
    List<Staff> getAllStaffs() {
        return staffRepository.findAll();
    }

    @GetMapping("/staff/{id}")
    Staff getStaffById(@PathVariable Integer id) {
        return staffRepository.findById(id)
                .orElseThrow(() -> new StaffNotFoundException(id));
    }

    @PutMapping("/updatestaff/{id}")
    Staff updateStaff(@RequestBody Staff newStaff, @PathVariable Integer id) {
        return staffRepository.findById(id)
                .map(staff -> {
                    staff.setStaff_Id(newStaff.getStaff_Id());
                    staff.setStaff_Name(newStaff.getStaff_Name());
                    staff.setPassword(newStaff.Password());
                    staff.setStaff_Joindate(newStaff.getStaff_Joindate());
                    staff.setStaff_Position(newStaff.getStaff_Position());
                    return staffRepository.save(staff);
                }).orElseThrow(() -> new StaffNotFoundException(id));
    }

    @DeleteMapping("/staff/{id}")
    String deleteStaff(@PathVariable Integer id){
        if(!staffRepository.existsById(id)){
            throw new StaffNotFoundException(id);
        }
        staffRepository.deleteById(id);
        return  "Staff with id "+id+" has been deleted success.";
    }

 
    //greet
    @GetMapping("/")
    public String sayHello() {
    	return "You are logged into LMS";
    }

}