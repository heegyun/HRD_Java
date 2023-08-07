
public class AICarTest {

	public static void main(String[] args) {
	
		Car sportsCar = new Car();
		Person  hong = new Person();
		Car sedanCar = new Car(1000, "블랙");
		
		hong.age = 20;
		hong.name ="홍길동";
		
//		sportsCar.run(50);
//		sedanCar.run(5000);
		
		System.out.println(sedanCar.speed);
		System.out.println(sportsCar.speed);
		System.out.println(sedanCar.color);
		System.out.println(sportsCar.color);
		
		hong.eat();
		hong.smile();
		
		
		

	}

}
