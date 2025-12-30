public class FitnessChallengeTracker {

    public static void main(String[] args) {

        // 0 indicates rest day
        int[] pushUps = {30, 0, 25, 40, 0, 35, 20};

        int totalPushUps = 0;
        int activeDays = 0;

        // for-each loop
        for (int count : pushUps) {

            // Skip rest days
            if (count == 0) {
                continue;
            }

            totalPushUps += count;
            activeDays++;
        }

        double average = (activeDays > 0)
                ? (double) totalPushUps / activeDays
                : 0;

        System.out.println("Total Push-ups: " + totalPushUps);
        System.out.println("Active Days: " + activeDays);
        System.out.println("Average Push-ups per Day: " + average);
    }
}
