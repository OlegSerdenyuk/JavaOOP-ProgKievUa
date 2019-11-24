package homeWork3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Group gr = new Group("AA");
		try {
			gr.addStudent(new Student("Ivan", "Ivanov", true, 18, "AA", 2, 21234));
			gr.addStudent(new Student("Ivanna", "Ivanova", false, 19, "AA", 2, 25678));
			gr.addStudent(new Student("Petr", "Petrov", true, 20, "AA", 2, 29101));
			gr.addStudent(new Student("Svetlana", "Svetlova", false, 21, "AA", 2, 21121));
			gr.addStudent(new Student("Dmitriy", "Dmitrov", true, 22, "AA", 2, 23141));
			gr.addStudent(new Student("Irina", "Irinova", false, 23, "AA", 2, 25161));
			gr.addStudent(new Student("Max", "Maximov", true, 24, "AA", 2, 27181));
			gr.addStudent(new Student("Olga", "Olgova", false, 25, "AA", 2, 29202));
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(gr);
		System.out.println();
		
		System.out.println(gr.searchStudent("Maximov"));
		System.out.println();
		
		Student[] voenkomArray = gr.forVoenkom();
        for (Student student : voenkomArray) {
            System.out.println("Sorry, but the army needs you: " + student);
        }
        
        Arrays.sort(gr, (a, b) -> ((Human) a).getSurname().compareTo(((Human) b).getSurname()));
	}
}
