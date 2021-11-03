package Intro;

public class Calculator {
    int a,b;

    /**
     * This method sums two numbers
     * @return sum of two numbers
     */
    public int sum(){
        return a+b;
    }

    public int sum(int x, int y, int z){
        return x+y+z;
    }

    /**
     * This method returns the difference of two numbers
     * @return
     */
    public int difference(){
        return a-b;
    }
    /**
     * This method products two numbers
     * @return
     */
    public int product(){
        return a*b;
    }
    /**
     * This method gives quotient two numbers, given the second number is non-zero
     * @return
     */
    public int quotient(){
        return a/b;
    }

}
