package summarize.test;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import summarize.dao.Car;
import summarize.proxy.CarProxy;
import summarize.proxy.ResultCar;
import summarize.proxy.StopProxy;

public class ZJCglibTest {
    public static void main(String[] args) {
        Callback[] callback = {new CarProxy(), new StopProxy()};

        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(Car.class);

        enhancer.setCallbacks(callback);

        enhancer.setCallbackFilter(new ResultCar());

        Car car = (Car) enhancer.create();
        car.drive();
        System.out.println("-------------------");
        car.stop();
    }
}
