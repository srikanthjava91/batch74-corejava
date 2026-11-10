package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestLaptop {

	public static void main(String[] args) {

		Laptop l1 = new Laptop("Intel Graphics", "DELL", 120000.00);
		Laptop l2 = new Laptop("NVIDIA RTX 4060", "HP", 95000.00);
		Laptop l3 = new Laptop("AMD Radeon", "Lenovo", 75000.00);
		Laptop l4 = new Laptop("Intel Iris Xe", "ASUS", 65000.00);
		Laptop l5 = new Laptop("NVIDIA RTX 4050", "Acer", 85000.00);
		Laptop l6 = new Laptop("Intel UHD Graphics", "HP", 45000.00);
		Laptop l7 = new Laptop("Apple GPU", "Apple MacBook", 150000.00);
		Laptop l8 = new Laptop("NVIDIA RTX 4070", "MSI", 135000.00);
		Laptop l9 = new Laptop("AMD Radeon 780M", "Lenovo", 80000.00);
		Laptop l10 = new Laptop("Intel Arc Graphics", "Samsung", 90000.00);

		List<Laptop> laptopList = new ArrayList<>();
		laptopList.add(l1);
		laptopList.add(l2);
		laptopList.add(l3);
		laptopList.add(l4);
		laptopList.add(l5);
		laptopList.add(l6);
		laptopList.add(l7);
		laptopList.add(l8);
		laptopList.add(l9);
		laptopList.add(l10);
		
//		The method sort(List<T>) in the type Collections is not applicable for the arguments (List<Laptop>)
		Collections.sort(laptopList);
		for(Laptop l:laptopList) {
			System.out.println(l);
		}

	}

}
