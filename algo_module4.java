import java.util.*;

public class Main {

    private static void maxMin(int arr[],int min, int max){ //question 1 and 2

        for(int i : arr){
            if(i>max) max = i;
            if(i<min) min = i;
        }
        System.out.println("Maximum -> "+max);
        System.out.println("Minimum -> "+min);
    }

    private static int difference(int min , int max){  //question 3
        return max - min;
    }
    private static void reverse(int[] arr , int n){    //question 4
        for(int i=n-1;i>=0;i--){
           System.out.print(arr[i] + " ");
        }
    }
    private static void frequency(int[] arr, int n){    //question 5
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
           System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
    private static void copy_array(int arr[],int n){   // question 6
        int temp[] = new int[n];
        for(int i=0;i<n;i++){
            temp[i] = arr[i];
        }
        System.out.println("This is a copy array");
        for(int i : temp){
            System.out.print(i + " ");
        }
    }
    private static void fabo_series(int till){   //question 7
        int first = 0;
        int second = 1;
        till = till-1;
        System.out.print( first + " " + second +" ");
        while(till>0){
            int ans = first + second;
            System.out.print(ans+" ");
            first = second;
            second = ans;
            till--;
        }
    }
    private static int fabo_number(int num){     //Question 8
       // if(num==0) return 0;
        if(num<=1) return 1;

        return fabo_number(num-1) + fabo_number(num-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        maxMin(arr,min,max);
        int diff = difference(min,max);
        System.out.println("Difference in min and max is ->"+diff);

        reverse(arr,n);

        System.out.println("Frequency of every element");
        frequency(arr,n);
        copy_array(arr,n);

        System.out.println();
        System.out.println("Enter number for fabonacci series ->");
        int till = sc.nextInt();
        fabo_series(till);
        System.out.println();
        System.out.print("Enter which fabonacci number you want to see->");
        int num = sc.nextInt();
        num = num-1;
        int fabNumber = fabo_number(num);
        System.out.print(fabNumber);

        System.out.println();                               // Question 9
        System.out.print("Give a Number for pattern -> ");
        int pattern_size = sc.nextInt();
        for(int i=1;i<=pattern_size;i++){
            for(int j=2;j<=i;j++){
                System.out.print("  ");
            }
            for(int k=pattern_size;k>=i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();                              //Question 10
        System.out.print("Give a Number for pattern -> ");
        int pattern_size2 = sc.nextInt();
        for(int i=1;i<=pattern_size2;i++){
            for(int j=2*(pattern_size2-i);j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
