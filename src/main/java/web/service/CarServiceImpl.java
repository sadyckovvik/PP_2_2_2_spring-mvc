package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private static int CAR_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++CAR_COUNT, "Bmv", "V6"));
        cars.add(new Car(++CAR_COUNT, "Nissan", "V4"));
        cars.add(new Car(++CAR_COUNT, "Toyota", "V6"));
        cars.add(new Car(++CAR_COUNT,"Haval", "V4"));
        cars.add(new Car(++CAR_COUNT, "Kia", "V3"));
    }

    @Override
    public List<Car> getCar (Integer count) {
        if(count != null && cars.size() >= count) {
            return cars.subList(0,count);
        }
        return cars;
    }
}
