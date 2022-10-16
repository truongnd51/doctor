package ui;

import controller.DoctorController;
import entity.Doctor;
import utils.Validation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author duytr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        DoctorController dc = new DoctorController();
        String menu = "-------------------------\n"
                + "DOCTOR MANAGEMENT PROGRAM\n"
                + "1. Add doctor\n"
                + "2. Update doctor\n"
                + "3. Delete doctor\n"
                + "4. Search doctor\n"
                + "5. Exit\n"
                + "Enter choice: ";
        while (true) {
            System.out.println(menu);
            int choice = Validation.getInt(menu,"Please enter Integer Number!", 1, 5);
            switch (choice) {
                case 1:
                    try {
                        System.out.println("---- Add Doctor ----");
                        Doctor add = dc.addDoctor();
                        System.out.println("Add doctor success!");
                        
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    
                    
                    break;
                case 2:
                    try {
                        System.out.println("---- Update Doctor ----");
                        Doctor update = dc.updateDoctor();
                        System.out.println("Update doctor success!");
                        
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("---- Delete Doctor ----");
                        Doctor delete = dc.deleteDoctor();
                        System.out.println("Delete doctor success!");
                        
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    
                    
                    break;
                case 4:
                    System.out.println("---- Search Doctor ----");
                    dc.searchDoctor();
                    break;
                case 5:
                    return;
            }

        }
    }

}
