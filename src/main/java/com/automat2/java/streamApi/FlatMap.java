package com.automat2.java.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<List<String>> nestedList = List.of(
                List.of("A", "B"),
                List.of("C", "D"),
                List.of("E")
        );
        System.out.println(nestedList);
        System.out.println("_____________");

        List<String> nonNestedList = new ArrayList<>();
        for (List<String> list: nestedList){
            //  for (String s)
            nonNestedList.addAll(list);
        }
        System.out.println(nonNestedList);
        System.out.println("_____________");



        List<String> nonNestedListWithStream = nestedList.stream()
                .flatMap(List::stream).collect(Collectors.toList());
        System.out.println(nonNestedListWithStream);

        List<String> name;


    }
}
