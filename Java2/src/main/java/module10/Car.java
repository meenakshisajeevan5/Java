package module10;

public class Car  implements Vehicle{

    //custom implementation of start
    @Override
    public void start(){
        System.out.println("Car started");
    }
    //custom implementation of stop(){
    public void stop(){
        System.out.println("Car stopped");
    }
}
