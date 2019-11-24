package homeWork9;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
	
	/*
	 * Написать метод, который создаст список, положит в него 10 элементов,
	 * затем удалит первые два и последний, а затем выведет результат на экран.
	 */
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(11);
		list.add(5);
		list.add(-2);
		list.add(17);
		list.add(34);
		list.add(8);
		list.add(-16);
		list.add(23);
		list.add(1);
		
		System.out.println("List: " + list);
		
		list.remove(0);
		list.remove(0);
		list.remove(7);
		
		System.out.println("List after remove first, second and last element: " + list);
	}
}
