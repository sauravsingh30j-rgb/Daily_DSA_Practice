// Last updated: 04/10/2025, 01:43:44
import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        Boolean ans = false;
        String [] arr=s.split("");
         String [] arr1=t.split("");
         Arrays.sort(arr);
        Arrays.sort(arr1);
        return Arrays.equals(arr,arr1);
        
    }
}