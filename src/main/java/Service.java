import java.util.List;

public class Service {
    RideRepository rideRepository = new RideRepository();

    public List<Ride> getRides(String userId) {
        List<Ride> rides = rideRepository.getRides(userId);
        return rides;
    }
}


