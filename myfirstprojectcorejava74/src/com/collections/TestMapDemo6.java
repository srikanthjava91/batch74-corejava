package com.collections;

import java.util.Map;
import java.util.WeakHashMap;

class Product {

	@Override
	public String toString() {
		return "Mobile";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called ");
	}

}

//HashMap vs WeakHashMap 
//HashMap is Dominating Garbage Collector, So Nullified objects was not removed from Heap.
//Garbage Collector Dominating WeakHashMap, So Nullified object removed from the Heap.
public class TestMapDemo6 {

	public static void main(String[] args) throws InterruptedException {

		Map<Object, String> map = new WeakHashMap<>();
		Product p = new Product();

		map.put(p, "One Plus");
		System.out.println(map);

		p = null;
		System.gc();
		Thread.sleep(3000);
		System.out.println(map);

	}
}
