package homeWork3;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Group implements Voenkom {
	private Student[] st = new Student[10];
	private String nameOfGroup;

    public Group() {
        super();
        this.nameOfGroup = "unknow";
    }

    public Group(String groupName) {
        super();
        this.nameOfGroup = groupName;
    }

    public String getGroupName() {
        return nameOfGroup;
    }

    public void setGroupName(String groupName) {
        this.nameOfGroup = groupName;
    }

	public void addStudent(Student student) throws MyException {
		if (student == null) {
			throw new IllegalArgumentException("Null");
		}
		for (int i = 0; i < st.length; i++) {
			if (st[i] == null) {
				student.setGroup(this.nameOfGroup);
				st[i] = student;
				return;
			}
		}
		throw new MyException();
	}
	
	public boolean deleteStudent(int number) {
		for (int i = 0; i < st.length; i++) {
			if (st[i] != null && st[i].getCourse() == number) {
				st[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Student searchStudent(String surname) {
		for (Student student : st) {
			if (student != null && student.getSurname().equals(surname)) {
				return student;
			}
		}
		return null;
	}
	
	public void sortedStudent() {
		for (int i = 0; i < st.length - 1; i++) {
			for (int j = i + 1; j < st.length; j++) {
				if (compareStudent(st[i], st[j]) > 0) {
					Student temp = st[i];
					st[i] = st[j];
					st[j] = temp;
				}
			}
		}
	}
	
	private int compareStudent(Student a, Student b) {
		if (a != null && b == null) {
			return 1;
		}
		if (a == null && b != null) {
			return -1;
		}
		if (a == null && b == null) {
			return 0;
		}
		return a.getSurname().compareTo(b.getSurname());
	}
	
	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Group: " + this.nameOfGroup).append(System.lineSeparator());
        int i = 0;
        sortedStudent();
        for (Student student : st) {
            if (student != null) {
                sb.append((++i) + ") ").append(student);
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();
    }
	
	public void addStudentInteractive() throws MyException {
		try {
			String name = getName("Input name");
			String surname = getSurname("Input surname");
			boolean sex = getSex("Input sex");
			int age = getAge();
			String group = this.nameOfGroup;
			int course = getCourse("Input course");
			int recordBook = getRecordBook("Input recordBook");
		} catch (NullPointerException e) {
			System.out.println("Sorry, you can't input this student. Try again!");
			return;
		}
	}
	
	private String getName(String message) throws MyException {
        boolean done = false;
        String name = "";
        for (; !done;) {
            try {
                name = JOptionPane.showInputDialog("Input name");
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Sorry, incorrect format!");
            }
        }
        return name;
    }
	
	private String getSurname(String message) throws MyException {
        boolean done = false;
        String surname = "";
        for (; !done;) {
            try {
                surname = JOptionPane.showInputDialog("Input surname");
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Sorry, incorrect format!");
            }
        }
        return surname;
    }
	
	private boolean getSex(String message) throws MyException {
        boolean done = false;
        boolean name = false;
        for (; !done;) {
            try {
                name = JOptionPane.showInputDialog("Input sex").equals("man");
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Sorry, incorrect format!");
            }
        }
        return name;
    }
	
	private int getAge() throws MyException {
        boolean done = false;
        int age = 0;
        for (; !done;) {
            try {
                age = Integer.valueOf(JOptionPane.showInputDialog("Input age"));
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Sorry, incorrect format!");
            }
        }
        return age;
    }
	
	private int getCourse(String message) throws MyException {
        boolean done = false;
        int name = 0;
        for (; !done;) {
            try {
                name = Integer.valueOf(JOptionPane.showInputDialog("Input course"));
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Sorry, incorrect format!");
            }
        }
        return name;
    }
	
	private int getRecordBook(String message) throws MyException {
        boolean done = false;
        int name = 0;
        for (; !done;) {
            try {
                name = Integer.valueOf(JOptionPane.showInputDialog("Input recordBook"));
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Sorry, incorrect format!");
            }
        }
        return name;
    }
	
	@Override
	public Student[] forVoenkom() {
        int a = 0;
        for (Student student : st) {
            if (student != null && student.isSex() && student.getAge() >= 18) {
                a++;
            }
        }
        Student[] voenkomArray = new Student[a];
        int i = 0;
        for (Student student : this.st) {
            if (student != null && student.isSex() && student.getAge() >= 18) {
            	voenkomArray[i++] = student;
            }
        }
        return voenkomArray;
    }
	
	public void sortedOfSurname() {
		for (int i = 0; i < st.length - 1; i++) {
			for (int j = i + 1; j < st.length; j++) {
				if (compareStudent(st[i], st[j]) > 0) {
					Student temp = st[i];
					st[i] = st[j];
					st[j] = temp;
				}
			}
		}
	}
	
}
