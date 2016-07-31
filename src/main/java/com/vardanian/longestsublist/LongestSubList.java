package com.vardanian.longestsublist;

import java.util.ArrayList;

public class LongestSubList {

    public ArrayList<int[]> getLongestSubList(int[][] array) {

        ArrayList<int[]> inputSubList = new ArrayList<int[]>();
        ArrayList<int[]> outputSubList = new ArrayList<int[]>();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array[i].length-1; j++) {
                if (array[i][j] < array[i + 1][j] &&
                        array[i][j + 1] > array[i + 1][j + 1]) {
                    if (!inputSubList.contains(array[i])) {
                        inputSubList.add(array[i]);
                    }
                } else {
                    inputSubList.add(array[i]);
                    if (inputSubList.size() > outputSubList.size()) {
                        outputSubList.clear();
                        outputSubList.addAll(inputSubList);
                        inputSubList.clear();
                    }
                    break;
                }
            }
        }
        return outputSubList;
    }

    public  void printList(ArrayList<int[]> list) {

        for (int[] arr : list) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        LongestSubList longestSubList = new LongestSubList();

        int[][] arr = {
                {1, 4},
                {2, 5},
                {7, 3},
                {4, 6},
                {7, 7}
        };

        ArrayList<int[]> list = new ArrayList<int[]>();
        System.out.println("The longest sub-list that has the pairs sorted by the first entry in ascending order by the second in descending order: ");
        list = longestSubList.getLongestSubList(arr);
        longestSubList.printList(list);

    }
}