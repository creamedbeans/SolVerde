/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solverde;

/**
 *
 * @author jamie
 */
public class CalculationResult {
    private double initialCost;
    private double solarCost;
    private double savings;
    
    // constructor
    public CalculationResult(double initialCost, double solarCost, double savings) {
        this.initialCost = initialCost;
        this.solarCost = solarCost;
        this.savings = savings;
    }

    public double getInitialCost() {
        return initialCost;
    }

   

    public double getSolarCost() {
        return solarCost;
    }

   

    public double getSavings() {
        return savings;
    }

   // string format for displaying saved entries
    @Override
    public String toString(){
        return String.format("Inital cost: €%.2f, Solar Cost: €%.2f, Savings: €%.2f",initialCost, solarCost,savings);
    }
    
}
