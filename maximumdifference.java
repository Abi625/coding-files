import java.util.*;
public class maximumdiff{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int diff = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]-arr[i]>diff){
                    diff=arr[j]-arr[i];
                }
               
                    
                
            }
        }
        System.out.print(diff);
    }
}
