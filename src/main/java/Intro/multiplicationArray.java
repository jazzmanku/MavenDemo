package Intro;

public class multiplicationArray {
    public static void main(String[] args) {
//Array1
        int Array1num=5;
        System.out.println("Array1: "+Array1num);
        System.out.println("------------------------------");
//Array2
        int[] Array2num={ 1,2,3,4,5,6,7,8,9,10};
        System.out.println("Array2num:"+Array2num[0]);
        System.out.println("Array2num:"+Array2num[1]);
        System.out.println("Array2num:"+Array2num[2]);
        System.out.println("Array2num:"+Array2num[3]);
        System.out.println("Array2num:"+Array2num[4]);
        System.out.println("Array2num:"+Array2num[5]);
        System.out.println("Array2num:"+Array2num[6]);
        System.out.println("Array2num:"+Array2num[7]);
        System.out.println("Array2num:"+Array2num[8]);
        System.out.println("Array2num:"+Array2num[9]);



//Array3 =Array1[index]*Array2[index]
        int []Array3num=new int[10];
        Array3num[0]=Array1num*Array2num[0];
        Array3num[1]=Array1num*Array2num[1];
        Array3num[2]=Array1num*Array2num[2];
        Array3num[3]=Array1num*Array2num[3];
        Array3num[4]=Array1num*Array2num[4];
        Array3num[5]=Array1num*Array2num[5];
        Array3num[6]=Array1num*Array2num[6];
        Array3num[7]=Array1num*Array2num[7];
        Array3num[8]=Array1num*Array2num[8];
        Array3num[9]=Array1num*Array2num[9];
        System.out.println("------------------------------");
        System.out.println("Array3num:"+Array1num+" x1="+Array3num[0]);
        System.out.println("Array3num:"+Array1num+" x2="+Array3num[1]);
        System.out.println("Array3num:"+Array1num+" x3="+Array3num[2]);
        System.out.println("Array3num:"+Array1num+" x4="+Array3num[3]);
        System.out.println("Array3num:"+Array1num+" x5="+Array3num[4]);
        System.out.println("Array3num:"+Array1num+" x6="+Array3num[5]);
        System.out.println("Array3num:"+Array1num+" x7="+Array3num[6]);
        System.out.println("Array3num:"+Array1num+" x8="+Array3num[7]);
        System.out.println("Array3num:"+Array1num+" x9="+Array3num[8]);
        System.out.println("Array3num:"+Array1num+" x10="+Array3num[9]);




    }
}