import java.util.Scanner;

public class Solution {
    public static String starMaker (int n){
        String tri = "";
        int k = 0;
        while(k < n){
            for(int i = 0; i <= k; i++){
                tri +="*";    
            }
            tri += "\n";
            k++;
            }
        return tri;
        }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(starMaker(n));
    }
}