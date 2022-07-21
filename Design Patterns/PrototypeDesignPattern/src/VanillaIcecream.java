public class VanillaIcecream extends IceCream{
    private String servingItem; //cone or cup

    public void setServingItem(String servingItem) {
        this.servingItem = servingItem;
    }

    @Override
    public String toString() {
        return "Vanilla Ice cream: { Serving item="+servingItem+" }";
    }
}
