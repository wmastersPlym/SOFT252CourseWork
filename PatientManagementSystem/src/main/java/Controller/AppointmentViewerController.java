/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Appointment;
import Model.Util.Database;
import View.AppointmentViewer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author wmasters
 */
public class AppointmentViewerController implements ActionListener{
    
    private AppointmentViewer view;
    private Appointment[] appointments;
    
    public void init() {
        if(appointments != null) {
            view.buildAppoinmentViewer(appointments);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Close")) {
            view.dispose();
        } else if(e.getActionCommand().substring(0, 11).equals("Appointment")) {
            view.setAppointmentDetails(appointments[Integer.parseInt(e.getActionCommand().substring(11))]);
        }
        
    }
    
    public void setView(AppointmentViewer view) {
        this.view = view;
    }
    public void setAppointments(Appointment[] appointments) {
        this.appointments = appointments;
    }
    
}
