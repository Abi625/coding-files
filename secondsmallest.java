import java.util.*;
public class secondsmallest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         int min=Integer.MAX_VALUE;
         int secondmin=Integer.MAX_VALUE;
         for(int i=0;i<n;i++){
            if(arr[i]<min){
                secondmin=min;
                min=arr[i];
                
            }
            else if(arr[i]<secondmin && arr[i]>min){
                secondmin=arr[i];
            }
         }
         System.out.print(secondmin);
    }
}
