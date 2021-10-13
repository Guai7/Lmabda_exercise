package com.study.lmb_exercise;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {

        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(0, "123", 16));
        apples.add(new Apple(1, "123", 18));
        apples.add(new Apple(2, "123", 17));
        apples.add(new Apple(3, "123", 15));
        apples.add(new Apple(4, "123", 13));

        //使用Lambda表达式
        List<Apple> apples1 = filterAppler(apples, (Apple a) -> a.getHeight() > 15);

        //未使用Lambda表达式
//        List<Apple> apples2 = filterAppler(apples, new IAppleFilter<Apple>() {
//            @Override
//            public boolean test(Apple apple) {
//                return apple.getHeight() > 15;
//            }
//        });

        System.out.println(apples1);

    }


    private static <T> List<T> filterAppler(List<T> list, IAppleFilter<T> appleFilter) {

        ArrayList<T> objects = new ArrayList<>();
        for (T t : list) {
            if (appleFilter.test(t)) {
                objects.add(t);
            }
        }
        return objects;
    }


}