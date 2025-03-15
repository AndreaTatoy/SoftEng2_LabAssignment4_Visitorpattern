package LabAssignment4_VisitorPattern;

public class StandardShippingCalculator implements ShippingCostCalculator {

    @Override
    public void visit(Chair chair) {
        double cost = 50.0;
        System.out.println("Shipping cost for Chair (Flat rate): PHP" + cost);
    }

    @Override
    public void visit(Table table) {
        double cost;
        switch (table.getSize().toLowerCase()) {
            case "small":
                cost = 100.0;
                break;
            case "medium":
                cost = 200.0;
                break;
            case "large":
                cost = 300.0;
                break;
            default:
                cost = 150.0;
                break;
        }
        System.out.println("Shipping cost for Table (" + table.getSize() + "): PHP" + cost);
    }

    @Override
    public void visit(Sofa sofa) {
        double costPerKm = 10.0;
        double cost = sofa.getDistance() * costPerKm;
        System.out.println("Shipping cost for Sofa (Distance: " + sofa.getDistance() + " km): PHP" + cost);
    }
}

