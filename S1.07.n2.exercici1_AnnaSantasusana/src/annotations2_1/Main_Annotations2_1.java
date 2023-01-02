package annotations2_1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main_Annotations2_1 {

	public static void main(String[] args) {
		
		Person person1 = new Person("Berta", "Reig", 24);
		
		serializeAnObject(person1);
	}
	
	public static void serializeAnObject(Person person1) {
		JsonSerializable annotation = person1.getClass().getAnnotation(JsonSerializable.class);
		String directory = annotation.directory();
		try {
			FileOutputStream fos = new FileOutputStream(directory);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(person1);
			oos.close();
			System.out.println("The object has been serialized correctly");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
