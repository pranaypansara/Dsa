package Method;

public class Overload {
    public static void main(String[] args) {
        System.out.println(add(2,3));
        System.out.println(add(2,3,4));
        System.out.println(add(2.3f, 3.4f));
    }

    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
    static float add(float a, float b){
        return a+b;
    }
}
