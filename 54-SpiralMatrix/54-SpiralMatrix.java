// Last updated: 04/10/2025, 01:45:57
class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer> a=new ArrayList<>();
        int top=0;
int bottom =arr.length-1;
int left=0;
int right=arr[0].length-1;
while(left<=right && top<=bottom)
{
	for(int i=left;i<=right;i++)
{
	a.add(arr[top][i]);
}top++;
for(int i=top;i<=bottom;i++)
{
	a.add(arr[i][right]);
}right--;
 if (top <= bottom) {
for(int i=right;i>=left;i--)
{
	a.add(arr[bottom][i]);
}bottom--;}

if (left <= right) {
for(int i=bottom;i>=top;i--)
{
	a.add(arr[i][left]);
}left++;}}

return a;
    }
}