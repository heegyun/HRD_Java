
public class MethodTest {

	static final double PI = 3.141592;
	
	// 1. 7단 출력 메소드
	public void gugu1() {
		int dan = 7;
		for(int i = 1; i<=9; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, (dan * i));
		}
	}

	// 2. 구구단 원하는 단을 출력해주는 메서드를 만들어주세요.(매개변수)
	public void gugu1(int dan) {
		
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, (dan * i));
			}
		}
	public void gugu1(int dan, int limit) {
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, (dan * i));
		}
	}

	// 3. 구구단 원하는 단을 출력해주는 메서드를 만들어주세요.(매개변수)
	public void gugu3(int limit) { // 1단부터 limit 단까지 출력
		for(int dan = 1; dan <=limit; dan++) {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, (dan * i));
			}
		}
	}

	// 4. 원하는 이름을 출력해주는 메서드를 만들어주세요(매개변수)
	public void printName(String name) {
		System.out.println(name);
	}

	// 5. 자신의 이름을 리턴하는 메서드를 만들고 변수 my_name에 저장해주세요.
	// 그리고 my_name을 출력해주세요.(리턴값 O)
	String getName() {
		return "염희균";
	}

	// 6.
	static int square(int num) {
		return num * num;
	}
	
	static double area(double radius) {
		
		return radius * radius * PI;
	}
	
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		
		mt.gugu1();
	//	mt.gugu2(3);
		System.out.println("------");
		mt.gugu3(5);
		int num1 = 100;
		System.out.println(num1);
		mt.printName("홍길동");
	//	String n = "염희균"
//		System.out.println("나의 이름은: " + n);
		
		System.out.println(MethodTest.area(6.0));
	

	}

}