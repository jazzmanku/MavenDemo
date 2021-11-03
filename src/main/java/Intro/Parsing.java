package Intro;

public class Parsing {
    public static void main(String[] args) {
        String num = "49.20";
        int i = 10;

        System.out.println("String: " + num);
//        System.out.println("Integer - Parse Int: " + Integer.parseInt(num) *i);
//        System.out.println("Integer - Value of : " + Integer.valueOf(num) * 5);
        System.out.println("Integer - Parse Int: " + Double.parseDouble(num) *i);
        System.out.println("Integer - Value of : " + Float.valueOf(num) * 5);

        System.out.println(String.valueOf(i));


        //System.out.println(num * i);

    }
}
