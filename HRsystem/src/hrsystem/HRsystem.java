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
    
    private static LinkedList<Job> jobslist = new LinkedList<Job>();
    private static LinkedList<Applicant> applicantlist = new LinkedList<Applicant>();
    private static LinkedList<Interview> interviewlist = new LinkedList<Interview>();
    
    public static LinkedList<Job> getJobslist() { return jobslist; }
     public static LinkedList<Applicant> getApplicantlist() { return applicantlist; }
      public static LinkedList<Interview> getInterviewlist() { return interviewlist; }
     
     
    
}
