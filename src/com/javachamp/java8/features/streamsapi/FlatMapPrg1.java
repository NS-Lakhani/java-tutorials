package com.javachamp.java8.features.streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapPrg1 {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("1","2","3","4","5");
		List<String> list2 = Arrays.asList("11","22","33","44","55");
		List<String> list3 = Arrays.asList("111","222","333","444","555");
		
		List<List<String>> stringsList = Arrays.asList(list1, list2, list3);
		System.out.println(stringsList);
		
		List<String> collect = stringsList.stream().flatMap(li -> li.stream()).collect(Collectors.toList());
		System.out.println(collect);
	}

}
