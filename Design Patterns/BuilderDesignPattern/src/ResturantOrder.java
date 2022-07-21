public class ResturantOrder {
    private final String starter;
    private final String main;
    private final String dessert;
    private final String drink;

    public ResturantOrder(Builder builder) {
        this.starter = builder.starter;
        this.main = builder.main;
        this.dessert = builder.dessert;
        this.drink = builder.drink;
    }

    static class Builder{

        private String starter;
        private String main;
        private String dessert;
        private String drink;

        public Builder() {
        }

        public ResturantOrder build(){
            return new ResturantOrder(this);
        }

        public Builder starter(String starter){
            this.starter = starter;
            return this;
        }

        public Builder main(String main){
            this.main = main;
            return this;
        }

        public Builder dessert(String dessert){
            this.dessert = dessert;
            return this;
        }

        public Builder drink(String drink){
            this.drink = drink;
            return this;
        }

    }

    @Override
    public String toString() {
        return "Order { Starter="+starter+" , Main meal="+main+" , Dessert="+
                dessert+" , " + "Drink="+drink+" }";
    }

}
