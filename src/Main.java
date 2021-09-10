import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> fl = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		Fruit s1 = new Fruit(101, "Apple", 1000);
		Fruit s2 = new Fruit(102, "Banana", 1400);
		Fruit s3 = new Fruit(103, "Grape", 4000);
		Fruit s4 = new Fruit(104, "Kiwi", 3000);
		Fruit s5 = new Fruit(105, "Pear", 2000);
		Fruit s6 = new Fruit(106, "Cherry", 1700);
		Fruit s7 = new Fruit(107, "Pineapple", 7000);
		Fruit s8 = new Fruit(108, "Melon", 7000);
		Fruit s9 = new Fruit(109, "Watermelon", 8000);
		Fruit s10 = new Fruit(110, "Orange", 4500);
		
		fl.add(s1);
		fl.add(s2);
		fl.add(s3);
		fl.add(s4);
		fl.add(s5);
		fl.add(s6);
		fl.add(s7);
		fl.add(s8);
		fl.add(s9);
		fl.add(s10);

		Collections.sort(fl, new FruitComparator());
		for(Fruit s : fl) {
			System.out.println(s.toString());
		}
		System.out.println("Fruit List (reverse ordered by name)");
		
		Collections.sort(fl, new FruitComparatorDesc());
		for(int i=0; i<fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}

	}

}
