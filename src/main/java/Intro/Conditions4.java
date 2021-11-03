package Intro;

public class Conditions4 {

    public static void main(String[] args) {

        /*
        Operators:
        A == B : if A equals B?
        A != B : if A NOT equals B?
        A > B : A greater than B
        A >= B : A greater equals to B
        A < B : A less than B
        A <= B : A less than equal to B
        A > B : A greater than B

        A && B : A and B are true
        A || B : A OR B are true
        !A or !B :

         */

        /*
        Req:
        If Marks >= 90 and <= 100  - Grade A    99,100,101
        If Marks >= 80 and < 90  - Grade B  89,90,91
        If Marks >= 70 and < 80  - Grade C  79,80,81
        If Marks >= 50 and < 70  - Grade D  69,70,71
        If Marks < 50           - Grade F   49,50.51
        If Marks >100           - Invalid Marks

         */
        int marks = 90;

        if (marks>=90) {
            if(marks<=100){
                System.out.println("Grade A");
            }
        }
        else{
            System.out.println("Grade F");
        }

    }
}
