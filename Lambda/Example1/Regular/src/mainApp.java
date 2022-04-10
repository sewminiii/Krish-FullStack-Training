public class mainApp {
    public static void main(String[] args){
        Car car = new Car();
        double speed = car.ConvertSpeedToKmph(20.00);
        System.out.println("Speed in Kmph is " + speed );
    }
}
