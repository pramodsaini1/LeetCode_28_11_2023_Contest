public class countsubstring {
    public long countSubstrings(String s, char c) {
        long count=1;
        long n=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                n++;
            }
        }
        int r=2;
        if(n==1){
            return 1;
        }
        for(int i=1;i<=r;i++){
            count = count * (n-r+i)/i;
        }
        return count + n;
        
    }
}
/*
 * You are given a string s and a character c. Return the total number of substrings of s that start and end with c.

 

Example 1:

Input: s = "abada", c = "a"

Output: 6

Explanation: Substrings starting and ending with "a" are: "abada", "abada", "abada", "abada", "abada", "abada".

Example 2:

Input: s = "zzz", c = "z"

Output: 6

Explanation: There are a total of 6 substrings in s and all start and end with "z".
 */
