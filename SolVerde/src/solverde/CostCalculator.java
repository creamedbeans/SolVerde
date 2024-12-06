/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solverde;

/**
 *
 * @author jamie
 */
public class CostCalculator {
    protected double percentage; //defines the reduction variable
    
    public CostCalculator(double percentage){
        this.percentage = percentage; //applies the percentage of whatever subclass is in use to the variable
    }
   
    public double calculate(double currentCost){
        return currentCost * (1 - percentage); //shared calulation logic for all subcasses using whatever percentage is picked
    }
}
