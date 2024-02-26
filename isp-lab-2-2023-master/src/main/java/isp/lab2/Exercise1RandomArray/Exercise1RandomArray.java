package isp.lab2.Exercise1RandomArray;

import java.util.Random;

public class Exercise1RandomArray {

    public static int[] getArrayOfRandomNumbers(int n) {
        int[] array = new int[n];
        Random rand = new Random();
         for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(100);
        }
        return array;
    }

    public static int[] findMaxAndMin(int[] array) {
        int minim = 101;
        int maxim = 9;
        for(int i = 0; i < array.length; i++){
            if(array[i] > maxim){
                maxim = array[i];
            }
            if(array[i] < minim){
                minim = array[i];
            }
        }
        int[] arrayMaxMin = new int[2];
        arrayMaxMin[0] = minim;
        arrayMaxMin[1] = maxim;
        return arrayMaxMin;
    }

    public static void main(String[] args) {

        Random random = new Random();
        //genereaza numar random intre 10 si 100
        int size = random.nextInt(91) + 10;
        int[] a = getArrayOfRandomNumbers(size);
        int[] mm = findMaxAndMin(a);
        System.out.println("Min is:"+mm[0]+" Max is:"+mm[1] );
    }
}
