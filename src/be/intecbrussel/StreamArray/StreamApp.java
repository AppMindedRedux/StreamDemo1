package be.intecbrussel.StreamArray;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApp {
	
	

	
	public static void main(String[] args) {
		
		// opdracht 1.1
//		String[] words = {"Manchester", "United", "The", "greatest", "club"};
//		Stream.of(words).forEach(System.out::println);
//		
//		Stream<String> stream = Stream.of(words);
//		stream.forEach(System.out::println);
		
		
		// opdracht 1.2 alle getallen tussen 0 en 100 niet inbegrepen
//		IntStream iStream = IntStream.rangeClosed(1, 99);
//		iStream.forEach(System.out::println);
//		
//		IntStream.rangeClosed(1, 9)
//						.forEach(System.out::println);
		
		
		
		// opdracht 1.3 maak klasse Person en voeg de Persons toe aan Array en print de stream af
		Person p1 = new Person("Marcus", "Rashford", Geslacht.MAN, 21, 78, 171);
		Person p2 = new Person("Ryan", "Giggs", Geslacht.MAN, 47, 70, 181);
		Person p3 = new Person("Jean", "Genie", Geslacht.VROUW, 35, 60, 161);
		
		Person[] personArr = {p1, p2, p3};
		
		Stream<Person> personStream = Arrays.stream(personArr);
		personStream.forEach(System.out::println);
		
		
	}

}
