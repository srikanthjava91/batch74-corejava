package com.collections;

import java.util.HashMap;
import java.util.Map;

public class TestMapDemo2 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("TS", "Telangana");
		map.put("AP", "Andhrapradesh");
		map.put("KA", "Karnataka");
		map.put("TN", "Tamilnadu");
		map.put("KL", "Kerala");
		map.put("MH", "Maharashtra");
		map.put("GJ", "Gujarat");
		map.put("RJ", "Rajasthan");
		map.put("MP", "Madhya Pradesh");
		map.put("UP", "Uttar Pradesh");
		map.put("TG", "Telanagana");

		map.put("AP", "Amaravathi");// The old value is replacing with new value.
		System.out.println("---------------------------");
		// the previous value associated with key, or null if there was no mapping for
		// key.
		System.out.println(map.put("MN", "Manipur"));// null
		System.out.println(map.put("TN", "Chennei"));// Tamilnadu

		System.out.println(map);

		System.out.println(map.containsKey("MP"));
		System.out.println(map.containsValue("Kerala"));

		System.out.println(map.get("MP"));
		System.out.println(map.isEmpty());

//		Set<Entry<String, String>> entries = map.entrySet();
//		for (Entry<String, String> entry : entries) {
//			System.out.println(entry.getKey() + " - " + entry.getValue());
//		}

	}

}
