package com.example.fxsample;

import com.sun.javafx.charts.Legend;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private Button speichern;

    @FXML
    private TextField fieldPrename;
    @FXML
    private TextField fieldName;
    @FXML
    private TextField fieldAge;

    @FXML
    private TextField fieldPrenameDel;
    private PersonManager mgr = new PersonManager();

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
        mgr.getPeople().remove(mgr.getIndex());
        mgr.setIndex(mgr.getIndex()-1);
        System.out.println(mgr.people);
    }

    @FXML
    private void prevPerson (){
        fieldPrename.setText(Person.getPreName());
        fieldName.setText(Person.getName());
        fieldAge.setText(String.valueOf(Person.getAge()));
    }

    @FXML
    private void nextPerson (){

    }






    /*@FXML
    protected void onHelloButtonClick() {
       welcomeText.setText("Welcome to JavaFX Application!");
    }*/
}