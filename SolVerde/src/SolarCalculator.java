package solverde;

public class SolarCalculator {
    private RoofDetails roofDetails;
    private SolarPanel solarPanel;

    public SolarCalculator(RoofDetails roofDetails, SolarPanel solarPanel) {
        this.roofDetails = roofDetails;
        this.solarPanel = solarPanel;
    }

    //  energy production
    public double calculateEnergyProduction() {
        double roofSize = roofDetails.getRoofSize();
        int panelCount = solarPanel.getPanelCount();
        double panelEfficiency = solarPanel.getEfficiency() / 100; // Convert percentage to decimal

        // Get adjustments for location (province) and roof orientation
        double locationSunlightHours = getLocationSunlightHours(roofDetails.getLocation());
        double orientationAdjustment = getOrientationAdjustment(roofDetails.getRoofOrientation());

        //sunlight hours
        double effectiveSunlightHours = locationSunlightHours + orientationAdjustment;

        //energy production formula
        return panelCount * panelEfficiency * effectiveSunlightHours * roofSize * 365 / 1000; // Convert to kWh
    }

    // cost savings
    public double calculateCostSavings(double electricityRate) {
        double energyProduction = calculateEnergyProduction();
        return energyProduction * electricityRate;
    }

    //co2 reduction
    public double calculateCO2Reduction() {
        double CO2_EMISSIONS_OFFSET_FACTOR = 0.7; // 0.7 kg CO2 per kWh
        double energyProduction = calculateEnergyProduction();
        return energyProduction * CO2_EMISSIONS_OFFSET_FACTOR;
    }

    //   s unlight hours based on provicne
    private double getLocationSunlightHours(String location) {
        switch (location.toLowerCase()) {
            case "connaught":
                return 6.0;
            case "leinster":
                return 7.5;
            case "munster":
                return 7.0;
            case "ulster":
                return 6.5;
            default:
                return 6.5; // Default sunlight hours
        }
    }
        // direction adjustment
private double getOrientationAdjustment(String orientation) {
    switch (orientation.toLowerCase()) {
        case "south":
            return 0.0; // No adjustment for optimal orientation
        case "east":
        case "west":
            return -1.5; // Slight reduction in effective sunlight hours
        case "north":
            return -3.0; // Significant reduction for poor orientation
        default:
            return -2.0; // Default 
    }
}
    
}
