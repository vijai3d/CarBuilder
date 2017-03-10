package com.cars;

import com.parts.BenzinEngine;
import com.parts.DieselEngine;
import com.services.Car;
import com.services.Engine;

/**
 * Created by Vijai3D on 10.03.2017.
 */
public class MitsubihiCar implements Car {
    private Engine engine;

    public MitsubihiCar(BenzinEngine e) {
        engine = e;
    }

    public void assembleCar() {
        System.out.println("Mitsubishi is assembled");
    }

    public void installEngine() {
        engine.getEngine();
    }
}
