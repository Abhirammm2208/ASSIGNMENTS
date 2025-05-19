/*Problem Statement

Given a string s, return the longest palindromic substring in s.

Input format :
The input consists of a single line containing a string S.

Output format :
The output prints a single line containing the longest palindromic substring of the input string.

If there are multiple substrings of the same maximum length, output any one of them.

Refer to the sample output for the formatting specifications.

Code constraints :
In this scenario, the given test cases will fall under the following constraints:

1 ≤ S ≤ 50.

S consists of only digits and English letters.

Sample test cases :
Input 1 :
forgeeksskeegfor
Output 1 :
geeksskeeg
Input 2 :
aaaabbaa
Output 2 :
aabbaa
Input 3 :
Geeks
Output 3 :
ee
Input 4 :
acacacb
Output 4 :
cacac*/

import java.util.Scanner;

class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome(s));
        scanner.close();
    }
}
