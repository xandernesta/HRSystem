/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystem;

import java.util.LinkedList;

/**
 *
 * @author jianl
 */
public class Applicant {
    protected String userName;
    protected String password;
    protected String applicantName;
    protected int applicantID;
    protected String phone;
    protected String DOB;
    protected String Email;
    protected Interview interview;
    private int totalScore;
    private LinkedList<Job> jobs = new LinkedList<Job>();
    private static int nextApplicantID = 1;
    
    public Applicant(){
        applicantID = nextApplicantID; nextApplicantID++;
    
    }
    public Applicant(String userName, String password, String applicantName, String phone, String DOB, String Email){
        this.userName = userName;
        this.password = password;
        this.applicantName = applicantName;
        this.phone = phone;
        this.DOB = DOB;
        this.Email = Email;
        applicantID = nextApplicantID; 
        nextApplicantID++;
    }
    
    public String getName(){
        return applicantName;
    }
    
    public int getID(){
        return applicantID;
    }
    
    public String getPhone(){
        return phone;
    };
    
    public String getDOB(){
        return DOB;
    }
    public String getEmail(){
        return Email;
    }
    public Interview getInterview(){
        return interview;
    }
    
    public int getTotalScore(){
        return totalScore;
    }
    
    public LinkedList<Job> getJobs(){
        return jobs;
    }
    
    public void setName(String name){
        applicantName = name;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public void setDOB(String DOB){
        this.DOB = DOB;
    }
    
    public void setEmail(String email){
        Email = email;
    }
    
    public void setInterview(Interview interview){
        this.interview = interview;
    }
    
    public void setScore(int score){
        totalScore = score;
    }
    
//    public void applyJob(Job job){
//        if (jobs.size()<2)
//        jobs.add(job);
//        
//    }
    
}
