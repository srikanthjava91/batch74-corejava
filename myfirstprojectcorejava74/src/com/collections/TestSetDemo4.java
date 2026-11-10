package com.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student {

	int id;
	String name;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (!(obj instanceof Student))
			return false;

		Student other = (Student) obj;

		return id == other.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}

public class TestSetDemo4 {

	public static void main(String[] args) {

		Student s1 = new Student(1, "Ravi");
		Student s2 = new Student(1, "Ravi");

		Set<Student> ss = new HashSet<>();
		ss.add(s1);
		ss.add(s2);

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		System.out.println(ss);

	}

}
