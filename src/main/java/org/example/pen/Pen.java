package com.scaler.lld.lecture.machine_coding_case_studies.pen;

public abstract class Pen {
    private String name;
    private String brand;
    private double price;
    private PenType type;
    private ClosingType closingType;
    protected PenState state;

    public Pen(String name, String brand, double price, PenType type, ClosingType closingType) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.type = type;
        this.closingType = closingType;
        this.state = PenState.CLOSED;
    }

    public abstract void write();

    public void open() {
        this.state = PenState.OPEN;
        System.out.println(name + " is now open.");
    }

    public void close() {
        this.state = PenState.CLOSED;
        System.out.println(name + " is now closed.");
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public PenType getType() {
        return type;
    }

    public ClosingType getClosingType() {
        return closingType;
    }

    public PenState getState() {
        return state;
    }
}
