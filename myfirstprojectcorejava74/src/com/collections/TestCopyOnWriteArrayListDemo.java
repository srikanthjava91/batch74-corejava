package com.collections;

import java.util.List;
import java.util.Vector;

public class TestCopyOnWriteArrayListDemo {

	public static void main(String[] args) {

//		List<Float> al = new ArrayList<>();//Fail-fast
//		List<Float> al = new CopyOnWriteArrayList<>();//Fail-Safe Because It is a Thread-safe variant of ArrayList 
		List<Float> al = new Vector<>();////Fail-fast
		
		al.add(5.6F);
		al.add(5.7F);
		al.add(5.8F);
		al.add(5.9F);
		al.add(5.10F);
		al.add(5.11F);

		for (Float f : al) {
			System.out.println(f);
			al.add(5.12F);
		}

//		Iterator<Float> itr = al.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//			al.add(5.67F);
//		}

//		for (int i = 0; i < al.size(); i++) {
//			System.out.println(al.get(i));
//			al.add(5.15F);
//		}

		System.out.println(al);

	}

}
