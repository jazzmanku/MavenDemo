package Intro;

public class multiplicationArrayV3 {
    public static void main(String[] args) {
        int tableOf=5;
        int maxList= 15;
        System.out.println("Table Of : "+tableOf);
        System.out.println("------------------------------");
        for(int i=0;i<maxList;i++){
            System.out.println(tableOf + " X " + i + " = " + tableOf*i);
        }
    }
}