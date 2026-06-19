package com.scaler.lld.lecture.machine_coding_case_studies.pen;

public class FountainPen extends Pen {
    private Ink ink;
    private Nib nib;

    public FountainPen(String name, String brand, double price, ClosingType closingType, Ink ink, Nib nib) {
        super(name, brand, price, PenType.FOUNTAIN, closingType);
        this.ink = ink;
        this.nib = nib;
    }

    public Ink getInk() { return ink; }
    public void setInk(Ink ink) { this.ink = ink; }

    public Nib getNib() { return nib; }
    public void setNib(Nib nib) { this.nib = nib; }

    @Override
    public void write() {
        if (this.state == PenState.CLOSED) {
            System.out.println("Please open the pen first.");
            return;
        }
        System.out.println("Writing elegantly with fountain pen " + super.getName());
    }
}
