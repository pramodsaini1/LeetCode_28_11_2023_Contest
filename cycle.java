public class cycle {
    public boolean areSimilar(int[][] mat, int k) {
        int dupli[][]=mat;
       int len=mat.length;
       int len1=mat[0].length;
       int fin[][]=new int[len][len1];
       int fin2[][]=new int[len][len1];
       
       for(int i=0;i<len;i++){
           if(i%2==0){
               int arr[]=new int[len1];
               for(int j=0;j<len1;j++){
                   arr[j]=mat[i][j];
               }
               int kt=k;
               while(kt>0){
                   int last=arr[0];
                   for(int p=1;p<len1;p++){
                       arr[p-1]=arr[p];
                   }
                   arr[len1-1]=last;
                   kt--;
               }
               fin[i]=arr;
           }
           else{
               int arr[]=new int [len1];
               for(int j=0;j<len1;j++){
                   arr[j]=mat[i][j];
               }
               int kt=k;
               while(kt>0){
                   int last=arr[len1-1];
                   for(int p=len1-2;p>=0;p--){
                       arr[p+1]=arr[p];
                   }
                   arr[0]=last;
                   kt--;
               }
               fin[i]=arr;
               
               
           }
       }
       boolean ans=true;
       for(int i=0;i<len;i++){
           for(int j=0;j<len1;j++){
               if(mat[i][j]!=fin[i][j]){
                   ans=false;
               }
           }
       }
       return ans;
   }
}
/*
 * You are given a 0-indexed m x n integer matrix mat and an integer k. You have to cyclically right shift odd indexed rows k times and cyclically left shift even indexed rows k times.

Return true if the initial and final matrix are exactly the same and false otherwise.

 

Example 1:

Input: mat = [[1,2,1,2],[5,5,5,5],[6,3,6,3]], k = 2
Output: true
Explanation:


Initially, the matrix looks like the first figure. 
Second figure represents the state of the matrix after one right and left cyclic shifts to even and odd indexed rows.
Third figure is the final state of the matrix after two cyclic shifts which is similar to the initial matrix.
Therefore, return true.
Example 2:

Input: mat = [[2,2],[2,2]], k = 3
Output: true
Explanation: As all the values are equal in the matrix, even after performing cyclic shifts the matrix will remain the same. Therefeore, we return true.
Example 3:

Input: mat = [[1,2]], k = 1
Output: false
Explanation: After one cyclic shift, mat = [[2,1]] which is not equal to the initial matrix. Therefore we return false.
 

Constraints:

1 <= mat.length <= 25
1 <= mat[i].length <= 25
1 <= mat[i][j] <= 25
1 <= k <= 50
 */
