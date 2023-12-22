package com.mnl.mynewlibrary.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "staff")
public class Staff {
    @Id
    private String Staff_Id;
    private String Staff_Name;
    private String Staff_Joindate;
    private String Staff_Position;
    private String Password;
	 
    
    
		public Staff() {
		super();
	}

		public String getStaff_Id() {
			return Staff_Id;
		}

		public void setStaff_Id(String staff_Id) {
			Staff_Id = staff_Id;
		}

		public String getStaff_Name() {
			return Staff_Name;
		}

		public void setStaff_Name(String staff_Name) {
			Staff_Name = staff_Name;
		}

		public String getStaff_Joindate() {
			return Staff_Joindate;
		}

		public void setStaff_Joindate(String staff_Joindate) {
			Staff_Joindate = staff_Joindate;
		}

		public String getStaff_Position() {
			return Staff_Position;
		}

		public void setStaff_Position(String staff_Position) {
			Staff_Position = staff_Position;
		}

		public String Password() {
			return Password;
		}
		
		public void setPassword(String Password) {
			Password = pass_Word;
		}
		
		public String getPassword() {
			return Password;
		}

			//Generated Constructors
			public Staff(String staff_Id, String staff_Name, String staff_Joindate, String staff_Position,
				String pass_Word) {
			super();
			Staff_Id = staff_Id;
			Staff_Name = staff_Name;
			Staff_Joindate = staff_Joindate;
			Staff_Position = staff_Position;
			Password = pass_Word;
		}

			public Object getstaffID() {
				// TODO Auto-generated method stub
				return null;
			}

			public Object getstaffName() {
				// TODO Auto-generated method stub
				return null;
			}

			public void setStaffId(Object getstaffID) {
				// TODO Auto-generated method stub
				
			}

			public void setStaffname(Object getstaffName) {
				// TODO Auto-generated method stub
				
			}
}

