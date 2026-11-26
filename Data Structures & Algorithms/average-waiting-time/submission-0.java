class Solution {
    public double averageWaitingTime(int[][] customers) {
        long currentTime = 0;
        long totalWait = 0;

        for (int[] customer : customers) {
            int arrival = customer[0];
            int prepTime = customer[1];

            if (currentTime < arrival) {
                currentTime = arrival;
            }

            currentTime += prepTime;
            totalWait += currentTime - arrival;
        }
        return (double) totalWait / customers.length;
    }
}