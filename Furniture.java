package LabAssignment4_VisitorPattern;

public interface Furniture {
    void accept(ShippingCostCalculator visitor);
}

