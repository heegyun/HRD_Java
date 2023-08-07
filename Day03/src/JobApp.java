import java.util.ArrayList;
import java.util.Scanner;

public class JobApp {
	
	// 속성....
	
	public JobApp() {
		
	}
	
	// 1. 메뉴 메소드( 반환타입과 매개변수 모두 없는 메소드 타입)
	public void showMenu() {
		System.out.println("*******JOB v1.1*************");
		System.out.println("** 1. 구직 등록				  **");
		System.out.println("** 2. 구인 등록				  **");
		System.out.println("** 3. 구직자 정보 출력      **");
		System.out.println("** 4. 구인회사 정보 출력   **");
		System.out.println("** 5. 종료				  **");
		System.out.println("*****************************");
		System.out.println(" 메뉴 번호를 입력하세요=>");
		System.out.println("*****************************");
	}
	
	
	// 2. 사람의 정보 입력 받는 메소드 (반환타입 없고, 매개변수는 없는 메소드 타입)
	public void inputPerson() {
		
		Scanner scan = new Scanner(System.in);
		//이름,나이,성별,전화번호를 입력받아 사람객체로 저장	
		
		System.out.println("이름 입력 >>>");
		String name = scan.next();
		System.out.println("나이 입력 >>>");
		int age = scan.nextInt();		
		
		System.out.println("--성별 메뉴---");
		System.out.println(" 1.남자  2.여자");
		System.out.println("----------------");
		
		char sex;
		int n = scan.nextInt();
		if(n == 1) {
			sex = 'M';
		}else {
			sex = 'F';
		}
		
		System.out.println("전화번호입력 >>>");
		String tel = scan.next();
		////////////////////////////////////////////////////
		Person person = new Person(name,age,sex,tel);
		////////////////////////////////////////////////////
		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(person);
		
		// 메소드 내에서 메소드 호출
		String result = person.showProfile();
		System.out.println(result);
				
		
		
	}
	
	

	public static void main(String[] args) {

		JobApp jap = new JobApp();
		while (true) {
			jap.showMenu();

			Scanner scan = new Scanner(System.in);

			int num = scan.nextInt();

			if (num == 5) {
				System.out.println("정상종료~~");
				System.exit(0);
			} else if (num == 1) {
				jap.inputPerson();
			} else if(num == 3) {
				
			}

		}
	}
}
