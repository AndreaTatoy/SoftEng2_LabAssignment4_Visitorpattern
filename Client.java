package LabAssignment4_VisitorPattern;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Furniture> orders = new ArrayList<>();
        orders.add(new Chair("Medium"));
        orders.add(new Table("Large"));
        orders.add(new Sofa(15.5));

        ShippingCostCalculator shippingCalculator = new StandardShippingCalculator();

        for (Furniture item : orders) {
            item.accept(shippingCalculator);
        }
    }
}

