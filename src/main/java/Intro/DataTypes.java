package Intro;

public class DataTypes {
    public static void main(String[] args) {
        int numberOfShoes = 5;
        //DataType variableName = value;
        //-32768 to 32767
        short typeOfShort = 10;
        long longType = 32423423423423423L;
        //-128 to 127
        byte byteType = 127;
        //Decimals        - single line comment

        /*
        This is a
        multi
        line
        comment
         */
        float floatType = 10234232342344.3f;
        double doubleType = 122342342342342342342.3;

        //String and Char
        char charType = 'c';
        String shoeType = "Nike";

        //boolean
        boolean trueOrFalse = true;

        System.out.println("Number of Shoes : " + numberOfShoes);
        System.out.println(typeOfShort + numberOfShoes);
        System.out.println("Brand of Shoes : " + shoeType);
    }
}
