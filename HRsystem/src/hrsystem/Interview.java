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
public class Interview {
    private int interviewID;
    private Job job;
    private Applicant[] interviewees = new Applicant[3];
    private Date[] slots= new Date[3];
    private static int nextInterviewID = 1;
    
    public Interview(){
    interviewID = nextInterviewID;
     nextInterviewID++;
    }
    public Interview(Job job,Applicant[] interviewees,Date[] slots){
     this.job = job;
     this.interviewees= interviewees;
     this.slots= slots;
     interviewID = nextInterviewID;
     nextInterviewID++; 
    }
     public int getInterviewID(){
        return interviewID;
    }
     
    public Job getJob(){
        return job;
    }
   
    public Applicant[] getInterviewees(){
        return interviewees;
    }
    public Date[] getSlots(){
        return slots;
    }
    
    public void setJob(Job job){
        this.job = job;
    }
    
    public void setInterviewees(Applicant[] interviewees){
        this.interviewees= interviewees;
    }
    
    public void setSlots(Date[] slots){
          this.slots= slots;
    }
}
