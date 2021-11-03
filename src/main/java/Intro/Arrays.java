package Intro;

public class Arrays {
    public static void main(String[] args) {
        //Multiple Strings
//        String brandOfCar1 = "Audi";
//        String brandOfCar2 = "BMW";
//        String brandOfCar3 = "Honda";
//        String brandOfCar4 = "Toyota";
//        String brandOfCar5 = "VW";
//        String brandOfCar6 = "Jeep";
//        String brandOfCar7 = "Tesla";
//
//        System.out.println(brandOfCar1);
//        System.out.println(brandOfCar2);
//        System.out.println(brandOfCar3);
//        System.out.println(brandOfCar4);
//        System.out.println(brandOfCar5);
//        System.out.println(brandOfCar6);
//        System.out.println(brandOfCar7);

        //DataType[] arrayName = {};
        //DataType[] arrayName = new DataType[sizeOfArray];

        String[] brands = new String[10];
        String[] brands2 = {"BMW","Audi","Honda"};

        //Data into Array
        //ArrayName[index] = value
        brands[0] = "Audi";
        brands[1] = "BMW";
        brands[2] = "Tesla";

        System.out.println(brands[2]);
        System.out.println(brands2[1]);




    }
}
