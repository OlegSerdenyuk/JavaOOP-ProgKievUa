package homeWork3;

public class Student extends Human {
	private String group;
	private int course;
	private int recordBook;
	
	public Student(String name, String surname, boolean sex, int age, String group, int course, int recordBook) {
		super(name, surname, sex, age);
		this.group = group;
		this.course = course;
		this.recordBook = recordBook;
	}
	
	public Student() {
		super();
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public int getRecordBook() {
		return recordBook;
	}

	public void setRecordBook(int recordBook) {
		recordBook = recordBook;
	}

	@Override
	public String toString() {
		return "Student [group=" + group + ", course=" + course + ", RecordBook=" + recordBook + "," + super.toString();
	}
}