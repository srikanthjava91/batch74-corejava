package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestMobile {

	public static void main(String[] args) {
		Mobile m1 = new Mobile("9R", "OnePlus", 40000.00);
		Mobile m2 = new Mobile("iPhone 16", "Apple", 80000.00);
		Mobile m3 = new Mobile("Galaxy S24", "Samsung", 65000.00);
		Mobile m4 = new Mobile("Edge 50 Pro", "Motorola", 32000.00);
		Mobile m5 = new Mobile("Redmi Note 14", "Redmi", 18000.00);

		List<Mobile> mobileList = new ArrayList<>();
		mobileList.add(m1);
		mobileList.add(m2);
		mobileList.add(m3);
		mobileList.add(m4);
		mobileList.add(m5);

		Comparator<Mobile> c = new Comparator<Mobile>() {

			@Override
			public int compare(Mobile o1, Mobile o2) {
				if (o1.price < o2.price) {
					return 1;
				} else if (o1.price > o2.price) {
					return -1;
				} else {
					return 0;
				}
			}
		};

		Collections.sort(mobileList, c);

		for (Mobile m : mobileList) {
			System.out.println(m);
		}

	}
}
