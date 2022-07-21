public class IceCream implements Cloneable {

    private String size; //regular or large
    private String topping;

    public void setSize(String size) {
        this.size = size;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
