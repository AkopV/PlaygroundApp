package com.vardanian.longestsublist;

public class LongestSubList {

    private class Pair {
        public int a;
        public int b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public Pair[] longestSubList(Pair[] input) {
        int start = 0;
        int maxSorted = input[0].b;
        int minSorted = input[0].b;

        int bestStart = 0;
        int bestEnd = 0;

        for (int i = 1; i < input.length; i++) {
            if (input[i].a < input[i - 1].a) {
                start = i;
                maxSorted = input[i].b;
            } else {
                maxSorted -= input[i].b;
            }
            if (maxSorted < minSorted) {
                minSorted = maxSorted;
                bestStart = start;
                bestEnd = i;
            }
        }

        Pair[] out = new Pair[bestEnd - bestStart + 1];
        System.arraycopy(input, bestStart, out, 0, bestEnd - bestStart + 1);
        return out;
    }

    public static void main(String args[]) {
        LongestSubList subList = new LongestSubList();
        Pair[] input = new Pair[5];
        input[0] = subList.new Pair(1, 4);
        input[1] = subList.new Pair(2, 5);
        input[2] = subList.new Pair(7, 3);
        input[3] = subList.new Pair(4, 6);
        input[4] = subList.new Pair(7, 7);
        Pair[] out = subList.longestSubList(input);
        System.out.println("input:");
        display(input);
        System.out.println("output: ");
        display(out);
    }

    private static void display(Pair[] out) {
        for(int i =0;i<out.length;i++){
            System.out.print("(" + out[i].a+ ", " + out[i].b + ") ");
        }
        System.out.println();
    }
}