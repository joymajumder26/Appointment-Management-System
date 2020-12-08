/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.codee;

/**
 *
 * @author Joy Majumder
 */
public class Appointment extends User{
    private String Reason;
    private String Description;
    private String Date;

    public Appointment(String fulname, String id, String emil, String phone, String Address, String username, String password, String repassword) {
        super(fulname, id, emil, phone, Address, username, password, repassword);
    }

    public Appointment(String Reason, String Description, String Date, String fulname, String id, String emil, String phone, String Address, String username, String password, String repassword) {
        super(fulname, id, emil, phone, Address, username, password, repassword);
        this.Reason = Reason;
        this.Description = Description;
        this.Date = Date;
    }
    
    
}
