
public class Student {
	
	// 1. 추상화..(모델링)
	// 2. 캡슐화..(정보은닉)
	private String 학번;
	private String 학과;
	private String 수강과목;
	
	// 3. 기본 생성자..
	public Student() {
		
	}
		
	// 4. 3개 인자 생성자...
	public Student(String 학번, String 학과, String 수강과목) {
		this.학번 =  학번;
		this.학과 =  학과;
		this.수강과목 = 수강과목;
	}
	
	// 생성자 오버로딩...
	public Student(String 학번, String 학과) {
		this(학번, 학과, "자바");
	}
	
	
	// 5. setter 메소드
	public void set학번(String 학번) {
		this.학번 = 학번;
	}
	
	public void set학과(String 학과) {
		this.학과 = 학과;
	}
	public void set수강과목(String 수강과목) {
		this.수강과목 =  수강과목;
	}
	
	
	// 6. getter 메소드
	public String get학번() {
		
		return 학번;
	}
	public String get학과() {
		return 학과;
	}
	
	public String get수강과목() {
		return 수강과목;
	}
	
	
	
	public void showInfo() {
		System.out.println("학번: " + 학번 + " 학과: " + 학과 +" 수강과목: " + 수강과목);
	}
	
	
	
	
	

}
