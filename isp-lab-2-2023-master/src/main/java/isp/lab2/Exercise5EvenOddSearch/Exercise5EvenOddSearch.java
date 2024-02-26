package isp.lab2.Exercise5EvenOddSearch;

public class Exercise5EvenOddSearch {

    public static int[] findEvenOdd(String input) {
    
    String[] tokens = input.split(",");
    int[] array = new int[10];
    int i = 0;
    for (String token : tokens) {
        int number = Integer.parseInt(token);
        array[i] = number;
        i++;
    }
    
    int n = array.length;
   
    int[] arraymaxmin = new int[4];
    int max = array[0];
    int min = array[0];
    int maxposition = 0;
    int minposition = 0;
    for(i = 0; i < n; i++){
        if(array[i]%2==0 && array[i]>max){
            max = array[i];
            maxposition = i;
        }
        if(array[i]%2==1 && array[i]<min){
            min = array[i];
            minposition = i;
        }
    }
    arraymaxmin[0] = max;
    arraymaxmin[1] = maxposition;
    arraymaxmin[2] = min;
    arraymaxmin[3] = minposition;
    return arraymaxmin;
    }

    public static void main(String[] args) {
        String input = "1,2,3,4,5,6,7,8,9,10";
        int[] result = findEvenOdd(input);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
