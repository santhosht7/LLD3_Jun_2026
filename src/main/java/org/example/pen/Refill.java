package com.scaler.lld.lecture.machine_coding_case_studies.pen;

public class Refill {
    private Ink ink;
    private Nib nib;
    private double capacity;

    public Refill(Ink ink, Nib nib, double capacity) {
        this.ink = ink;
        this.nib = nib;
        this.capacity = capacity;
    }

    public Ink getInk() { return ink; }
    public void setInk(Ink ink) { this.ink = ink; }

    public Nib getNib() { return nib; }
    public void setNib(Nib nib) { this.nib = nib; }

    public double getCapacity() { return capacity; }
    public void setCapacity(double capacity) { this.capacity = capacity; }
}
