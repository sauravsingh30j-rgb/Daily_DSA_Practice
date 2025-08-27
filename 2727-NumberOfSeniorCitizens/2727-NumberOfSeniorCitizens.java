// Last updated: 27/08/2025, 23:21:31
class Solution {
    public int countSeniors(String[] arr) {
        int c=0;
        for (int i=0;i<arr.length;i++)
        {String s="";
          s=s+arr[i].charAt(11);
           s=s+arr[i].charAt(12);
           int age=Integer.parseInt(s);
           if(age >60)
           {
            c++;
           }
        }
     return c;

    }

}