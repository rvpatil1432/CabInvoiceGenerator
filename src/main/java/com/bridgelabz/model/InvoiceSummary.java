package com.bridgelabz.model;

import java.util.Objects;

public class InvoiceSummary {

    private int numOfRides;
    private double totalFare;
    private double avgFare;

    public InvoiceSummary(int numOfRides, double totalFare) {
        this.numOfRides = numOfRides;
        this.totalFare = totalFare;
        this.avgFare = this.totalFare / this.numOfRides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary summary = (InvoiceSummary) o;
        return numOfRides == summary.numOfRides && Double.compare(summary.totalFare, totalFare) == 0 && Double.compare(summary.avgFare, avgFare) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numOfRides, totalFare, avgFare);
    }
}

