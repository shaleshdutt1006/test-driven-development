import java.util.List;

public class CabInvoiceGenerator {


    public double calculateFare(double distance, double time, String rideType) {
        if (rideType.equalsIgnoreCase("Premium")) {
            double Cost_Per_Kilometer = 15;
            double Cost_Per_Minute = 2;
            return distance * Cost_Per_Kilometer + time * Cost_Per_Minute;
        } else {
            double Cost_Per_Kilometer = 10;
            double Cost_Per_Minute = 1;
            return distance * Cost_Per_Kilometer + time * Cost_Per_Minute;
        }
    }

    public double calculateFare(Ride[] rides) {
        double totalFare = 0;
        /*
        Calculating fare using for-each loop and adding the elements of rides array to totalFare
        */
        for (Ride ride : rides) {
            /*
            Calling the calculateFare method above and giving distance and time of rides array to the method
             */
            totalFare += this.calculateFare(ride.distance, ride.time, ride.type);
        }
        return totalFare;
    }

    public InvoiceSummary calculateFareAndReturnInvoiceSummary(Ride[] rides) {
        double totalFare = 0;
        /*
        Calculating fare using for-each loop and adding the elements of rides array to totalFare
        */
        for (Ride ride : rides) {
            /*
            Calling the calculateFare method above and giving distance and time of rides array to the method
             */
            totalFare += this.calculateFare(ride.distance, ride.time, ride.type);
        }
        /*
        returning the value of InvoiceSummary object with giving values of rides length and totalFare
         */
        return new InvoiceSummary(rides.length, totalFare);
    }

    public InvoiceSummary calculateFareUsingUserId(List<Ride> rides) {
        double totalFare = 0;
        /*
        Calculating fare using for-each loop and adding the elements of rides array to totalFare
        */
        for (Ride ride : rides) {
            /*
            Calling the calculateFare method above and giving distance and time of rides array to the method
             */
            totalFare += this.calculateFare(ride.distance, ride.time, ride.type);
        }
        return new InvoiceSummary(rides.size(), totalFare);
    }
}
