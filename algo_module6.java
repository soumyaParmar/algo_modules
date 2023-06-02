import java.util.*;

public class Main {
    private static void merge(int arr1[], int arr2[], int n , int m){     //Question 1
        int temp[] = new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(k < temp.length){
            while(i<n){
                temp[k++] = arr1[i++];
            }
            while(j<m){
                temp[k++] = arr2[j++];
            }
        }
        System.out.println("Merged elements are -> ");
        for(int arr : temp){
            System.out.print(arr+" ");
        }
        System.out.println();
    }
    private static boolean compare(int arr1[], int arr2[]){         //Question 2
        if(arr1.length != arr2.length) return false;

        int len = arr1.length;
        for(int i=0;i<len;i++){
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    private static void remove(int[] arr, int target){  // Question 3

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) arr[i]=0;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    private static void bubble_sort(int arr[],int n){    //Question 4 - bubble sort
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    private static void selection_sort(int arr[],int n){      //Question 4 - selection sort
        for(int i=0;i<n-1;i++){
            int min_idx = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    private static void insertion_sort(int arr[],int n){     //Question 4 - Insertion sort
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void reverse_sort(int arr[], int n){     //Question 5 - reverse sort
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    private static void kthLargest(int arr[], int k,int n){    //Question 6
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(arr[k-1]);
    }
    private static void kthsmallest(int arr[], int k,int n){   //Question 7
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(arr[k-1]);
    }
    private  static void rotate(int arr[],int n){   //Question 8
        int last = arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;

        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    private static void swap(int arr[],int n, int k){    //Question 9
        int temp = arr[k-1];
        arr[k-1] = arr[n-k];
        arr[n-k] = temp;

        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    private static boolean palindromic(int arr[],int n){
        int temp[] = new int[n];
        for(int i=n-1,j=0;i>=0;i--,j++){
            temp[j] = arr[i];
        }
        for(int i=0;i<n;i++){
            if(temp[i]!=arr[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length for 1st array -> ");
        int n = sc.nextInt();
        System.out.println("enter length for 2nd array -> ");
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        System.out.println("insert elements for 1st array");
        for(int i=0;i<n;i++) arr1[i] = sc.nextInt();

        System.out.println("insert elements for 2st array");
        for(int i=0;i<m;i++) arr2[i] = sc.nextInt();

        merge(arr1,arr2,n,m);
        boolean compare = compare(arr1,arr2);
        String s = (compare==true) ? "Both arrays are equal" : "Both arrays are not equal";
        System.out.println(s);
        System.out.println("Enter a number to b deleted from 1st array");
        int target = sc.nextInt();
        remove(arr1,target);
        System.out.println("Deleted successfully");

        System.out.println("Bubble sort on second array");
        bubble_sort(arr2,m);

        System.out.println("Selection sort on first array");
        selection_sort(arr1,n);

        System.out.println("Insertion sort on second array");
        insertion_sort(arr2,m);

        System.out.println("Reverse sort on first array");
        reverse_sort(arr1,n);

        System.out.println("Give kth element for largest");
        int k1 = sc.nextInt();
        System.out.println("Kth largest element is -> ");
        kthLargest(arr1,k1,n);

        System.out.println("Give kth element for smallest");
        int k2 = sc.nextInt();
        System.out.println("Kth smallest element is -> ");
        kthsmallest(arr1,k2,n);

        System.out.print("One time rotated array (2nd array)");
        rotate(arr2, m);

        System.out.print("Enter kth postion you want to swap -> ");
        int k3 = sc.nextInt();
        System.out.print("Swap kth position from start and end (array 2)");
        swap(arr2,m,k3);

        System.out.println("is arr2 a palindromic array, if yes then it is a PERFECT array ? ");
        String st = (palindromic(arr2,m)) ? "PERFECT" : "NOT PERFECT";
        System.out.print(st);
    }
}
