package arrayDemo;

public class Main {

	public static void main(String[] args) {
		
		
		String[] students = new String[4];
		students[0]="Elif";
		students[1]="Burak";
		students[2]="Hasip";
		students[3]="Ali";
		//uzunYol
		for (int i=0;i<students.length;i++)
		System.out.println(students[i]);
		
		//kısaYol

		for(String student:students){
		System.out.println(student);
		}
	}

}
