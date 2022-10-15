/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Doctor;
import utils.Validation;

/**
 *
 * @author duytr
 */
public class DoctorInputer {
    private Doctor d;
    public Doctor getDoctor(){
        return d;
    }
    public DoctorInputer() {
        d = new Doctor();
    }
    private void inputInformation(){
        d.setCode(Validation.getStringByRegex("Enter Code: ", "Please enter character only!", "[A-Za-z0-9]+"));
        d.setName(Validation.getStringByRegex("Enter Name: ", "Please enter character only!", "[A-Za-z ]+"));
        d.setSpecialization(Validation.getStringByRegex("Enter Specialization: ", "Please enter character only!", "[A-Za-z ]+"));
        d.setAvailability(Validation.getInt("Enter Availability: ","Please enter Integer Number!",0,Integer.MAX_VALUE));
    }
    private void inputInformationUpdate(){
        d.setName(Validation.getStringByRegex("Enter Name: ", "Please enter character only!", "[A-Za-z ]+"));
        d.setSpecialization(Validation.getStringByRegex("Enter Specialization: ", "Please enter character only!", "[A-Za-z ]+"));
        d.setAvailability(Validation.getInt("Enter Availability: ","Please enter Integer Number!",0,Integer.MAX_VALUE));
    }
    public void inputDoctor(){
        inputInformation();
    }
    public void inputDoctorUpdate(String code) {
        d.setCode(code);
        inputInformationUpdate();
    }

    
}

