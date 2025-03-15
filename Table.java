package LabAssignment4_VisitorPattern;

public class Table implements Furniture {
    private String size;

    public Table(String size) {
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
