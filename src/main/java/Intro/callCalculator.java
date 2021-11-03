package Intro;

public class callCalculator {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        calc1.a = 40;
        calc1.b = 20;

//        System.out.println("The sum of " + calc1.a + " & " + calc1.b + " = "+calc1.sum());
//        System.out.println("The diff of " + calc1.a + " & " + calc1.b + " = "+calc1.difference());

        System.out.println(calc1.sum(1,5, 7));
        calc1.product();
        calc1.quotient();
    }
}
