package com.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class TestVectorDemo1 {

	public static void main(String[] args) {

		Vector<String> li = new Vector<>();

		li.addElement("Kasi");
		li.addElement("Tirupati");
		li.addElement("Karthik");
		li.addElement("Shafi");
		li.addElement("Wazid");
		li.addElement("Bharath");
		li.addElement("Kasi");
		li.addElement("Tirupati");
		li.addElement("Karthik");
		li.addElement("Shafi");
		li.addElement("Wazid");
		li.addElement("Bharath");

		Enumeration<String> en = li.elements();
//		while (en.hasMoreElements()) {
//			System.out.println(en.nextElement());
//		}
		
		Iterator<String> itr=li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println(li);

	}

}
