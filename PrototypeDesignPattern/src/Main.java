public class Main {
    public static void main(String[] args) {
        Registry registry = new Registry();

        VanillaIcecream vanillaIcecream = (VanillaIcecream) registry.getIcecream(IceCreamType.VANILLA_ICECREAM);
        System.out.println(vanillaIcecream);

        IceCream chocolateIcecream = (IceCream) registry.getIcecream(IceCreamType.CHOCOLATE_ICECREAM);
        System.out.println(chocolateIcecream);
    }
}
