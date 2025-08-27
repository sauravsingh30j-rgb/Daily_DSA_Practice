// Last updated: 27/08/2025, 23:21:19
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landTaskDuration, int[] waterStartTime,
            int[] waterTaskDuration) {

        int earliestOverallFinishTime = Integer.MAX_VALUE;

        for (int landIndex = 0; landIndex < landStartTime.length; landIndex++) {
            for (int waterIndex = 0; waterIndex < waterStartTime.length; waterIndex++) {

               
                

                int landTaskEndTime = landStartTime[landIndex] + landTaskDuration[landIndex];
                int waterTaskStartAfterLand = Math.max(landTaskEndTime, waterStartTime[waterIndex]);
                int finishTimeLandThenWater = waterTaskStartAfterLand + waterTaskDuration[waterIndex];
                int waterTaskEndTime = waterStartTime[waterIndex] + waterTaskDuration[waterIndex];
                int landTaskStartAfterWater = Math.max(waterTaskEndTime, landStartTime[landIndex]);
                int finishTimeWaterThenLand = landTaskStartAfterWater + landTaskDuration[landIndex];

                int earlierFinish = Math.min(finishTimeWaterThenLand, finishTimeLandThenWater);
                earliestOverallFinishTime = Math.min(earliestOverallFinishTime, earlierFinish);
            }
        }

        return earliestOverallFinishTime;
    }
}