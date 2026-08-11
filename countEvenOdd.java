import java.util.Scanner;

public class countEvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        countEvenOdd(arr, n);
    }

    static void countEvenOdd(int arr[], int n) {

        int even = 0;
        int odd = 0;

        for(int i = 0; i < n; i++) {

            if(arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }

    
}


