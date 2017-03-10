package com.parts;

import com.parts.dieselengines.Benzine16;
import com.services.Engine;
import com.services.EngineModel;

/**
 * Created by Vijai3D on 10.03.2017.
 */
public class BenzinEngine implements Engine {
    private EngineModel engineModel;

    public BenzinEngine(Benzine16 benzine16) {
        engineModel = benzine16;
    }

    public void getEngine() {
        System.out.println("Benzine Engine is installed, model: ");
    }

    public void installEngineModel() {
        engineModel.getEngineModel();
    }
}
