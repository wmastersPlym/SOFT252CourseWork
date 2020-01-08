/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Appointment;
import Model.People.Doctor;
import Model.Util.Database;
import View.CreateAppointment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author wmasters
 */
public class CreateAppointmentController implements ActionListener{

    private CreateAppointment view;
    private Doctor doctor;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Create")) {
            Database.addAppointment(new Appointment(view.getDoctorId(), view.getPatientId(), view.getDateTime(), view.getNotes()));
            view.dispose();
        } else if(e.getActionCommand().equals("Cancel")) {
            view.dispose();
        }
    }
    
    public void setView(CreateAppointment view) {
        this.view = view;
    }
    
    public void setDoctor(Doctor doc) {
        this.doctor = doc;
        view.setDoctorId(doc.getId());
    }
    
}
