// Last updated: 05/06/2026, 00:10:49
1class Solution {
2    public int dayOfYear(String date) {
3        String[] parts=date.split("-");
4
5        int year=Integer.parseInt(parts[0]);
6        int month=Integer.parseInt(parts[1]);
7        int day=Integer.parseInt(parts[2]);
8        
9        int daysbeforemonth[]={ 0,31, 59, 90, 120,  151, 181, 212, 243, 273,  304,   334 };
10
11        int totaldays=daysbeforemonth[month-1]+day;
12        if( year % 4==0 && year % 100 !=0 || year % 400 ==0)
13        {
14            if(month>2) totaldays+=1;
15        }
16
17        return totaldays;
18        
19    }
20}