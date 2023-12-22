package com.mnl.mynewlibrary.service;

import com.mnl.mynewlibrary.entity.Staff;
import com.mnl.mynewlibrary.dao.StaffRepository;
import com.mnl.mynewlibrary.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffRepository staffRepository;

    @Override
    public Staff save(Staff staff) {
        return staffRepository.save(staff);
    }

	@Override
	public Staff getStaff_Id(int staffId) {
		// TODO Auto-generated method stub
		return null;
	}
}