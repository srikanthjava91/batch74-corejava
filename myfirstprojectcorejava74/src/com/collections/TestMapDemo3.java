package com.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

//WAP to print Frequency of Given characters from a String..? 
//java --> j=1 a=2 v=1 
public class TestMapDemo3 {

	public static void main(String[] args) {

		Map<Character, Integer> map = new LinkedHashMap<>();
		System.out.println(map);// {J=1,a=1,v=1}

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();// Java

		char[] ch = str.toCharArray();// J a v a

		for (char c : ch) {

			map.put(c, map.getOrDefault(c, 0) + 1);

//			if (map.containsKey(c)) {
//				map.put(c, map.get(c) + 1);
//			} else {
//				map.put(c, 1);
//			}
		}

		System.out.println(map);

		Set<Entry<Character, Integer>> entries = map.entrySet();

		for (Entry<Character, Integer> entry : entries) {
			System.out.println(entry.getKey() + " -" + entry.getValue());
		}

	}

}
