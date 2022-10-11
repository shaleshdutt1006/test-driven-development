import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CabInvoiceGeneratorTest {


    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {

        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double distance = 2.0;
        double time = 5.0;
        double fare = cabInvoiceGenerator.calculateFare(distance, time);
        Assertions.assertEquals(25, fare);
    }

    @Test
    public void givenMultipleRides_ShouldReturnTotalFare() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        /*
        Make an array of Ride where we are adding multiple rides and giving distance and time to it
        using constructor in Ride class
         */
        Ride[] rides = {new Ride(2, 5), new Ride(3, 5)};
       /*
        calculating the fare using calculateFare method in cabInvoiceGenerator Class and giving
        calculateFare method array of rides
        */
        double fare = cabInvoiceGenerator.calculateFare(rides);
        Assertions.assertEquals(60, fare);

    }
    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        Ride[] rides = {new Ride(2, 5), new Ride(3, 5), new Ride(4, 5)};
        InvoiceSummary invoiceSummary = cabInvoiceGenerator.calculateFareAndReturnInvoiceSummary(rides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(3, 105);
        Assertions.assertEquals(expectedInvoiceSummary, invoiceSummary);

    }
}
