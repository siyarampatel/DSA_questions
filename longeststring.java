// https://codeforces.com/problemset/problem/71/A
// apple
// a3e
// banana
// b4a
import java.util.*;
class longeststring{
    static String solve(String word,String result){
        char [] ar = word.toCharArray();
        int size = word.length();
        int num = size-2;
        String result[0]=ar[0];
        String result[1]=num;
        String result[2]=ar[size-1];
        return result;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String result="";
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            String word = sc.nextLine();
        }
    }
}