package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> carList;
    {
        carList.add(new Car(2001L, "Honda", "Civic"));
        carList.add(new Car(2004L, "Subaru", "Legacy"));
        carList.add(new Car(2007L, "Mazda", "6"));
        carList.add(new Car(1996L, "Toyota", "Mark II"));
        carList.add(new Car(1995L, "Nissan", "March"));
    }

    @Override
    public List<Car> getAllList() {
        return carList;
    }

    @Override
    public List<Car> getCarSubList(Integer count) {
        return count > 0 && count < carList.size() ? carList.subList(0, count) : carList;
    }
}
