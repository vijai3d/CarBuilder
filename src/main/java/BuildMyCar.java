import com.services.Car;
import com.services.Engine;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Vijai3D on 10.03.2017.
 */
public class BuildMyCar {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Car myCar = context.getBean("MitsubishiCar", Car.class);
        Engine myEngine = context.getBean("MitsubishiEngine", Engine.class);

        myCar.assembleCar();
        myCar.installEngine();
        myEngine.installEngineModel();

        context.close();
    }
}
