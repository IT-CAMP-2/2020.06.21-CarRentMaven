package pl.camp.it.db;

import pl.camp.it.model.Bus;
import pl.camp.it.model.Car;
import pl.camp.it.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleRepository {
    private List<Vehicle> vehicles = new ArrayList<>();

    private static final VehicleRepository vehicleRepository = new VehicleRepository();

    private VehicleRepository() {





        /*Car c1 = new Car(1, "BMW", "3", "jkasydg");

        Car c2 = new Car(2, "Toyota", "Corolla", "yuuyruru");

        Car c3 = new Car(3, "Audi", "A5", "qry6535qwy");

        this.vehicles.add(c1);
        this.vehicles.add(c2);
        this.vehicles.add(c3);

        this.vehicles.add(new Bus(4, "Solaris", "152",
                "hjsgdfa", 40, 6));

        this.vehicles.add(new Bus(5, "Solaris", "A100",
                "t6is6adsdy", 45, 6));*/
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public static VehicleRepository getRepository() {
        return vehicleRepository;
    }
}
