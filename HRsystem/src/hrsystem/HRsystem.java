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
public class HRsystem {
    
    private static LinkedList<Job> jobsList = new LinkedList<Job>();
    private static LinkedList<Applicant> applicantsList = new LinkedList<Applicant>();
    private static LinkedList<Interview> interviewsList = new LinkedList<Interview>();
    
    public static LinkedList<Job> getJobsList() { return jobsList; }
     public static LinkedList<Applicant> getApplicantsList() { return applicantsList; }
      public static LinkedList<Interview> getInterviewsList() { return interviewsList; }
     
     
    
}
