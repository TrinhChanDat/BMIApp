/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmiapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Admin
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private TextField txtChieuCao;
    @FXML private TextField txtCanNang;
    
    public void BMIHandle (ActionEvent event){
        double cao = Double.parseDouble(txtChieuCao.getText());
        double nang = Double.parseDouble(txtCanNang.getText());
        
      Alert alert = new Alert (Alert.AlertType.INFORMATION);
      alert.setContentText(String.valueOf(cao/Math.pow(nang, 2)));
      alert.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
