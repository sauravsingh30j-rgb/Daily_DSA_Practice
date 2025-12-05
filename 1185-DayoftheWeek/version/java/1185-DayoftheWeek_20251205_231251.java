// Last updated: 05/12/2025, 23:12:51
1class Solution {
2    public String dayOfTheWeek(int day, int month, int year) {
3        String[] daY = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
4        int[] daysOfMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
5        if( leapYear(year) ){
6            daysOfMonth[2] = 29; // Feb has 29 days if it is a leap year
7        }
8        int daysOfYear = 4; //31st December 1970 is Thursday, so intialize as 4
9
10        //Add the days of the previous years
11        for( int i = 1971 ; i < year ; i++){
12            if( leapYear(i)){
13                daysOfYear += 366;
14            }else{
15                daysOfYear += 365;
16            }
17        }
18        //Add the days of the previous months
19        for( int i = 1 ; i < month ; i++){
20            daysOfYear += daysOfMonth[i];
21        }
22        daysOfYear += day; //Add the current day
23        return daY[daysOfYear % 7]; //Modulo divide by 7 to find odd days
24    }
25    private boolean leapYear(int year){
26        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
27            return true;
28        return false; 
29    }
30}