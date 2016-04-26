/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.codefire.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author human
 */
public class Parking {

    private List<Car> carList;

    public Parking() {
        this.carList = new ArrayList<>();
    }

    public boolean add(Car car) {
        return carList.add(car);
    }

    public Car remove(String number) {
        Iterator<Car> iterator = carList.iterator();
        while (iterator.hasNext()) {
            Car next = iterator.next();
            if (next.getNumber().equals(number)) {
                iterator.remove();
                return next;
            }
        }
        return null;
    }
}
