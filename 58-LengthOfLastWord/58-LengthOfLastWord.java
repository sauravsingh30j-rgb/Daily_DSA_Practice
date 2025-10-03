// Last updated: 04/10/2025, 01:45:55
class Solution 
{
    public int lengthOfLastWord(String s) 
    {
    String[] arr = s.split(" ");
    int l=arr[arr.length-1].length();
    return l;   
    }
}