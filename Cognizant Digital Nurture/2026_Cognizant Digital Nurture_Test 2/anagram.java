import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        String original1 = str1;
        String original2 = str2;
        
        str1 = toLowerCase(str1);
        str2 = toLowerCase(str2);
        
        str1 = removeSpaces(str1);
        str2 = removeSpaces(str2);
        
        if (areAnagrams(str1, str2)) {
            System.out.println(original1 + " and " + original2 + " are anagrams");
        } else {
            System.out.println(original1 + " and " + original2 + " are not anagrams");
        }
    }
    
    public static String toLowerCase(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                chars[i] = (char) (c + 32); 
            } else {
                chars[i] = c;
            }
        }
        return new String(chars);
    }
    
    public static String removeSpaces(String str) {
        char[] chars = str.toCharArray();
        int count = 0;
        
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                count++;
            }
        }
        
        char[] result = new char[count];
        int index = 0;
        
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                result[index++] = chars[i];
            }
        }
        
        return new String(result);
    }
    
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        int[] charCount = new int[26]; 
        
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < str2.length(); i++) {
            charCount[str2.charAt(i) - 'a']--;
        }
        
        for (int i = 0; i < 26; i++) {
            if (charCount[i] != 0) {
                return false;
            }
        }
        
        return true;
    }
}