/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solverde;

/**
 *
 * @author henry
 */
public class SolarPanel {
    private int panelCount;
    private double efficiency;

    public SolarPanel(int panelCount, double efficiency) {
        this.panelCount = panelCount;
        this.efficiency = efficiency;
    }

    
    
    public int getPanelCount() {
        return panelCount;
    }

    public double getEfficiency() {
        return efficiency;
    }
}


