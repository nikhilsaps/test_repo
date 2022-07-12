import java.util.Arrays;

//this program shows various print function with datatype in java
public class Main {
    public static void main(String[] args) {
        //this program is based on the Non-primitive datatype and printing it

        // String object
        String str = "A quick brown fox jump over a lazy dog";
        System.out.println(str);

        // Arrays example of all type
        //you will need the loop use array of string

        String[] strArr = {"Apple","Banana","Guava","Pomegranate" }; //a simple input in String array
        for(int i=0; i< strArr.length;i++) { System.out.print(strArr[i]);}
        
        //array of boolean
        boolean[] boarr = {true,false,true,true};   //array of boolean
        for(int i=0; i< boarr.length;i++) { System.out.print(boarr[i]);}

        //array of byte
        byte[] byarr = {1,2,3,4,5};         //array of byte  size 4
        for(int i=0; i< byarr.length;i++) { System.out.print(byarr[i]);}

        //array of int
        int[] arr = {2,4,6,8,0};            //creating array of int size 5
        for(int i=0; i< arr.length;i++) { System.out.print(arr[i]);}

        //array of float
        float[] farr = {1.2f,2.4f,9.8f};       //float array of size 5
        for(int i=0; i< farr.length;i++) { System.out.print(farr[i]);}

        //array of char
        char[] carr = {'A','B','C'};         //array of char size 4
        for(int i=0; i< carr.length;i++) { System.out.print(carr[i]);}

        //array of short
        short[] shrt = {23,2,45,65};        //array of short size 4
        for(int i=0; i< shrt.length;i++) { System.out.print(shrt[i]);}

        //array of long
        long[] loarr = {12324,32443,564523,144534};         //array of long size 4
        for(int i=0; i< loarr.length;i++) { System.out.print(loarr[i]);}

        //array of double
        double[] doarr = {1231.453,2131243.342342,43.534534,2.34324};     //array of double size 4
        for(int i=0; i< doarr.length;i++) { System.out.print(doarr[i]);}


    }
}
