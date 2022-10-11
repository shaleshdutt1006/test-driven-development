public class InvoiceSummary {
    public final int numberOfRides;
    public final double totalFare;
    public final double averageFare;

    public InvoiceSummary(int numberOfRides, double totalFare) {
        this.totalFare = totalFare;
        this.numberOfRides = numberOfRides;
        this.averageFare = this.totalFare / this.numberOfRides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InvoiceSummary that = (InvoiceSummary) o;

        if (numberOfRides != that.numberOfRides) return false;
        if (Double.compare(that.totalFare, totalFare) != 0) return false;
        return Double.compare(that.averageFare, averageFare) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = numberOfRides;
        temp = Double.doubleToLongBits(totalFare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(averageFare);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "InvoiceSummary{" +
                "numberOfRides=" + numberOfRides +
                ", totalFare=" + totalFare +
                ", averageFare=" + averageFare +
                '}';
    }
}
