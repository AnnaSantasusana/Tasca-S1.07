package annotations2_1;

import java.io.Serializable;

@JsonSerializable (directory = "/Users/annasantasusanaberch/Eclipse/eclipse-workspace/Curs_pont/S1.07.n2.exercici1_AnnaSantasusana/src/annotations2_1/file.json")
public class Person implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private String surname;
	private int age;
	
	public Person(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "name = " + name + ", surname = " + surname + ", age = " + age;
	}
}
