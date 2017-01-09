package me.nicolaferraro.jasync;

import java.util.LinkedList;
import java.util.List;

/**
 *
 */
public class Main {

    public static void main(String[] args) {

        @Jasync List<Integer> list = new LinkedList<>();
        System.out.println(list);

    }

}

