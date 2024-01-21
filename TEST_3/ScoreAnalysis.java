package TEST_3;

import java.util.Arrays;

public class ScoreAnalysis {

    public static void main(String[] args) {
        // Test cases for analyzeScores
        analyzeScores(new int[]{70, 50, 80, 90, 60});
        analyzeScores(new int[]{85, 100, 92, 96, 88, 99});
    }

    // Method to implement
    public static void analyzeScores(int[] scores) {
        // TODO: Implement the selection sort to sort the array
        selectionSort(scores, scores.length);
        // TODO: Calculate and print the range of scores
        System.out.println("Array= " + Arrays.toString(scores));
        range(scores);
        // TODO: Calculate and print the median score
        median(scores, scores.length - 1);
    }


    private static void range(int[] scores) {
        int minScore = scores[0];
        int maxScore = scores[scores.length - 1];

        int range = maxScore - minScore;
        System.out.println("Range is = " + range);
    }

    private static void median(int[] scores, int maxScore) {
        int minScore = scores[0];
        int median = (minScore + maxScore) / 2;
        System.out.println("Median " + median);

    }

    private static void selectionSort(int[] scores, int length) {
        for (int i = 0; i < length; i++) {
            int mIdx = i;
            for (int j = i + 1; j < length; j++) {
                if (scores[mIdx] > scores[j]) {
                    mIdx = j;
                }
            }
            swap(scores, mIdx, i);
        }
    }

    private static void swap(int[] scores, int mIdx, int i) {
        int temp = scores[mIdx];
        scores[mIdx] = scores[i];
        scores[i] = temp;
    }
}

