package com.scaler.lld.lecture.machine_coding_case_studies.pen;

public class RefillableBallPen extends BallPen implements Refillable {

    public RefillableBallPen(String name, String brand, double price, ClosingType closingType, Refill refill) {
        super(name, brand, price, closingType, refill);
    }

    @Override
    public void refill() {
        System.out.println("Refilling the ball pen " + super.getName());
        // Logic to replace refill
    }
}
