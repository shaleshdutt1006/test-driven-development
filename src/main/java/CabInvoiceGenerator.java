public class CabInvoiceGenerator {


    public double calculateFare(double distance, double time) {

        double Cost_Per_Kilometer = 10;
        double Cost_Per_Minute = 1;
        return distance * Cost_Per_Kilometer + time * Cost_Per_Minute;
    }
}
