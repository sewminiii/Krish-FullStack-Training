public class mainApp {
    public static void main(String[] args){
        Vehicle v = speed -> (speed * 18)/5;
        System.out.println("Speed in Kmph is " + v.ConvertSpeedToKmph(20.00) );
    }
}
