// Last updated: 04/10/2025, 01:45:27

import java.util.*; 
class Solution { 
    public List<Integer> grayCode(int n) { 
        ArrayList<Integer> a = new ArrayList<>(); 
        double m = (Math.pow(2, n)); 
        for (int i = 0; i < m; i++) { 
            a.add(i ^ (i >> 1)); 
        } 
        return a; 
    } 
}
