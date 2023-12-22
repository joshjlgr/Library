package com.mnl.mynewlibrary.dao;

import com.mnl.mynewlibrary.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff,Integer> {
}