import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RideRepository {

    HashMap<String, List<Ride>> map = new HashMap<>();

    /*
    Adding Rides in the hashmap where key is the userId and values are various rides arraylist
     */
    public RideRepository() {
        Ride ride1 = new Ride(2, 5);
        Ride ride2 = new Ride(3, 5);
        Ride ride3 = new Ride(4, 5);
        Ride ride4 = new Ride(5, 5);
        Ride ride5 = new Ride(6, 5);
        Ride ride6 = new Ride(7, 5);
        List<Ride> list1 = new ArrayList<>();
        List<Ride> list2 = new ArrayList<>();
        List<Ride> list3 = new ArrayList<>();
        list1.add(ride1);
        list1.add(ride2);
        list2.add(ride3);
        list2.add(ride4);
        list3.add(ride5);
        list3.add(ride6);
        map.put("UserId1", list1);
        map.put("UserId2", list2);
        map.put("UserId3", list3);
    }

    /*
    taking userId as input and returning the map value according to the
    key value which is the userId1,userId2 etc.
     */
    public List<Ride> getRides(String userId) {

        return map.get(userId);
    }
}
