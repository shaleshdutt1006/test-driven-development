import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CabInvoiceGeneratorTest {

    @Test
    public void givenMultipleRides_ShouldReturnTotalFare() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        /*
        Make an array of Ride where we are adding multiple rides and giving distance and time to it
        using constructor in Ride class
         */
        Ride[] rides = {new Ride(2, 5, "Normal"), new Ride(2, 5, "Premium")};
       /*
        calculating the fare using calculateFare method in cabInvoiceGenerator Class and giving
        calculateFare method array of rides
        */
        double fare = cabInvoiceGenerator.calculateFare(rides);
        Assertions.assertEquals(65, fare);

    }

    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary() {
        /*
        Making an object of service class
         */
        Service service = new Service();
        /*
        Calling method of getRides of service class and giving userId as parameter
         */
        List<Ride> rideList = service.getRides("UserId1");
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        /*
        calculating fare by giving the rideList to the method calculateFareUsingUserId of cabInvoiceGenerator
        class
         */
        InvoiceSummary invoiceSummary = cabInvoiceGenerator.calculateFareUsingUserId(rideList);
        /*
        Checking expectedInvoiceSummary by giving expected results to the InvoiceSummary class
         */
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 60);
        Assertions.assertEquals(expectedInvoiceSummary, invoiceSummary);

    }
}
