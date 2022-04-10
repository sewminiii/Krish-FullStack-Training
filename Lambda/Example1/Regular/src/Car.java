public class Car implements Vehicle{

    @Override
    public double ConvertSpeedToKmph(double speedInMps) {
        return (speedInMps * 18) / 5;
    }
}
