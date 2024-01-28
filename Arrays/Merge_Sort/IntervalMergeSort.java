package Arrays.Merge_Sort;

public class IntervalMergeSort {

    public static void main(String[] args) {
        int[][] intervals = {{5, 10}, {1, 12}, {3, 7}, {2, 6}, {8, 9}};

        System.out.println("Original Intervals: ");
        printIntervals(intervals);

        mergeSortIntervals(intervals, 0, intervals.length - 1);

        System.out.println("Sorted Intervals: ");
        printIntervals(intervals);
    }

    private static void mergeSortIntervals(int[][] intervals, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            mergeSortIntervals(intervals, left, middle);
            mergeSortIntervals(intervals, middle + 1, right);

            merge(intervals, left, middle, right);
        }
    }

    private static void merge(int[][] intervals, int left, int middle, int right) {
        int[][] leftArray = new int[middle - left + 1][2];
        int[][] rightArray = new int[right - middle][2];

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = intervals[left + i];
        }
        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = intervals[middle + 1 + i];
        }

        int leftIndex = 0, rightIndex = 0;
        int currentIndex = left;

        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftArray[leftIndex][0] < rightArray[rightIndex][0] ||
                    (leftArray[leftIndex][0] == rightArray[rightIndex][0] && leftArray[leftIndex][1] < rightArray[rightIndex][1])) {
                intervals[currentIndex] = leftArray[leftIndex];
                leftIndex++;
            } else {
                intervals[currentIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            currentIndex++;
        }

        while (leftIndex < leftArray.length) {
            intervals[currentIndex] = leftArray[leftIndex];
            leftIndex++;
            currentIndex++;
        }

        while (rightIndex < rightArray.length) {
            intervals[currentIndex] = rightArray[rightIndex];
            rightIndex++;
            currentIndex++;
        }
    }

    private static void printIntervals(int[][] intervals) {
        for (int[] interval : intervals) {
            System.out.print("[" + interval[0] + ", " + interval[1] + "] ");
        }
        System.out.println();
    }
}

