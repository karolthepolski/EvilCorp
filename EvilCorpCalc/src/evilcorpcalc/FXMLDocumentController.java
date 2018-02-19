/* 
 * Copyright (C) 2018 Karol
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package evilcorpcalc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
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
    private String digits = "";
    private String outputUPText;
    private String outputDownText;
    
    private int operation = 0;
    private int firstDigit, secondDigit;
    
    
    Calculator myCalc = new Calculator();
    
    
    
    @FXML
    private void getBtn1(ActionEvent event){
    digits = digits+= "1";
    lblOutput.setText(digits);
    if(operation == 0)
        disableOperational(false);
    btnSum.setDisable(false);
    }
    @FXML
    private void getBtn2(ActionEvent event){
    digits = digits+= "2";
    lblOutput.setText(digits);
    if(operation == 0)
        disableOperational(false);
    btnSum.setDisable(false);
    }
    @FXML
    private void getBtn3(ActionEvent event){
    digits = digits+= "3";
    lblOutput.setText(digits);
    if(operation == 0)
        disableOperational(false);
    btnSum.setDisable(false);
    }
    @FXML
    private void getBtn4(ActionEvent event){
    digits = digits+= "4";
    lblOutput.setText(digits);
    if(operation == 0)
        disableOperational(false);
    btnSum.setDisable(false);
    }
    @FXML
    private void getBtn5(ActionEvent event){
    digits = digits+= "5";
    lblOutput.setText(digits);
    if(operation == 0)
        disableOperational(false);
    btnSum.setDisable(false);
    }
    @FXML
    private void getBtn6(ActionEvent event){
    digits = digits+= "6";
    lblOutput.setText(digits);
    if(operation == 0)
        disableOperational(false);
    btnSum.setDisable(false);
    }
    @FXML
    private void getBtn7(ActionEvent event){
    digits = digits+= "7";
    lblOutput.setText(digits);
    if(operation == 0)
        disableOperational(false);
    btnSum.setDisable(false);
    }
    @FXML
    private void getBtn8(ActionEvent event){
    digits = digits+= "8";
    lblOutput.setText(digits);
    if(operation == 0)
        disableOperational(false);
    btnSum.setDisable(false);
    }
    @FXML
    private void getBtn9(ActionEvent event){
    digits = digits+= "9";
    lblOutput.setText(digits);
    if(operation == 0)
        disableOperational(false);
    btnSum.setDisable(false);
    }
    @FXML
    private void getBtn0(ActionEvent event){
    digits = digits+= "0";
    lblOutput.setText(digits);
    if(operation == 0)
        disableOperational(false);
    btnSum.setDisable(false);
    }
    @FXML
    private void getBtnSum(ActionEvent event){
      int result;
      secondDigit = Integer.valueOf(digits);
      String txt = lblOutputUp.getText() + digits + " = ";
      lblOutputUp.setText(txt);
      switch (operation){
          case 1:
              result = myCalc.addition(firstDigit, secondDigit);
              lblOutput.setText(String.valueOf(result));
              break;
          case 2:
              result = myCalc.substraction(firstDigit, secondDigit);
              lblOutput.setText(String.valueOf(result));
              break;
          case 3:
              result = myCalc.multiplication(firstDigit, secondDigit);
              lblOutput.setText(String.valueOf(result));
              break;
          case 4:
              result = myCalc.division(firstDigit, secondDigit);
              lblOutput.setText(String.valueOf(result));
              break;
          default:
              break;
      }
      btn1.setDisable(true);
      btn2.setDisable(true);
      btn3.setDisable(true);
      btn4.setDisable(true);
      btn5.setDisable(true);
      btn6.setDisable(true);
      btn7.setDisable(true);
      btn8.setDisable(true);
      btn9.setDisable(true);
      btn0.setDisable(true);
      disableOperational(true);
      btnSum.setDisable(true);
      operation = 0;
    }
    
    @FXML
    private void getBtnAdd(ActionEvent event){ 
    firstDigit = Integer.valueOf(digits); 
    lblOutputUp.setText(digits + " + ");
    digits = "";
    lblOutput.setText(digits);
    operation = 1;
    disableOperational(true);
    btnSum.setDisable(true);
    }
    @FXML
    private void getBtnSub(ActionEvent event){
    firstDigit = Integer.valueOf(digits); 
    lblOutputUp.setText(digits + " - ");
    digits = "";
    lblOutput.setText(digits);
    operation = 2;
    disableOperational(true);
    btnSum.setDisable(true);
    }
    @FXML
    private void getBtnMul(ActionEvent event){
    firstDigit = Integer.valueOf(digits); 
    lblOutputUp.setText(digits + " * ");
    digits = "";
    lblOutput.setText(digits);
    operation = 3;
    disableOperational(true);
    btnSum.setDisable(true);
    }
    @FXML
    private void getBtnDiv(ActionEvent event){
    firstDigit = Integer.valueOf(digits); 
    lblOutputUp.setText(digits + " / ");
    digits = "";
    lblOutput.setText(digits);
    operation = 4;
    disableOperational(true);
    btnSum.setDisable(true);
    }
    
    @FXML
    private void getBtnClr(ActionEvent event){
    operation = 0;
    firstDigit = 0;
    secondDigit = 0;
    lblOutput.setText("");
    lblOutputUp.setText("");
    digits = "";
    
    btn1.setDisable(false);
    btn2.setDisable(false);
    btn3.setDisable(false);
    btn4.setDisable(false);
    btn5.setDisable(false);
    btn6.setDisable(false);
    btn7.setDisable(false);
    btn8.setDisable(false);
    btn9.setDisable(false);
    btn0.setDisable(false);
    disableOperational(true);
    btnSum.setDisable(true);
    }
    
    private void disableOperational(boolean b){
    btnAdd.setDisable(b);
    btnSub.setDisable(b);
    btnMul.setDisable(b);
    btnDiv.setDisable(b);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    disableOperational(true);
    btnSum.setDisable(true);
    }
    
}
