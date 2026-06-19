package com.scaler.lld.lecture.machine_coding_case_studies.pen;

import java.util.List;

public class Ink {
    private String colour;
    private double density;
    private List<InkFeature> features;

    public Ink(String colour, double density, List<InkFeature> features) {
        this.colour = colour;
        this.density = density;
        this.features = features;
    }

    public String getColour() { return colour; }
    public void setColour(String colour) { this.colour = colour; }

    public double getDensity() { return density; }
    public void setDensity(double density) { this.density = density; }

    public List<InkFeature> getFeatures() { return features; }
    public void setFeatures(List<InkFeature> features) { this.features = features; }
}
