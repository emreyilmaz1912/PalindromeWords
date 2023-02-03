import java.util.Scanner;

public class Main {
    private static String word(){
        Scanner input = new Scanner(System.in);
        System.out.print("Palindrome kelimeyi kontrol etmek için bir kelime giriniz :");
        return input.next();
    }
    private static boolean isPalindrome(String str){
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    private static String printOf(){
        if (isPalindrome(word())){
            System.out.println(word() + " Palindrome bir kelimedir!");
        }else if (!isPalindrome(word()))
            System.out.println(word() + " Palindrome bir kelime değildir!");
        return null;
    }

    public static void main(String[] args) {
        System.out.println(printOf());
    }
}