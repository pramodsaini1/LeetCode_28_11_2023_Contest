public class stringitsreverse {
    public boolean isSubstringPresent(String s) {
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev +=s.charAt(i);
        }
        for(int i=0;i<s.length()-1;i++){
             String sub=s.substring(i,i+2);
            for(int j=0;j<rev.length()-1;j++){
                if(rev.substring(j,j+2).startsWith(sub)){
                    return true;
                }
            }
        }
        return false;
         
    }
}
/*
 * Given a string s, find any substring of length 2 which is also present in the reverse of s.

Return true if such a substring exists, and false otherwise.

 

Example 1:

Input: s = "leetcode"

Output: true

Explanation: Substring "ee" is of length 2 which is also present in reverse(s) == "edocteel".

Example 2:

Input: s = "abcba"

Output: true

Explanation: All of the substrings of length 2 "ab", "bc", "cb", "ba" are also present in reverse(s) == "abcba".

Example 3:

Input: s = "abcd"

Output: false

Explanation: There is no substring of length 2 in s, which is also present in the reverse of s.
 */
