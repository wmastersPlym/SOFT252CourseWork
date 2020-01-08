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

/**
 *
 * @author wmasters
 */
public class PatientController extends UserController{

    @Override
    public void init() {
        view.setUserDetails(user.getId(), user.getFirstName(),user.getLastName(),user.getAddress());
        view.buildPatientControls();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("View Appointments")) {
            AppointmentViewer view = new AppointmentViewer();
            
            AppointmentViewerController controller = new AppointmentViewerController();
            controller.setView(view);
            
            controller.setAppointments(Database.getPatientsAppointments(user.getId()));
            controller.init();
            
            view.addButtonHandlerStrategy(controller);
            view.setVisible(true);
        }
    }
    
}
