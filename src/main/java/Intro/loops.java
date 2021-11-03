package Intro;

public class loops {
    public static void main(String[] args) {

        //i++ = i+1
        //i-- = i-1
        //For loop
        for(int i=0;i<10;i++){
            System.out.println(i);
        }

        int i = 0;
        //while loop
        while(i<10){
            System.out.println(i);
            i++;
        }
        i=0;
        System.out.println("----------------------------");
        //do while
        do {
            System.out.println(i);
            i++;
        }while(i<10);


    }
}
