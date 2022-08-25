package week3.day2;

	
	public class StudentInfo extends Department{
		public void studentName() {
			System.out.println("Student name is Janu");
		}
		public void studentDept() {
			System.out.println("Student department is MCA");
		}
		public void studentId() {
			System.out.println("student Id is 6118");
		}
		public static void main(String[] args) {
			StudentInfo sd=new StudentInfo();
			sd.collegeName();
			sd.collegeCode();
			sd.collegeRank();
			sd.departmentName();
			sd.studentName();
			sd.studentDept();
			sd.studentId();
		}

	}


