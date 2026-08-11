import java.util.*;
public class missingelement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n-1];
       
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        int actualsum =0;
       
        for(int i=0;i<n-1;i++){
            actualsum+=arr[i];

        }
        int expectedsum=n*(n+1)/2;
        int missingelement=expectedsum-actualsum;
        System.out.print(missingelement);
    }
}
