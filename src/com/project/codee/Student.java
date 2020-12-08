
package com.project.codee;


public class Student extends User {
    private String Department;
    private String Batch;

    public Student(String fulname, String id, String emil, String phone, String Address, 
            String username, String password, String repassword,String Department,String Batch) {
        super(fulname, id, emil, phone, Address, username, password, repassword);
        this.Department=Department;
        this.Batch=Batch;
    }

    public String getDepartment() {
        return Department;
    }

    public String getBatch() {
        return Batch;
    }
    
    
    
}
