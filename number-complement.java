// https://leetcode.com/problems/number-complement/
class Solution {
   // tc -> 1,since we're doing not more than 32 iterations here, sc-> 1
   public int findComplement(int num) {
       int temp = num;
       int bit = 1;
       while(temp > 0){
           num = num^bit;
           bit = bit << 1;
           temp = temp >> 1;
       }
       return num;
   }
}
