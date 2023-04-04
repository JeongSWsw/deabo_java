import java.util.Arrays;
import java.util.stream.Collectors;

public class QuickSort{
    public static void main(String[] args) {
        int[] arr = {50, 20, 80, 40, 10, 70, 90, 30, 100, 10, 40, 60, 80, 10, 20, 30};

        sort(arr);
        System.out.println(
                Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }



    public static void sort(int[] arr) {  //초기 시작
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(int[] arr, int start, int end) {

        if (start >= end) { // 재귀함수 종료 조건
            return;
        }

        int p = partition(arr, start, end);

        sort(arr, start, p - 1);
        sort(arr, p + 1, end);
    }

    private static int partition(int[] arr, int start, int end) {

        int pivot = arr[start];
        int low = start + 1;
        int high = end;

        while (low <= high) { // low , high 순서가 바뀌기 전까지
            while (low <= end && arr[low] <= pivot) { // low가 high보다 
                low++;
            }

            while (high > start && arr[high] >= pivot) {
                high--;
            }

            if (low < high) {
                swap(arr, low, high);
            }
        }
        // low, high 순서가 바뀐 경우 
        // 피벗과 high를 swap
        swap(arr, start, high);

        return high;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}