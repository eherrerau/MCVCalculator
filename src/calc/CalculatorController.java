/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Eduardo
 */
public class CalculatorController {
    
    private CalculatorView theView;
    private CalculatorModel theModel;
    
    public CalculatorController(CalculatorView theView, CalculatorModel theModel){
        
        this.theView = theView;
        this.theModel = theModel;
        
        this.theView.addCalculateListener(new CalculateListner());
    }
    
    class CalculateListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber =0;
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
            firstNumber = theView.getFirstNumber();
            secondNumber = theView.getSecondNumber();
            
            try {
                theModel.addTwoNumbers(firstNumber, secondNumber);
                theView.setCalcSolution(theModel.getCalculationValue());
            }catch(NumberFormatException ex){
                theView.displayErrorMessage("You need to enter 2 integers");
            }
            
            
        }
        
    }
}
