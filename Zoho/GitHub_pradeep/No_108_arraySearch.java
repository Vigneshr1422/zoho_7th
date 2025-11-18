package Zoho.GitHub_pradeep;

public class No_108_arraySearch {
        public static int search(int[] arr, int target) {
            int start = 0, end = arr.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] == target) return mid;

                // Left side sorted?
                if (arr[start] <= arr[mid]) {
                    if (target >= arr[start] && target < arr[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                } else { // Right side sorted
                    if (target > arr[mid] && target <= arr[end]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }

            return -1; // not found
        }

        public static void main(String[] args) {
            int[] arr = {23, 34, 45, 66, 1, 12};
            int target = 1;
            int idx = search(arr, target);
            System.out.println("Found at index: " + idx);
        }
    }


