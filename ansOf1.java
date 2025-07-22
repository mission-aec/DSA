
import java.util.Scanner;

public class ansOf1{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in); 
        //System.out.println("number of Integers N = ");
        int n;
        
        int arr[] = {1,5,7,-1,5,4,2,4};
        int target = 5;

        /*
        n = inp.nextInt();
        arr[] = new int[n];
        System.out.println("Enter The "+n+"Integers");
        for(int i=0; i<n; i++){
            arr[i]=inp.nextInt();
        }

        System.out.println("Enter the Target value: ");
        int target = inp.nextInt();*/

        System.out.println("Number of pairs are "+cPair(arr, target));
    }

    static int cPair(int array[],int target){
        int count = 0;
        for(int i=0; i<array.length;i++){
            for(int j=i+1       ; j<array.length;j++){
                if(array[i]+array[j]==target) count++;
            }
        }
        return count;
    }
}