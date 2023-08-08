import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {
	
	// 계좌객체 저장 하기 위한 자료구조 생성
	static ArrayList<Account> arrayAccount = new ArrayList<Account>();
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
	 boolean run = true;
	 while(run) {
	 System.out.println("----------------------------------------------------------");
	 System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
	 System.out.println("----------------------------------------------------------");
	 System.out.print("선택> ");

		int selectNo = scanner.nextInt();

		if (selectNo == 1) {
			createAccount();
		} else if (selectNo == 2) {
			accountList();
		} else if (selectNo == 3) {
			deposit();
		} else if (selectNo == 4) {
			withdraw();
		} else if (selectNo == 5) {
			run = false;
		}
	}
	System.out.println("프로그램 종료");
}

	// 계좌생성하기
	private static void createAccount() {
		 System.out.println("--------------");
		 System.out.println("계좌생성");
		 System.out.println("--------------");
		 System.out.print("계좌번호: ");
		 String ano = scanner.next();		 
		 System.out.print("계좌주: ");
		 String owner = scanner.next();

		 System.out.print("초기입금액: ");
		 int balance = scanner.nextInt();
		 
		 Account newAccount = new Account(balance, ano, owner);
		 
		 arrayAccount.add(newAccount);
		 
		 System.out.println("결과: 계좌가 생성되었습니다.");
		 
	}

	// 계좌목록보기
	private static void accountList() {
		System.out.println("--------------");
		System.out.println("계좌목록");
		System.out.println("--------------");

		for (Account account : arrayAccount) {
			System.out.print(account.getAno());
			System.out.print(" ");
			System.out.print(account.getOwner());
			System.out.print(" ");
			System.out.print(account.getBalance());
			System.out.println();
		}
	}	

	// 예금하기
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("예금");
		System.out.println("--------------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		
		Account account = findAccount(ano);
		
		if(account !=null) {
			System.out.print("예금액: ");
			int money = scanner.nextInt();
			account.setBalance(account.getBalance() + money);
			System.out.println("결과: 예금이 성공되었습니다.");
		}

		if(account==null) {
			System.out.println("결과: 계좌번호가 일치하지 않습니다.");
			return;
		}
	}

	private static Account findAccount(String ano) {
		Account account = null;
		for(Account ac : arrayAccount) {
			String dbAno = ac.getAno();
			if(dbAno.equals(ano)) {
				account= ac;	
			}else {
				return null;
			}
			break;
		}
		return account;
	}


	// 출금하기
	private static void withdraw() {
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		
		Account account = findAccount(ano);

		if(account !=null) {
			System.out.print("출금액: ");
			int money = scanner.nextInt();
			account.setBalance(account.getBalance() - money);
			System.out.println("결과: 출금이 성공되었습니다.");
		}

		if(account==null) {
			System.out.println("결과: 계좌번호가 일치하지 않습니다.");
			return;
		}
		
	}
	
}