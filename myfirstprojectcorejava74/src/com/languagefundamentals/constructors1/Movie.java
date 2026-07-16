package com.languagefundamentals.constructors1;

//class Test{
//	Movie m = new Movie();
//}

public class Movie {

	String director;
	String hero;
	String heroine;
	String movieName;
	double budget;

	private Movie() {
		System.out.println("no arg constructor called ");
	}

	Movie(String director) {
		System.out.println("one arg constructor ");
		this.director = director;
	}

	Movie(Movie m, String hero) {
		this.director = m.director;
		this.hero = hero;
	}

	Movie(Movie m, String heroine, String movieName) {
		this.director = m.director;
		this.hero = m.hero;
		this.heroine = heroine;
		this.movieName = movieName;

	}

	Movie(Movie m, double budget) {
		this(m);
		this.budget = budget;
	}

	Movie(Movie m) {
		this.director = m.director;
		this.hero = m.hero;
		this.heroine = m.heroine;
		this.movieName = m.movieName;
		this.budget = m.budget;
	}

	public static void main(String[] args) {
		Movie m = new Movie();
		m.movieInfo();

		Movie m1 = new Movie("Rajamouli");
		m1.movieInfo();

		Movie m2 = new Movie(m1, "Lokesh Babu");
		m2.movieInfo();

		Movie m3 = new Movie(m2, "Bhagyasree", "Varanasi-2");
		m3.movieInfo();

		Movie m4 = new Movie(m3, 300000000.00);
		m4.movieInfo();

		Movie m5 = new Movie(m4);
		m5.movieInfo();

	}

	void movieInfo() {
		System.out.println("***********Movie Info *********************** ");
		System.out.println("Director Name :  " + director);
		System.out.println("Hero Name : " + hero);
		System.out.println("Heroine Name : " + heroine);
		System.out.println("Movie name : " + movieName);
		System.out.println("Budget : " + budget);
	}

}
