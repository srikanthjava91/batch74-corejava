package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestListDemo4 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("Java");
		names.add("Advanced Java ");
		names.add("Spring");
		names.add("Spring Boot ");
		names.add("React");
		names.add("SQL");
		names.add("JS");
		names.add("BS");

		List<String> names1 = names.subList(1, 4);
		System.out.println(names1);
		names1.add("Vcube");
		names1.add("JNTU");
		System.out.println(names1);

		System.out.println(names);

	}

}
