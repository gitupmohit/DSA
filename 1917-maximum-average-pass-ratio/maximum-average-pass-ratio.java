import java.util.*;

class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        // Max heap based on "gain" of adding one student
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));

        for (int i = 0; i < classes.length; i++) {
            int pass = classes[i][0];
            int total = classes[i][1];
            double gain = calcGain(pass, total);
            pq.add(new double[]{gain, i, pass, total});
        }

        // Assign extra students one by one
        for (int k = 0; k < extraStudents; k++) {
            double[] top = pq.poll();
            int pass = (int) top[2];
            int total = (int) top[3];

            pass++;
            total++;
            double gain = calcGain(pass, total);

            pq.add(new double[]{gain, top[1], pass, total});
        }

        // Compute final average
        double sum = 0.0;
        while (!pq.isEmpty()) {
            double[] cur = pq.poll();
            int pass = (int) cur[2];
            int total = (int) cur[3];
            sum += (double) pass / total;
        }

        return sum / classes.length;
    }

    private double calcGain(int pass, int total) {
        return (double)(pass + 1) / (total + 1) - (double)pass / total;
    }
}
