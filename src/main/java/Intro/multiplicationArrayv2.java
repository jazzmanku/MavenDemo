package Intro;

public class multiplicationArrayv2 {
    public static void main(String[] args) {
        int Array1num=5;
        System.out.println("Array1: "+Array1num);
        System.out.println("------------------------------");
//Array2
        int[] Array2num={ 1,2,3,4,5,6,7,8,9,10,11,12,13};
        for(int i=0;i<Array2num.length;i++){
            System.out.println(Array2num[i]);
        }

        //Array3 =Array1[index]*Array2[index]
        int []Array3num=new int[Array2num.length];
        for(int i=0;i<Array3num.length;i++){
            Array3num[i]=Array1num*Array2num[i];
        }

        for(int i=0;i<Array3num.length;i++){
            System.out.println(Array1num + " X " + Array2num[i] + " = "+ Array3num[i]);
        }
    }
}