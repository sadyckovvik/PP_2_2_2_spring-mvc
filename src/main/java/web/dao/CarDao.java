package web.dao;

import web.models.Car;
import java.util.List;

public interface CarDao {
    public List<Car> getAllCar();
    public List<Car> getCar (Integer count);
}
