package pack2;

public class Ex2Student {
	// 필드
	private String name;
	private int grade;
	private double score;
	
	// 생성자
//	 public Ex2Student() {
//		this.name = "신기해";  // 생성자 값을 주면 값이 고정됨
//		grade = 2;
//		score = 88.4;
//		}
		
		public Ex2Student() {
		//this.name = name;  // 생성자를 호출하며 값을 줄 수 있다.
		//this.grade = grade;
		//this.score = score;	
	
	}
		
		public Ex2Student(String name, int grade, double score) { // 매개변수는 지역변수
			this.name = name;  // 생성자를 호출하며 값을 줄 수 있다.
			this.grade = grade;
			this.score = score;	
		}
	
	// 메서드
	public void printStudent() {
		String name = "하하";
		System.out.println("이름: " + name + ", 학년: " + grade + ", 평균 점수: " + score);
	}
	
	// setter를 이용해서 값을 줄 수도 있다.
	public void setScore(double score) {
		this.score = score;
	}
	
	// main메소드는 프로그램을 실행하기 위한 메소드. Ex2Student 멤버는 아님~~~
	public static void main(String[] args) {
//		Ex2Student friend1 = new Ex2Student();
//		friend1.printStudent();
//		
//		Ex2Student friend2 = new Ex2Student();
//		friend2.printStudent();
		
		Ex2Student tom = new Ex2Student("미스터톰", 3, 85.5);
		tom.printStudent();
		System.out.println();
		Ex2Student james = new Ex2Student("제임스", 1, 95.5);
		james.printStudent();
		james.setScore(66.8);
		james.printStudent();
		james.setScore(90.0);
		james.printStudent();
	}
}

// 문제 1: 학생정보 관리 클래스. 학생 정보를 관리하기 위한 Student 클래스를 작성하세요.
// 클래스 이름은 Student입니다. 다음 필드를 포함합니다.
// String name(학생 이름), int grade (학년), double score(평균 점수)
// 생성자는 모든 필드를 초기화할 수 있어야 합니다.
// 학생의 정보를 출력하는 printStudentInfo() 메서드를 작성하세요.
// 출력 형식은 다음과 같습니다.
// 이름: [name], 학년: [grade], 평균 점수: [score]
// main 메서드에서 학생 객체를 생성하고 printStudentInfo() 메서드를 호출하세요.

