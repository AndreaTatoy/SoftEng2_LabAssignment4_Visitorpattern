package LabAssignment4_VisitorPattern;

public class Chair implements Furniture {
    private String size;

    public Chair(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void accept(ShippingCostCalculator visitor) {
        visitor.visit(this);
    }
}
