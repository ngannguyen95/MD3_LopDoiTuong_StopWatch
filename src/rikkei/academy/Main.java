package rikkei.academy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int arr[] = new int[100000];

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        for (int i = 0; i < arr.length; i++) {
            arr[i]= (int) (Math.random()*10);
        }

//        sort(arr);
        stopWatch.end();
//        System.out.println(stopWatch);
        System.out.println("thoi gian chay de add 100000 so random la: " + stopWatch.getElapsedTime());
//        System.out.println(Arrays.toString(arr));

    }

//    public static int sort(int arr[]) {
//            int minIndex = arr[0];
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < arr[minIndex]) {
//                    minIndex = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[minIndex];
//            arr[minIndex] = temp;
//        }
//          return minIndex;
//    }
}