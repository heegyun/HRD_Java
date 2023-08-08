
class MemberService{
	
	// login()
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345") ) {
			return true;
		}
		else return false;
	}
	
	// logout()
	void logout(String id) {
		if(id.equals("hong")) 
			System.out.println("로그아웃 되었습니다.");
		else
			System.out.println("아이디를 확인하세요.");
	}
	
}

public class MemberServiceExample {	
	

	public static void main(String[] args) {
		
		Member user1 = new Member("홍길동","hong");
		
		MemberService memberservice = new MemberService();
		boolean result = memberservice.login("hong", "12345");
		if(result) {
			System.out.println("로그인 성공~~");
			memberservice.logout("hong");
		}else {
			System.out.println("아이디 또는 비밀번호가 올바르지 않습니다.");
		}
	}

}

class Member {
	// 이름
	// 아이디
	// 패스워드
	// 나이
	String name;
	String id;
	String password;
	String age;
	
	// 인자 생성자 추가
	public Member(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
