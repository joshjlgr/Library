package com.mnl.mynewlibrary.exception;

public class StaffNotFoundException extends RuntimeException{
    public StaffNotFoundException(Integer id){
        super("Could not found the user with id "+ id);
    }
}
