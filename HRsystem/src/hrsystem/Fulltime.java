/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystem;

import java.util.Date;

/**
 *
 * @author jianl
 */
public class Fulltime extends Job {
    private String requiredJobTitle;
    private  int requiredYearsOfExperience;
    private boolean relocation;
    
    public Fulltime(){}
    public Fulltime( String jobName, Date startDate, Date closeDate, String[] keyWords, String requiredJobTitle, int requiredYearsOfExperience, boolean relocation){
        super(jobName, startDate, closeDate, keyWords);
        this.requiredJobTitle = requiredJobTitle;
        this.requiredYearsOfExperience=requiredYearsOfExperience;
        this.relocation = relocation;
    }
    
    public String getRequiredJobTitle(){
        return requiredJobTitle;
    }
    public int getRequiredYearsOfExperience(){
        return requiredYearsOfExperience;
    }
    public boolean getRelocation(){
        return relocation;
    }
    
    public void setRequiredJobTitle(String requiredJobTitle){
        this.requiredJobTitle = requiredJobTitle;
    }
    
    public void setRequiredYearsOfExperience(int requiredYearsOfExperience) {
          this.requiredYearsOfExperience=requiredYearsOfExperience;
    }
    
    public void setRelocation(boolean relocation){
          this.relocation = relocation;
    }
    
}
