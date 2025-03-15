package LabAssignment4_VisitorPattern;

public class Sofa implements Furniture {
    private double distance; 

    public Sofa(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public void accept(ShippingCostCalculator visitor) {
        visitor.visit(this);
    }
}
