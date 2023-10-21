import java.util.*;

class ArrayShuffle {

    public static void shuffle(int arr[]){
        int n = arr.length;

        Random rnd = new Random();

        for(int i=n-1; i>0; i--){
            int r = rnd.nextInt(i+1);
            int temp =arr[i];
            arr[i] = arr[r];
            arr[r] = temp;
            
        }
        
    }
    
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        
        shuffle(arr);

        System.out.print(Arrays.toString(arr));
    }

}