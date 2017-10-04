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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList<Job> jobsList = new LinkedList<Job>();
        LinkedList<Applicant> applicantsList = new LinkedList<Applicant>();
        applicantsList.add(new Professional("JohnS", "1234", "John Smith", "352-123-4567", "1/2/1993", "johnsmith@gmail.com","Java Programmer", 3, true));
        applicantsList.add(new Professional("JackB", "5678", "Jack Barker", "352-321-7654", "3/2/1990", "jack.barker@gmail.com","Project Manager", 7, true));
        applicantsList.add(new Professional("PeterW", "1111", "Peter Wong", "651-254-9123", "5/10/1991", "peterwong@gmail.com","Data Analyst", 2, false));
        applicantsList.add(new Professional("MaryL", "9333", "Mary Lynn", "372-153-9567", "10/5/1989", "lynn@gmail.com","Senior Web Developer", 6, true));
        applicantsList.add(new Professional("Jimmy", "0000", "Jimmy Kimmel", "305-555-4567", "7/2/1973", "jk@gmail.com","Talk Show Host", 13, true));
        applicantsList.add(new Professional("Alice", "2222", "Alice Smith", "321-123-4567", "1/15/1996", "alice.smith@gmail.com","Business Analyst", 1, true));
        applicantsList.add(new Professional("Lilly", "3333", "Lilly Jackson", "451-536-2589", "11/12/1933", "lilly@gmail.com","Administrative Assistant", 25, true));
        
        applicantsList.add(new Student("Crystal", "1234", "Crystal Lee", "356-274-4577", "8/9/1986", "crissylee@gmail.com","University of Alabama", "Linguistics", "2018", false));
        applicantsList.add(new Student("JasmineS", "5555", "Jasmine Chou", "327-924-4357", "6/5/1992", "sassyjasmine@gmail.com","University of Florida", "Information Systems", "2018", true));
        applicantsList.add(new Student("DaveDude", "4357", "David Muir", "661-234-4587", "9/9/1985", "dm@gmail.com","Florida State University", "Computer Science", "2019", true));
        
        
        
        
        
    }
    
}
