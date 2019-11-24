package task1;

public class Cat {
	private String name;
	private String breed;
	private String color;
	private int age;
	private double weight;
	
	public Cat() {
	}
	
	public Cat(String name, String breed, String color, int age, double weight) {
		this.name = name;
		this.breed = breed;
		this.color = color;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", breed=" + breed + ", color=" + color + ", age=" + age + ", weight=" + weight
				+ "]";
	}
}
