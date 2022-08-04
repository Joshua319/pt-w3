
public class week3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String studentName1 = "Tom Sawyer"; 
		String studentName2 = "Jack smith";
		String studentName3 = "Bill Turner";
		
		System.out.println(studentName1);
		System.out.println(studentName2);
		System.out.println(studentName3);
		
		String[] students = new String[3];
		
		
		students[0] = " Tom swayer";
		students[1] = "Jack smith";
		students[2] = "Bill turner";
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		
		
		for( int i = 0; i < students.length; i++); {
			System.out.println(students[0]);
		} 
		
		for(String student : students) {
			System.out.println(student);
		}
		}
	
		
	} 


