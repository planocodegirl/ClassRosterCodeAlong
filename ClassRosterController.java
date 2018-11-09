/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classroster.controller;

import com.mycompany.classroster.ui.ClassRosterView;
import com.mycompany.classroster.ui.UserIO;
import com.mycompany.classroster.ui.UserIOConsoleImpl;

/**
 *
 * @author bacag
 */
public class ClassRosterController {
    
    ClassRosterView view = new ClassRosterView();
    private UserIO io = new UserIOConsoleImpl();

     public void run() {
	        boolean keepGoing = true;
	        int menuSelection = 0;
	        while (keepGoing) {
                    
	            switch (menuSelection) {
	                case 1:
	                    io.print("LIST STUDENTS");
	                    break;
	                case 2:
	                    io.print("CREATE STUDENT");
	                    break;
	                case 3:
	                    io.print("VIEW STUDENT");
	                    break;
	                case 4:
	                    io.print("REMOVE STUDENT");
	                    break;
	                case 5:
	                    keepGoing = false;
	                    break;
	                default:
	                    io.print("UNKNOWN COMMAND");
	            }

	        }
	        io.print("GOOD BYE");
	    }
      
     private int getMenuSelection() {
	return view.printMenuAndGetSelection();
	    }
	    
}