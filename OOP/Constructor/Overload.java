package Constructor;

public class Overload {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("thicc crust", "tomato", "pineapple");
        Pizza plain = new Pizza("thicc crust", "tomato");
        System.out.println("ingredients: "+pizza.bread+", "+pizza.sauce+", "+pizza.topping);
        System.out.println("ingredients: "+plain.bread+", "+plain.sauce);
    }
}

class Pizza{
    String bread;
    String sauce;
    String topping;

    Pizza(String bread, String sauce, String topping){
        this.bread=bread;
        this.sauce=sauce;
        this.topping=topping;
    }

    //plain pizza
    Pizza(String bread, String sauce){
        this.bread=bread;
        this.sauce=sauce;
    }

}