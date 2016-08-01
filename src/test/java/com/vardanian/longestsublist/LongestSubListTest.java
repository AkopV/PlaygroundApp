package com.vardanian.longestsublist;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.assertEquals;

public class LongestSubListTest {

    LongestSubList longestSubList;

    @BeforeTest
    public void setUp() {
        longestSubList = new LongestSubList();
    }

    @Test
    public void getLongestSubList() {
        int[][] inputValues = {
                {1, 4},
                {2, 5},
                {7, 3},
                {4, 6},
                {7, 7}
        };
        ArrayList<int[]> result = longestSubList.getLongestSubList(inputValues);
        longestSubList.printList(result);
        int [][] resultSublist = {{2,5}, {7,3}};

        assertEquals(resultSublist, result.toArray());
    }
}



