package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo6 {

//	public static void main(String[] args) {
//		
//
//package com.collections;
//
//import java.util.ArrayList;
//import java.util.Collection;
//
//public class RecruitmentDemo {

    public static void main(String[] args) {

        Collection<String> shortlistedCandidates = new ArrayList<>();

        shortlistedCandidates.add("Ravi");
        shortlistedCandidates.add("Priya");
        shortlistedCandidates.add("Amit");
        shortlistedCandidates.add("Sneha");
        shortlistedCandidates.add("Rahul");

        Collection<String> technicalRoundPassed = new ArrayList<>();

        technicalRoundPassed.add("Priya");
        technicalRoundPassed.add("Amit");
        technicalRoundPassed.add("Sneha");
        technicalRoundPassed.add("Kiran");

        System.out.println("Shortlisted Candidates:");
        System.out.println(shortlistedCandidates);

        System.out.println("Technical Round Passed:");
        System.out.println(technicalRoundPassed);

        // Keep only candidates present in both collections
        shortlistedCandidates.retainAll(technicalRoundPassed);

        System.out.println("Final Selected Candidates:");
        System.out.println(shortlistedCandidates);
    }



//		Collection<String> fruits = new ArrayList<>();
//
//		fruits.add("Mango");
//		fruits.add("Apple");
//		fruits.add("Banana");
//		fruits.add("Orange");
//		fruits.add("Grapes");
//		fruits.add("Pineapple");
//
//		Collection<String> vegetables = new ArrayList<>();
//
//		vegetables.add("Potato");
//		vegetables.add("Tomato");
//		vegetables.add("Carrot");
//		vegetables.add("Onion");
//		vegetables.add("Brinjal");
//		vegetables.add("Cabbage");
//		vegetables.add("Banana");
//
//		fruits.retainAll(vegetables);
//
//		System.out.println(fruits);

	}

//}
