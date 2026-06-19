package com.scaler.lld.lecture.machine_coding_case_studies.pen;

public class GelPen extends Pen {
    private Refill refill;

    public GelPen(String name, String brand, double price, ClosingType closingType, Refill refill) {
        super(name, brand, price, PenType.GEL, closingType);
        this.refill = refill;
    }

    public Refill getRefill() {
        return refill;
    }

    public void setRefill(Refill refill) {
        this.refill = refill;
    }

    @Override
    public void write() {
        if (this.state == PenState.CLOSED) {
            System.out.println("Please open the pen first.");
            return;
        }
        System.out.println("Writing smoothly with gel pen " + super.getName());
    }
}
