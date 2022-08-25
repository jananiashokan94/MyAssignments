package week3.day2;

public class Students {

		
		public static void getStudentInfo(int studentId) {
			System.out.println(studentId);
		}
		public void getStudentInfo(int studentId, String studentName) {
			System.out.println(studentId + studentName);
		}
		public void getStudentInfo(String email, int phoneNumber) {
			System.out.println(email + phoneNumber);
		}
		public static void main(String[] args){
			Students sd=new Students();
			Students.getStudentInfo(456);
			sd.getStudentInfo(456, " Janu");
			sd.getStudentInfo("Janani@gamil.com", 56789432);
		}

	}


