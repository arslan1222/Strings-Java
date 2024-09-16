import java.util.*;
public class Strings{  // Strings are IMMUTABLE // Strings can't change in java

    /* Palindrome
    public static boolean palindrome(String str){
        int n = str.length();
        boolean pol = false;
        for(int i=0; i<n/2; i++){
                if(str.charAt(i) != str.charAt(n-1-i)){
                    return false;
                }
        }
        return true;
    }
    */
    /*
    find Shortest  path
    public static float shortestPath(String path){
        int x = 0;
        int y = 0;

        for(int i=0; i<path.length(); i++){
            char direstion = path.charAt(i);

            if(direstion == 'E'){
                x++;
            } 
            else if(direstion == 'W'){
                x--;
            }
            else if(direstion == 'N'){
                y++;
            }
            else {
                y--;
            }
        }
        int X2 = x * x; // x square
        int Y2 = y * y; // y square

        return (float)(Math.sqrt(X2 + Y2));
    } 
    */
    /* Substring
    public static String subString(String substring, int si, int ei){
        String str = "";
        for(int i=si; i<ei; i++){
            str += substring.charAt(i);
        }
        return str;
    }
    */
    public static void main(String args[]){
        char arr[] = {'a','b','c','d'};
        // String str = "abcde";  // String is a class

        /*
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();  // We use nextLine() that take full line
        System.out.print(name);
        */

        // String name = "Arslan Haider";
        // System.out.println(name.length());

        /* Cancatinate
        String firstname = "Arslan";
        String secondname = "Haider";
        String fullname = firstname + " " + secondname;
        System.out.println(fullname);
        System.out.println(fullname.charAt(4));
        */
        /* Palindrome
        String str = "racecar";
        System.out.print(palindrome(str));
        */
        /* Shortes Path
        String path = "WNEESNWE";
        System.out.print(shortestPath(path));
        */
        /*
        String str1 = "Arslan";
        String str2 = "Arslan"; // In the memory the str2 is pointed to str1 like point to "Arslan" in memory

        String str3 = new String("Arlsan");

        if(str1 == str3){
            System.out.println("String 1 and string 2 are equal");
        }else {
            System.out.println("String 1 and string 2 are not equal");
        }

        if(str1 == str3){
            System.out.println("String 1 and string 2 are equal");
        }else {
            System.out.println("String 1 and string 2 are not equal");
        }
        */
        /* SubString
        String substring = "Hello World";
        // System.out.println(subString(substring, 2, 5));
        System.out.println(substring.substring(6, 11));
        */
        /* Lexicographic order
        String fruits[] = {"apple", "orange", "mango"};
        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
        */

        StringBuilder sb = new StringBuilder("");

        for(char ch='a'; ch<='z'; ch++){  // T.C O(26)
            sb.append(ch);
        }
        System.out.print(sb);

       


    }
};