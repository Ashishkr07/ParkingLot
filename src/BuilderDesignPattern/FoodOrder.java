package BuilderDesignPattern;

public class FoodOrder {

    private final int orderId;
    private final String customerName;
    private final String mainItem;
    private final boolean extraCheese;
    private final boolean extraSpicy;
    private final String drink;
    private final String dessert;
    private final String couponCode;
    private final String deliveryInstructions;



    private FoodOrder(Builder builder){
        this.orderId= builder.orderId;;
        this.customerName= builder.customerName;
        this.mainItem= builder.mainItem;
        this.extraCheese= builder.extraCheese;
        this.extraSpicy = builder.extraSpicy;
        this.drink= builder.drink;
        this.dessert= builder.dessert;
        this.couponCode= builder.couponCode;
        this.deliveryInstructions= builder.deliveryInstructions;
    };

    public static class Builder{
        private int orderId;
        private String customerName;
        private String mainItem;
        private boolean extraCheese;
        private boolean extraSpicy;
        private String drink;
        private String dessert;
        private String couponCode;
        private String deliveryInstructions;

        public Builder(int orderId,String customerName,String mainItem){
            this.orderId=orderId;
            this.customerName=customerName;
            this.mainItem=mainItem;
        }

        public Builder extraCheese(boolean extraCheese){
            this.extraCheese = extraCheese;
            return this;
        }
        public Builder extraSpicy(boolean extraSpicy){
            this.extraSpicy = extraSpicy;
            return this;
        }
        public Builder drink(String drink){
            this.drink = drink;
            return this;
        }
        public Builder dessert(String dessert){
            this.dessert = dessert;
            return this;
        }
        public Builder couponCode(String couponCode){
            this.couponCode = couponCode;
            return this;
        }
        public Builder deliveryInstructions(String deliveryInstructions){
            this.deliveryInstructions = deliveryInstructions;
            return this;
        }

        public FoodOrder build() throws Exception {
            if(orderId == 0 || customerName == null || mainItem == null)
                throw new Exception();
            return new FoodOrder(this);
        }


    }
}
