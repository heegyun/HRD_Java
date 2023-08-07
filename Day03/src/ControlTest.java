/*
    수도 요금 계산
    -메뉴(1~3), 사용량(liter)
    1. 가정용(liter당 50원)
    2. 상업용(liter당 45원)
    3. 공업용(liter당 30원)
    => 메뉴 선택후 사용량을 입력하세요
    - 출력될 내용
    - 사용요금 = 사용량 * 리터당 가격
    - 총수도요금 = 사용요금 +세금(요금의 5%)

 */

import java.util.Scanner;

public class ControlTest {

	public static void main(String[] args) {
		
		System.out.println("---메뉴---");
        System.out.println(" 1. 가정용(liter당 50원)");
        System.out.println(" 2. 상업용(liter당 45원)");
        System.out.println(" 3. 공업용(liter당 30원)");
        System.out.println("------------------------");
        System.out.println("메뉴를 선택하세요=>");
        Scanner scanner = new Scanner(System.in);
        int code = scanner.nextInt();
        int fare = 0 ; // 사용요금
        double tax = 0; //세금
        System.out.println("사용량을 입력하세요>>");
        int use = scanner.nextInt();// 사용량

        // switch문을 사용하여 가정용, 상업용, 공업용 별로 사용요금과 총 수도요금 계산
        switch (code){
            case 1:
                fare = use * 50;
                break;
            case 2:
                fare = use * 45;
                break;
            case 3:
                fare = use * 35;
                break;
            default:
                System.out.println("지원되지 않는 메뉴입니다.");
                break;
        }
        
        System.out.println("=================");
        System.out.println("사용자 코드: " + code);
        System.out.println("사용 요금: " + fare);
        tax = fare * 0.05;
        double total = fare + tax;
        System.out.println("총 수도요금: " + total);
        System.out.println("==================");

	}

}
