/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsystem;

import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author jianl
 */
public class Job {
    protected int jobID;
    protected String jobName;
    protected Date startDate;
    protected Date closeDate;
    protected LinkedList<Applicant> applicant = new LinkedList<Applicant>();
    protected Interview interview;
    protected Applicant offerAcceptedBy;
    protected boolean isOpen;
    protected String[] keyWords = new String[3];
    private static int nextId = 1;
    
    public Job(){
     jobID = nextId;
     nextId++;
    }
    
    public Job(String jobName, Date startDate, Date closeDate, String[] keyWords ){
        
        this.jobName = jobName;
        this.startDate = startDate;
        this.closeDate = closeDate;
        this.isOpen = true;
        this.keyWords = keyWords;
        jobID = nextId;
        nextId++;
    }
    
    public int getJobID(){
        return jobID;
    }
    public String getJobName(){
        return jobName;
    }
    public Date getStartDate(){
        return startDate;
    }
    public Date getCloseDate(){
        return closeDate;
    }
    public LinkedList<Applicant> getApplicant(){
        return applicant;
    }
    public Interview getInterview(){
        return interview;
    }
    public Applicant getOfferAcceptedBy(){
        return offerAcceptedBy;
    }
    public boolean getIsOpen(){
        return isOpen;
    }
    public String[] getKeyWords(){
        return keyWords;
    }
    //    public void setJobId(int jobID){
    //   this.jobID = jobID; decide later if we want set jobID
    //}
    
    public void setJobName(String jobName){
        this.jobName = jobName;
    }
    
    public void setCloseDate(Date closeDate){
        this.closeDate = closeDate;
    }
    
    public void setInterview(Interview interview){
        this.interview = interview;
    }
    
    public void setOfferAcceptedBy(Applicant offerAcceptedBy){
        this.offerAcceptedBy = offerAcceptedBy;
    }
    
    public void setIsOpen(boolean isOpen){
        this.isOpen = isOpen;
    }
    public void setKeyWords(String[] keyWords){
        this.keyWords = keyWords;
    }
    
}
