public class Main {
    public static void main(String[] args) {

        ResturantOrder.Builder builder1 = new ResturantOrder.Builder();
        ResturantOrder order1 = builder1.starter("Garlic Bread").main("Spaghetti").dessert("Ice cream").drink("Wine").build();
        System.out.println(order1);

        ResturantOrder.Builder builder2 = new ResturantOrder.Builder();
        ResturantOrder order2 = builder2.starter("Soup").main("Fried rice").drink("Coke").build();
        System.out.println(order2);

        ResturantOrder.Builder builder3 = new ResturantOrder.Builder();
        ResturantOrder order3 = builder3.main("Pizza").build();
        System.out.println(order3);

    }
}
