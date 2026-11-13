package ArrayofObject;

public class Main {
    public static void main(String[] args) {
        Food[] fridge = new Food[3];

        Food food1 = new Food("pizza");
        Food food2 = new Food("burger");
        Food food3 = new Food("hotdog");

        Food[] example = {food1, food2, food3};

        fridge[0] = food1;
        fridge[1] = food2;
        fridge[2] = food3;

        System.out.println(fridge[0].name);
        System.out.println(example[1].name);
    }
}

class Food{
    String name;
    Food(String name){
        this.name = name;
    }
}