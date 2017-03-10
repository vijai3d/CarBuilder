package com.parts;

import com.parts.dieselengines.Diesel20;
import com.services.Engine;
import com.services.EngineModel;

/**
 * Created by Vijai3D on 10.03.2017.
 */
public class DieselEngine implements Engine{

private EngineModel engineModel;
    public DieselEngine(Diesel20 diesel20) {
        engineModel = diesel20;
    }

    public void getEngine() {
        System.out.println("Diesel Engine installed model: ");

    }

    public void installEngineModel() {
        engineModel.getEngineModel();
    }

}
