/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Appointment;
import Model.People.Doctor;
import Model.Util.Database;
import View.AddMedicineView;
import View.AppointmentViewer;
import View.CreateAppointment;
import java.awt.event.ActionEvent;

/**
 *
 * @author wmasters
 */
public class DoctorController extends UserController {

    @Override
    public void init() {
        view.setUserDetails(user.getId(), user.getFirstName(),user.getLastName(),user.getAddress());
        view.buildDoctorControls();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("View Appointments")) {
            
            AppointmentViewer view = new AppointmentViewer();
            
            AppointmentViewerController controller = new AppointmentViewerController();
            controller.setView(view);
            for(Appointment a : Database.getDrsAppointments(user.getId())) {
                System.out.println(a.getPatientId());
            }
            controller.setAppointments(Database.getDrsAppointments(user.getId()));
            controller.init();
            
            view.addButtonHandlerStrategy(controller);
            view.setVisible(true);
        } else if(e.getActionCommand().equals("Add new Medicine")) {
            
            AddMedicineView view = new AddMedicineView();
            
            AddMedicineController controller = new AddMedicineController();
            controller.setView(view);
            
            view.addButtonHandlerStrategy(controller);
            view.setVisible(true);
        } else if(e.getActionCommand().equals("Make Appointments")){
            CreateAppointment view = new CreateAppointment();
            
            CreateAppointmentController controller = new CreateAppointmentController();
            controller.setView(view);
            controller.setDoctor((Doctor)user);
            
            view.addButtonHandlerStrategy(controller);
            view.setVisible(true);
        }
    }
    
}
