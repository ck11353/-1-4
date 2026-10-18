package question4;

public class VehicleFactory {
    public static TransportVehicle createVehicle(String type) {
        if ("Truck".equals(type)) {
            TransportVehicle truck = new Truck("T-998");
            return truck;
        }else if ("Drone".equals(type)) {
            TransportVehicle drone = new Drone("D-007");
            return drone;
        }else {
            return null;
        }

    }
}
