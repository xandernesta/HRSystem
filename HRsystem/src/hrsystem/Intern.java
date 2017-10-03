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
public class Intern extends Job {
    private String requiredMajor;
    private int requiredGraduationYear;
    private boolean internExperience;
    
    public Intern(){
        
    }
    public Intern( String jobName, Date startDate, Date closeDate, String[] keyWords, String requiredMajor, int requiredGraduationYear, boolean internExperience){
        super(jobName, startDate, closeDate, keyWords);
        this.requiredMajor = requiredMajor;
        this.requiredGraduationYear = requiredGraduationYear;
        this.internExperience = internExperience;
    }
    public String getRequiredMajor(){
        return requiredMajor;
    }
    public int getRequiredGraduationYear(){
        return requiredGraduationYear;
    }
    public boolean getInternExperience(){
        return internExperience;
    }
    public void setRequiredMajor(String requiredMajor){
        this.requiredMajor = requiredMajor;
    }
    public void setRequiredGraduationYear(int requiredGraduationYear){
        this.requiredGraduationYear = requiredGraduationYear;
    }
    public void setInternExperience(boolean internExperience){
        this.internExperience = internExperience;
    }



}
