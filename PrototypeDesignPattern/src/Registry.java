import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<IceCreamType, IceCream> iceCreamMap = new HashMap<>();

    public Registry() {
        initialize();
    }

    public IceCream getIcecream(IceCreamType iceCreamType){
        IceCream iceCream;
        try {
            iceCream = (IceCream) iceCreamMap.get(iceCreamType).clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return iceCream;
    }

    private void initialize() {
        VanillaIcecream vanillaIcecream = new VanillaIcecream();
        vanillaIcecream.setSize("regular");
        vanillaIcecream.setTopping("strawberry");
        vanillaIcecream.setServingItem("cone");

        ChocolateIcecream chocolateIcecream = new ChocolateIcecream();
        chocolateIcecream.setSize("large");
        chocolateIcecream.setTopping("cashew");

        iceCreamMap.put(IceCreamType.VANILLA_ICECREAM, vanillaIcecream);
        iceCreamMap.put(IceCreamType.CHOCOLATE_ICECREAM,chocolateIcecream);

    }
}
