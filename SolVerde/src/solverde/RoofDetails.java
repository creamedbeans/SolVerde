/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package solverde;

/**
 *
 * @author henry
 */


 public class RoofDetails {
    private double roofSize;
    private String roofOrientation;
    private int sunlightExposure;
    private String location;

     public RoofDetails(double roofSize, String roofOrientation, int sunlightExposure, String location) {
        this.roofSize = roofSize;
        this.roofOrientation = roofOrientation;
        this.sunlightExposure = sunlightExposure;
        this.location = location;
    }

    public double getRoofSize() {
        return roofSize;
    }

    
    public String getRoofOrientation() {
        return roofOrientation;
    }
    
    public void setRoofOrientation(String roofOrientation) {
    this.roofOrientation = roofOrientation;
}


    public int getSunlightExposure() {
            return sunlightExposure;
    }

    public String getLocation() {
        return location;
    }
}
