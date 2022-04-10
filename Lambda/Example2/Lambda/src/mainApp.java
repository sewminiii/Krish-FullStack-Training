public class mainApp {
    public static void main(String[] args){
        Shape s = para -> {
            System.out.println("Draw a circle with "+ para + "cm radius");
        };
        s.draw(7);
    }
}
