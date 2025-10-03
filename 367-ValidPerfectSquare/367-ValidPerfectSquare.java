// Last updated: 04/10/2025, 01:43:03
import java.util.*;
class Solution {
    public boolean isPerfectSquare(int x) {
        int s =(int)Math.sqrt(x);
        if(s*s==x)
        {
            return true;
        }
        return false;
    }
}