package src.myheros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Thanos {
	/**
	 * 
	 */
	private static List<Hero> heroesList = new ArrayList<>();

	/**
	 * 
	 */
	public Thanos() {
	}

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method main
	 * @class Thanos
	 * @version 1.0
	 * @date lundi 23 sept. 2019
	 * @see
	 *
	 **/
	public static void main(String[] args) {

		// TODO 1 : Create an empty heroes list
//		List<Hero> heroesList = new ArrayList<>();
		Arrays.asList("ma phrase à transformer en tableau, si je veux".split(" "));

		// TODO 2 : Add those heroes to the list
		// name: Black Widow, age: 34
		// name: Captain America, age: 100
		// name: Vision, age: 3
		// name: Iron Man, age: 48
		// name: Scarlet Witch, age: 29
		// name: Thor, age: 1500
		// name: Spider-Man, age: 18
		// name: Hulk, age: 49
		// name: Doctor Strange, age: 42
		Hero BlackWidow = new Hero("Black Widow", 34);
		Hero CaptainAmerica = new Hero("Captain America", 100);
		Hero Vision = new Hero("Vision", 3);
		Hero IronMan = new Hero("Iron Man", 48);
		Hero ScarletWitch = new Hero("Scarlet Witch", 29);
		Hero Thor = new Hero("Thor", 1500);
		Hero SpiderMan = new Hero("Spider-Man", 18);
		Hero Hulk = new Hero("Hulk", 49);
		Hero DoctorStrange = new Hero("Doctor Strange", 42);

		heroesList.add(BlackWidow);
		heroesList.add(CaptainAmerica);
		heroesList.add(Vision);
		heroesList.add(IronMan);
		heroesList.add(ScarletWitch);
		heroesList.add(Thor);
		heroesList.add(SpiderMan);
		heroesList.add(Hulk);
		heroesList.add(DoctorStrange);

		// TODO 3 : It's Thor birthday, now he's 1501
		System.out.println("It's " + Thor.getName() + " birthday, now he's " + (Thor.getAge() + 1));
//		autre possibilite modifier la collection
		Thor.setAge(1501);
		System.out.println("It's " + Thor.getName() + " birthday, now he's " + Thor.getAge());

		// TODO 4 : Shuffle the heroes list
//		Collections.shuffle(heroesList, new SecureRandom());
//		ou
		Collections.shuffle(heroesList);
		// TODO 5 : Keep only the half of the list
		int halfList = heroesList.size() / 2;
		for (int i = 0; i < halfList; i++) {
			heroesList.remove(i);
		}

		// TODO 6 : Loop throught the list and display the name of the remaining heroes
		for (Hero hero : heroesList) {
			System.out.println(hero.getName());
		}
	}
}