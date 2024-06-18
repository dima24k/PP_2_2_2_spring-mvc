package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private final List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car("BMW", "3", 2017) );
        cars.add(new Car("Audi", "A6", 2016) );
        cars.add(new Car("Honda", "CRV", 2019) );
        cars.add(new Car("Mercedes", "S63", 2011) );
        cars.add(new Car("Mercedes", "123", 2014) );
    }

    public List<Car> getCarList(Integer count) {
        return (count > 0 && count <= 5) ? cars.subList(0, count) : cars;
    }
}
