
public class CalTest {

	public static void main(String[] args) {
		
		Calculator  calculator1 = new Calculator();
		Calculator  calculator2 = new Calculator(200,300);
		
		// 메소드 호출
		int cresult = calculator1.plus(40,50);
		System.out.println("더하기: " + cresult);
		
		// 빼기 메소드 호출
		calculator1.minus(40, 50);
		
		// 곱하기 메소드 호출
		System.out.println(calculator2.multi());

		// 메소드정보 출력 하는 메소드 호출
		calculator1.methodInfo();
	}

}
