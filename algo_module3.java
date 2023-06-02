import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    /*
    //print coedify with for loop

    String str = "Hello CoEdify";
     for(int i=0;i<5;i++){
         System.out.println(str);
      }
     */

      /*  //print coedify with while loop

        String str = "Hello CoEdify";
        int i=5;
        while(i-->0) {
            System.out.println(str);
        }

       */

       /* //print pattern 1

        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        */

       /* //print pattern 2

        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("# ");
            }
            System.out.println();
        }

        */

       /* //print pattern 3

        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("# ");
            }
            System.out.println();
        }

        */

        /* //prime number using brute force

        int n = sc.nextInt();
        boolean flag = false;
        for(int i=2;i<n;i++){
            if(n%i==0) flag = true;
        }
        if(flag == false)
            System.out.print("prime number");
        else System.out.print("Not a prime");

         */

      /*  //print array

        System.out.println("Numbers of array you want");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Insert arrays");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i : arr){
            System.out.print(i+" ");
        }

       */

       /* //search in non-sorted array
        System.out.println("Numbers of array you want");
        int n = sc.nextInt();
        System.out.println("Target you want to find");
        int target = sc.nextInt();
        int arr[] = new int[n];
        boolean flag = false;
        System.out.println("Insert arrays");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]==target) flag = true;
        }
        System.out.print(flag);

        */
       /* //Binary search

        System.out.println("Numbers of array you want");
        int n = sc.nextInt();
        System.out.println("Target you want to find");
        int target = sc.nextInt();
        int arr[] = new int[n];
        boolean flag = false;
        System.out.println("Insert arrays");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       flag = found(arr,target,n);
        System.out.print(flag);
    }
    static boolean found(int[] arr, int target, int n){
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return true;
            else if (arr[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return false;

        */
    }

}
