package com.hansheng.Basic;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hansheng on 2016/9/25.
 */

public class ArrayTest {
    public static void main(String... args) {
        int a[] = {1, 2, 3, 4, 5};
        List list = Arrays.asList(1, 2, 3, 4);
        System.out.println("list=" + list.get(0));


        Integer integer1 = 3;//Integer.valueOf(3);
        Integer integer2 = 3;

        if (integer1 == integer2)
            System.out.println("integer1 == integer2");
        else
            System.out.println("integer1 != integer2");

        Integer integer3 = 300;
        Integer integer4 = 300;

        if (integer3 == integer4)
            System.out.println("integer3 == integer4");
        else
            System.out.println("integer3 != integer4");


    }
}
