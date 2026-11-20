package module10;

import java.security.PublicKey;

public class Bike implements Vehicle {
    // custom implementation of start
    @Override
    public void start(){
        System.out.println("Bike Started");
    }
    //custom implementation of stop
    @Override
    public void stop() {
        System.out.println("Bike stopped");
    }
}
