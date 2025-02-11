package pack2;

public class Ex4Exam2 {

	public Ex4Exam2() {
		
	}
	
	public void printAge(String irum, int nai) {
		System.out.println("이름은 " + irum + "나이는" + nai);
	}
	
	public void printAge(String irum) {
		System.out.println("이름은 " + irum + "나이는 알 수 없어요");
	}
	
	public void printAge() {
		System.out.println("이름과 나이는 알 수 없어요");
	}
	
	public static void main(String[] args) {
		Ex4Exam2 exam2 = new Ex4Exam2();
		exam2.printAge("김치국", 33);
		exam2.printAge("공기밥");
		exam2.printAge();

	}
				// 문제: 사람의 나이를 출력하는 메서드를 작성하세요
				// 사람의 이름과 나이를 출력하는 printAge 메서드를 작성하세요.
				// 조건:
				// - 이름과 나이를 매개변수로 전달하면 "이름은 [이름], 나이는 [나이]살입니다." 출력.
				// - 이름만 전달하면 "이름은 [이름], 나이는 알 수 없습니다." 출력.
				// - 매개변수가 없으면 "이름과 나이가 모두 없습니다." 출력.
}
