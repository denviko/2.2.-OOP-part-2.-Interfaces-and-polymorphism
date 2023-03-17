import java.util.Arrays;
import java.util.List;

public class Main {
    void updateTyre(){
        return;
    }

    public static void main(String[] args) {
        Car car = new Car("car1",4);
        Car car2 = new Car("car2",4);
        String carModelName = car.getModelName();
        String car2ModelName = car2.getModelName();
        int carWheelsCount = car.getWheelsCount();
        int car2WheelsCount = car2.getWheelsCount();

        Truck truck = new Truck("truck1",6);
        Truck truck2 = new Truck("truck2",8);
        String truckModelName = truck.getModelName();
        String truck2ModelName = truck2.getModelName();
        int truckWheelsCount = truck.getWheelsCount();
        int truck2WheelsCount = truck2.getWheelsCount();


        Bicycle bicycle = new Bicycle("bicycle1",2);
        Bicycle bicycle2 = new Bicycle("bicycle2",2);
        String bicycleModelName = "bicycle1";
        String bicycle2ModelName = "bicycle2";
        int bicycleWheelsCount = 2;
        int bicycle2WheelsCount = 2;


        ServiceStationForTransport station = new ServiceStationForTransport();
        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);

        List<Transport> roadTraffic = Arrays.asList(bicycle,bicycle2,car,car2,truck,truck2);
        for (Transport t : roadTraffic) {
            t.updateTyre();
        }
    }



}


