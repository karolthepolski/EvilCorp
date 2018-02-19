/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evilcorpcalc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Karol
 */
public class FXMLDocumentController implements Initializable{
    
    @FXML
    private Label lblOutput, lblOutputUp;
    
    @FXML
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnSub,btnDiv,btnAdd,btnMul,btnSum;   
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
    
}
