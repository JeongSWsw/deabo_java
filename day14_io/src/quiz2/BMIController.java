package quiz2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BMIController {

	public static void addPerson(ArrayList<Person> persons, Person p1) {
		persons.add(p1);
	}

	public static void removePerson(ArrayList<Person> persons, int i) {
		persons.remove(i);
	}

	public static void listPersons(ArrayList<Person> persons) {
		for (Person p : persons) {
			System.out.println(persons.indexOf(p) + " : " + p);
		}
	}

	public static void updatePerson(ArrayList<Person> persons, int i, Person p2) {
		persons.set(i, p2);
	}

	public static void savePersons(ArrayList<Person> persons) throws FileNotFoundException, IOException {
		String fileName = "C:\\deabo_th2\\1_java\\workspace\\day14_io\\src\\quiz2\\BMI5.txt";
		File file = new File(fileName);

		FileWriter fw = new FileWriter(file, true);
		for (Person p : persons) {
//			fw.write(p.getName() + "\n");
//			fw.write(p.getSex() + "\n");
//			fw.write(new Double(p.getHeight()).toString() + "\n");
//			fw.write(new Double(p.getWeight()).toString() + "\n");
//			fw.write(new Double(p.getBmi()).toString() + "\n");
//			fw.write(p.getObesity() + "\n");
//			fw.write("------------------------------------------\n");
			fw.write(p.toString()+"\n");
			fw.write("------------------------------------------\n");
			

		}
		fw.flush();
		fw.close();

	}

}
