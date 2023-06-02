import java.util.*;
import java.lang.*;

public class Main {
    private static String reverseString(String str){
        StringBuilder st = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            st.append(str.charAt(i));
        }
        return st.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                   //Question 1
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("Enter a String");   //Question 2
        String str = sc.next();
        System.out.println(str);

        System.out.println("Length of the string is -> "+str.length());  //Question 3
        System.out.println("Give a String to reverse it -> ");           //question 4
        String s = sc.next();
        String st =  reverseString(s);
        System.out.println(st);

        System.out.println("Enter a string");  //Question 5
        String vStr = sc.next();
        int vowel = 0;
        int consonants = 0;
        for(int i=0;i<vStr.length();i++){
            if(vStr.charAt(i)=='a' || vStr.charAt(i)=='A') vowel++;
            else if(vStr.charAt(i)=='e' || vStr.charAt(i)=='E') vowel++;
            else if(vStr.charAt(i)=='i' || vStr.charAt(i)=='I') vowel++;
            else if(vStr.charAt(i)=='o' || vStr.charAt(i)=='O') vowel++;
            else if(vStr.charAt(i)=='u' || vStr.charAt(i)=='U') vowel++;
            else consonants++;
        }
        System.out.println("Vowels ->" + vowel);
        System.out.println("Consonants ->" + consonants);

        int arr[] = {10,20,4 ,99,19};

        System.out.println("Second maximum");  // Question 6
        int max = Integer.MIN_VALUE;
        int prev = 0;
        for(int i : arr){
            if(i>max){
                prev = max;
                max = i;
            }
        }
        System.out.println("Second greater element -> "+prev);  // Question 7

        System.out.println("Second Minimum");
        int min = Integer.MAX_VALUE;
        int prev1 = 0;
        for(int i : arr){
            if(min>i){
                prev1 = min;
                min = i;
            }
        }
        System.out.println("Second smallest element -> "+prev1);

        int sum = 0;                   //Question 8
        for(int i : arr){
          sum += i;
        }
        int avg = 0;
        avg = sum/ arr.length;
        System.out.println("Average -> " + avg);

        int ans = sum - (min+max);
        System.out.println("Average of numbers except smaller and larger -> "+ ans/ (arr.length-2));

        System.out.println("Enter a number ->");     //Question 10;
        int num = sc.nextInt();
        if(num%2 == 0) System.out.print("It is a Even Number");
        else System.out.print("It is a odd number");

    }
}
