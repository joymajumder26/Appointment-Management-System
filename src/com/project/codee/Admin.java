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
public class Admin extends User{
    private String Employee_Type;

    public Admin(String fulname, String id, String emil, String phone, String Address,
            String username, String password, String repassword,String Employee_Type) {
        super(fulname, id, emil, phone, Address, username, password, repassword);
        this.Employee_Type=Employee_Type;
    }

    public String getEmployee_Type() {
        return Employee_Type;
    }
    
}
