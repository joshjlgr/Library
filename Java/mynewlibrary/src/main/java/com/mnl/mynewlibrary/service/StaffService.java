package com.mnl.mynewlibrary.service;

import com.mnl.mynewlibrary.entity.Staff;

public interface StaffService {
    Staff save(Staff staff);

	Staff getStaff_Id(int staffId);
}