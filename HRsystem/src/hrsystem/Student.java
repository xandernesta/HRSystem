/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystem;

/**
 *
 * @author jianl
 */
public class Student extends Applicant {
    private String schoolName;
    private String major;
    private String graduationYear;
    private boolean ifInternExperience;
    
    public Student(){
        
    }
    
    public Student(String userName, String password, String applicantName, String phone, String DOB, String Email, String schoolName, String major, String graduationYear, boolean ifInternExperience){
        super(userName, password, applicantName, phone, DOB, Email);
        this.schoolName = schoolName;
        this.major = major;
        this.graduationYear = graduationYear;
        this.ifInternExperience = ifInternExperience;
    }
    
    public String getSchoolName (){
        return schoolName;
    }
    
    public String getMajor(){
        return major;
    }
    
    public String getGraduationYear (){
        return graduationYear;
    }
    
    public boolean getIfInternExperience(){
        return ifInternExperience;
    }
    
    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }
    
    public void setMajor(String major){
        this.major = major;
    }
    public void setGraduationYear(String graduationYear){
        this.graduationYear = graduationYear;
    }
    public void ifInternExperience(boolean ifInternExperience){
        this.ifInternExperience = ifInternExperience;
    }
    
}
