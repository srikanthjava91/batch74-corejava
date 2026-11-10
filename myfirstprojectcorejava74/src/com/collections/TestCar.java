package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestCar {

	public static void main(String[] args) {
		Car c1 = new Car("Sonet", "KIA", "WHITE", 2020, 1500000.00);
		Car c2 = new Car("Creta", "Hyundai", "BLACK", 2024, 1800000.00);
		Car c3 = new Car("Swift", "Maruti Suzuki", "RED", 2023, 850000.00);
		Car c4 = new Car("Nexon", "Tata", "BLUE", 2024, 1200000.00);
		Car c5 = new Car("Fortuner", "Toyota", "WHITE", 2025, 4500000.00);
		Car c6 = new Car("Thar", "Mahindra", "BLACK", 2024, 1700000.00);
		Car c7 = new Car("Seltos", "KIA", "SILVER", 2023, 1600000.00);
		Car c8 = new Car("City", "Honda", "GREY", 2022, 1400000.00);
		Car c9 = new Car("XUV700", "Mahindra", "RED", 2025, 2500000.00);
		Car c10 = new Car("Innova", "Toyota", "WHITE", 2024, 2800000.00);
		
		List<Car> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		list.add(c6);
		list.add(c7);
		list.add(c8);
		list.add(c9);
		list.add(c10);
		
//		System.out.println(list);
//		Collections.sort(list);
		
		for(Car c:list) {
			System.out.println(c);
		}
		
		
	}
}
