package com.bridgelabz.CabInvoice;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.model.Ride;
import com.bridgelabz.service.InvoiceService;

public class InvoiceServiceTest {

    @Test
    public void givenDistanceAndTime_whenCalculateFare_ShouldReturnTotalFare() {
        InvoiceService invoiceService = new InvoiceService();
        double totalFare = invoiceService.calculateFare(2.0, 5);
        Assert.assertEquals(25, totalFare, 0.0);
    }

    @Test
    public void givenDistanceAndTimeTest2_whenCalculateFare_ShouldReturnTotalFare() {
        InvoiceService invoiceService = new InvoiceService();
        double totalFare = invoiceService.calculateFare(1.0, 5);
        Assert.assertEquals(15, totalFare, 0.0);
    }

    @Test
    public void givenDistanceAndTime_whenCalculateFareIsLessThan5_ShouldReturnTotalFareAs5() {
        InvoiceService invoiceService = new InvoiceService();
        double totalFare = invoiceService.calculateFare(0.1, 1);
        Assert.assertEquals(5, totalFare, 0.0);
    }
    @Test
    public void givenMultipleRides_whenCalculateFare_ShouldReturnAggregateTotalFare() {
        InvoiceService invoiceService = new InvoiceService();
        Ride[] rides = {new Ride(2.0, 5),
                new Ride(1.0, 5),
                new Ride(0.1, 1)};
    
        double totalFare = invoiceService.calculateFare(rides);
        Assert.assertEquals(45.0,totalFare,0.0);
    }
}

