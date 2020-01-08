/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Medicine;
import Model.Util.Database;
import View.AddMedicineView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author wmasters
 */
public class AddMedicineController implements ActionListener{

    private AddMedicineView view;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Add")) {
            Database.addMedicine(new Medicine(view.getMedicineName(), view.getDesc(), 0));
            view.dispose();
        } else if(e.getActionCommand().equals("Cancel")) {
            view.dispose();
        }
    }
    
    public void setView(AddMedicineView view) {
        this.view = view;
    }
}
