// Last updated: 04/10/2025, 01:45:04
class Solution {
    public List<Integer> getRow(int n) {
      List<List<Integer>> a= new ArrayList<>();
      for(int i=0;i<=n;i++)
      {
         List<Integer> b= new ArrayList<>();
          for(int j=0;j<=i;j++)
          {
            if(j==0|| j==i)
            {
                b.add(1);
            }
            else
            {
              b.add(a.get(i-1).get(j-1)+a.get(i-1).get(j));
            }
          }
          a.add(b);
      }
      return a.get(n);
    }
}
    