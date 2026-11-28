package main.java.tutorial16.exercise05dailytemperatures;

public class DailyTemperatures {

    public static int[] warmerDays(int[] temperatures) {

        if (temperatures == null) {
            throw new IllegalArgumentException("Temperatures cannot be null.");
        }

        int n = temperatures.length;

        int[] result = new int[n];

        Stack stack = new Stack(n);

        // Traverse the temperatures from right to left.
        for (int i = n - 1; i >= 0; i--) {

            // Remove days that are not warmer than today.
            while (!stack.isEmpty()
                    && temperatures[stack.top()] <= temperatures[i]) {

                stack.pop();
            }

            // If no warmer day exists, store 0.
            if (stack.isEmpty()) {
                result[i] = 0;
            } else {

                // Calculate the number of days to wait.
                result[i] = stack.top() - i;
            }

            // Store today's index.
            stack.push(i);
        }

        return result;
    }
}