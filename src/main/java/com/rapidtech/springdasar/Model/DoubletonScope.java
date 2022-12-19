package com.rapidtech.springdasar.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
//import org.w3c.dom.css.Counter;

import javax.naming.spi.ObjectFactory;

@Data
@AllArgsConstructor
public class DoubletonScope {

    private Counter counter;
    private Object objects;

//    @Override
//    public Object get(String name, ObjectFactory objectFactory) {
//        counter++;
//        if (objects.size() = 2) {
//            return objects.get((int) (counter % 2));
//        } else {
//            Object objects = objectFactory.getObject();
//            objects.add(objects);
//            return object;
//
//        }
//    }
//
//    @Override
//    public Object remove(String name) {
//        if (objects.size() != 0) {
//            return objects.remove(0);
//        }
//        return null;
//    }
//
//    public Counter getCounter() {
//        return counter;
//    }
//
//    public void setCounter(Counter counter) {
//        this.counter = counter;
//    }

}
