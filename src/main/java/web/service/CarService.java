package web.service;

import web.models.Car;
import java.util.List;

public interface CarService {
    public List<Car> getAllCar();
    public List<Car> getCar (Integer count);
}
