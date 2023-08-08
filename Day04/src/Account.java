
public class Account {
	
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	private int balance;
	private String ano;// 계좌번호
	private String owner; // 계좌주
	
	// 인자 생성자..(멤버 변수 초기화)
	public Account(int balance, String ano, String owner) {
		
		this.balance = balance;
		this.ano = ano;
		this.owner = owner;
	}

	// 기본 생성자...
	public Account() {}

	public int getBalance() {
	 return balance;
	}
		
	public void setBalance(int balance) {
	 if(balance<Account.MIN_BALANCE || balance>Account.MAX_BALANCE) {
		 return;
	 }
	 this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	
}
