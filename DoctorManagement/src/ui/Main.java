package ui;

import controller.DoctorController;
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
            int choice = Validation.checkInputIntLimit(menu, 1, 5);
            switch (choice) {
                case 1:
                    System.out.println("---- Add Doctor ----");
                    dc.addDoctor();
                    break;
                case 2:
                    System.out.println("---- Update Doctor ----");
                    dc.updateDoctor();
                    break;
                case 3:
                    System.out.println("---- Delete Doctor ----");
                    dc.deleteDoctor();
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
