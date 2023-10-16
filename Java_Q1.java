import java.util.*;

public class Java_Q1{
    static void random(int array[],int n){
        Random r = new Random();
        for(int i=n-1;i>0;i--){
            int j=r.nextInt(i+1);
            System.out.println(j);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int n = array.length;
        random(array,n);
    }
}