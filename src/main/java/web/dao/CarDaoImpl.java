package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    List<Car> cars = new ArrayList<>();

    public CarDaoImpl() {
        cars.add(new Car("BMW", "3", 2017) );
        cars.add(new Car("RENAULT", "LAGUNA", 2014) );
        cars.add(new Car("TOYOTA", "RAV4", 2020) );
        cars.add(new Car("SKODA", "RAPID", 2019) );
        cars.add(new Car("BMW", "7", 2007) );
    }


    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCarsByCount(Integer count) {
        return cars.subList(0, count);
    }
}
