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
public class Teacher {
    private String UserName="joy";
    private String TPassword="123";

    public String getUserName() {
        return UserName;
    }

    public String getTPassword() {
        return TPassword;
    }

    public Teacher(String UserName, String TPassword) {
        this.UserName = UserName;
       
        this.TPassword = TPassword;
    }
    

    public boolean LoginT(String UserName,String TPassword){
   
       if( UserName.equals(UserName) && TPassword.equals(TPassword)){
      return true;
       }
       else{
       return false;
}
    }
}

