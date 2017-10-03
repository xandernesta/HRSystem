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
public class Professional extends Applicant {
    private String currentJobTitle;
    private int yearsOfExperience;
    private boolean ifRelocation;
    
    public Professional (){
        
    }
    public Professional(String userName, String password, String applicantName, String phone, String DOB, String Email, String currentJobTitle, int yearsOfExperience, boolean ifRelocation){
        super(userName, password, applicantName, phone, DOB, Email);
        this.currentJobTitle = currentJobTitle;
        this.yearsOfExperience = yearsOfExperience;
        this.ifRelocation = ifRelocation;
    }
    
    public String getCurrentJobTitle (){
        return currentJobTitle;
    }
    
    public int getYearsOfExperience(){
        return yearsOfExperience;
    }
    
    public boolean getIfRelocation(){
        return ifRelocation;
    }
    
    public void setCurrentJobTitle(String currentJobTitle){
        this.currentJobTitle = currentJobTitle;
    }
    public void setYearsOfExperience(int yearsOfExperience){
        this.yearsOfExperience = yearsOfExperience;
    }
    
    public void setIfRelocation (boolean ifRelocation){
        this.ifRelocation = ifRelocation;
    }
}
