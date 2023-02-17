package com.example.fxsample;

import com.sun.javafx.charts.Legend;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private TextField fieldPrename;
    @FXML
    private TextField fieldName;
    @FXML
    private TextField fieldAge;

    private final PersonManager mgr = new PersonManager();

    @FXML
    private void savePerson() {
        if (mgr.getPeople().size() != 0){
            mgr.setIndex(mgr.getIndex() + 1);
        }
        mgr.addPerson(fieldPrename.getText(), fieldName.getText(), Integer.parseInt(fieldAge.getText()));
        System.out.println(mgr.people);
    }

    @FXML
    private void deletePerson (){
        mgr.removePerson();
    }

    @FXML
    private void prevPerson (){
        String[] airUp = mgr.previPerson(-1);
        fieldPrename.setText(airUp[0]);
        fieldName.setText(airUp[1]);
        fieldAge.setText(airUp[2]);
    }

    @FXML
    private void nextPerson (){
        String[] airUp = mgr.nextPerson(1);
        fieldPrename.setText(airUp[0]);
        fieldName.setText(airUp[1]);
        fieldAge.setText(airUp[2]);
    }
}