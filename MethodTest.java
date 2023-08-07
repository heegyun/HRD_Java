
public class MethodTest {

	// 1. 7단 출력 메소드
	public static void gugu1() {
		int dan = 7;
		for(int i=1; i<10; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, (dan * i));
		}
	}
	
	// 2. 구구단 원하는 단을 출력해주는 메서드를 만들어주세요.(매개변수)
	public static void gugu2(int dan) {
		for(int i = 1; i < 10; i++) {
		    System.out.println(dan + " X " + i + " = " + dan * i);
		}  
	}
	
	// 3. 구구단 원하는 단을 출력해주는 메서드를 만들어주세요.(매개변수)
	public static void gugu3(int limit) {
		for (int dan = 1; dan <= limit; dan++) {
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + " x " + i + " = " + dan * i);
			}
		}
	}

	// 4. 원하는 이름을 출력해주는 메서드를 만들어주세요(매개변수)
	public static void printName(String name) {
		System.out.println(name);
	}
	
	// 5. 자신의 이름을 리턴하는 메서드를 만들고 변수 my_name에 저장해주세요. 
	// 그리고 my_name을 출력해주세요.(리턴값 O)
	public static String getName() {
		return "홍길동";
	}

	// 6. 
	public static int square(int num) {
		return num * num;
	}
	
	public static void main(String[] args) {
		gugu1();
		System.out.println("======");
		gugu2(3);
		gugu3(5);
		System.out.println("======");
		int num1 = square(10);
		System.out.println(num1);
		System.out.println("======");
		printName("홍길동");
		System.out.println("======");
		String my_name = getName();
		System.out.println(my_name);
		
	}

}
