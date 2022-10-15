/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.DoctorInputer;
import bo.DoctorManager;
import entity.Doctor;
import java.util.ArrayList;
import utils.Validation;

/**
 *
 * @author duytr
 */
public class DoctorController {

    private DoctorInputer doctorInputer;
    private DoctorManager doctorManager;

    public DoctorController() {
        doctorManager = new DoctorManager();
    }

    public Doctor inputDoc() throws Exception {
        doctorInputer = new DoctorInputer();
        doctorInputer.inputDoctor();
        Doctor d = doctorInputer.getDoctor();
        doctorManager.addDoctor(d);
        return d;
    }

    public Doctor addDoctor() throws Exception {
        Doctor d = inputDoc();
        return d;
    }

    public Doctor updateDoctor() throws Exception {
        String code = Validation.getStringByRegex("Enter Code: ", "Please enter character only!", "[A-Za-z0-9]+");
        Doctor d = doctorManager.getDoctorByCode(code);
        doctorInputer = new DoctorInputer();
        doctorInputer.inputDoctorUpdate(code);
        d = doctorInputer.getDoctor();
        return doctorManager.updateDoctor(code, d);
        
    }

    public Doctor deleteDoctor() throws Exception {
        String code = Validation.getStringByRegex("Enter Code: ", "Please enter character only!", "[A-Za-z0-9]+");
        return doctorManager.deleteDoctor(code);
    }

    public void searchDoctor(){
        String code = Validation.getStringByRegex("Enter Code: ", "Please enter character only!", "[A-Za-z0-9]+");
        ArrayList<Doctor> listFound = doctorManager.searchByCode(code);
        if(listFound.isEmpty()){
            System.out.println("Not found doctor!");
        }else{
            System.out.println("----- Result -----");
            System.out.printf("%-10s%-15s%-25s%-20s\n", "Code", "Name",
                "Specialization", "Availability");
            for (Doctor d : listFound) {
                System.out.println(d);
            }
            
        }
        
    }

}
