// Last updated: 04/10/2025, 22:48:29

public class Solution {
    public int maxArea(int[] height) {
       int maxarea=0;
      int l=0;
      int r=height.length-1;
      while(l<r)
      {
        int area=Math.min(height[l],height[r])*(r-l);
        maxarea=Math.max(area,maxarea);
        if(height[l]<height[r])
        {
            l++;
        }
        else
        {
            r--;
        }
      }return maxarea;
    }
}
