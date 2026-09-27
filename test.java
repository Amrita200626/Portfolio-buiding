import java.util.Scanner;

public class prog1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter element"+(i+1)+":");
            arr[i] = scan.nextInt();
        }
        int largest = arr[0];
        for(int i = 1; i<n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.print("Largest is: "+largest);
    }
}