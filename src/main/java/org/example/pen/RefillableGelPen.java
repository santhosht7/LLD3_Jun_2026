package com.scaler.lld.lecture.machine_coding_case_studies.pen;

public class RefillableGelPen extends GelPen implements Refillable {

    public RefillableGelPen(String name, String brand, double price, ClosingType closingType, Refill refill) {
        super(name, brand, price, closingType, refill);
    }

    @Override
    public void refill() {
        System.out.println("Refilling the gel pen " + super.getName());
        // Logic to replace refill
    }
}
