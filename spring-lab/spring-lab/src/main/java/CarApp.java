import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sit.int204.lab01.beans.Car;
import sit.int204.lab01.beans.Circle;
import sit.int204.lab01.beans.Counter;
import sit.int204.lab01.beans.Rectangle;

public class CarApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ApplicationContext ct = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        System.out.println("--------------- Single scope ---------------------");
        Car aCar = (Car) context.getBean("carZ");
        Car bCar = (Car) context.getBean("carZ");
        System.out.println(System.identityHashCode(aCar));
        System.out.println(System.identityHashCode(bCar));

        Car cCar = (Car) ct.getBean("carZ");
        System.out.println(System.identityHashCode(cCar));

        System.out.println("--------------- Prototype scope ---------------------");
        Car car1 = (Car) context.getBean("carN");
        Car car2 = (Car) context.getBean("carN");
        System.out.println(System.identityHashCode(car1));
        System.out.println(System.identityHashCode(car2));

        Car car3 = (Car) ct.getBean("carN");
        System.out.println(System.identityHashCode(car3));

        System.out.println("-------------------- Singleton -----------------------");
        Counter counter = (Counter) context.getBean("counter");
        counter.increment();
        f1();
        System.out.println("Current count is " + counter.getCount());

        System.out.println("------------------------------------------------------");
        Circle circle = (Circle)  context.getBean("circle");
        Rectangle rectangle = (Rectangle) context.getBean("rectangle");
        System.out.println(circle);
        System.out.println(rectangle);
    }

    private static void f1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Counter counter = (Counter) context.getBean("counter");
        counter.increment();
        counter.increment();
    }


}
