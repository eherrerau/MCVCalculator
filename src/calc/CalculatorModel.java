/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

/**
 *
 * @author Eduardo
 */
public class CalculatorModel {
    
    private int calculationValue;
    
    public void addTwoNumbers(int firstNumber, int secondNumber){
        setCalculationValue(firstNumber + secondNumber);
    }

    /**
     * @return the calculationValue
     */
    public int getCalculationValue() {
        return calculationValue;
    }

    /**
     * @param calculationValue the calculationValue to set
     */
    public void setCalculationValue(int calculationValue) {
        this.calculationValue = calculationValue;
    }
    
    
}
