package Method;

public class Main {
    public static void main(String[] args) {
        String arg = "Bro";
        hello(arg);

        System.out.println(add(4, 5));
    }

    static void hello(String para){
        System.out.println("Hello"+para);
    }

    static int add(int a, int b){
        return a+b;
    }
}