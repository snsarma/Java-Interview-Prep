public enum Topping {

    TOMATO,CHEDDAR,OLIVE,JALAPENO,BASIL,SPINACH;

    public double getPrice(Topping topping){
        return switch(this){

            case TOMATO -> 1.5;
            case BASIL -> 2.0;
            case CHEDDAR -> 2.5;
            case OLIVE -> 3.0;
            case JALAPENO -> 3.5;
            case SPINACH -> 4.0;
            default -> 0.0;
        };

    }




}
