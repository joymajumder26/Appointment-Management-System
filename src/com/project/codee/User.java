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
public class User {
    
  private String fullname;
  private String id;
   private String emil;
   private String phone;
   private String Address;
   private String username;
   private String password;
   private String repassword;

   
  

    public User(String fulname,String id,String emil,String phone,String Address, String username, String password,String repassword) {
        this.fullname=fulname;
        this.id=id;
        this.emil = emil;
        this.phone=phone;
        this.Address=Address;
        this.username = username;
        this.password = password;
        this.repassword=repassword;
    }

     public void Edit(String fulname, String emil,String phone,String Address, String username, String password) {
        this.fullname = fulname;
        this.emil = emil;
        this.phone=phone;
        this.Address=Address;
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }
    
    public String getFullname() {
        return fullname;
    }

    public String getEmil() {
        return emil;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
        
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return Address;
    }
 public boolean Login(String user,String pass){
   
       if( username.equals(user) && password.equals(pass)){
      return true;
       }
       else{
       return false;
}
 } 

public boolean Edit(String pass){
   
       if(password.equals(pass)){
      return true;
       }
       else{
       return false;
}}  
    }

