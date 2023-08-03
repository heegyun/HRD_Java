package day04;

public class Main {

	public static void main(String[] args) {
		// 자동차
	    // 모델 : 싼타페
	    // 최고속력 : 240
	    Car c1 = new Car("싼타페", 240);
	    
	    // 모델 : 아반떼
	    // 최고속력 : 220
	    Car c2 = new Car("아반떼", 220);
	    

	    System.out.println(c1.model);
	    System.out.println(c1.max_velocity);
	    System.out.println(c2.model);
	    System.out.println(c2.max_velocity);


	    // 사람
	    // 이름 : 홍길동
	    // 나이 :27

	    Person p1 = new Person("홍길동", 27);
	    
	    System.out.println(p1.name);
	    System.out.println(p1.age);

	    // 자전거
	    // 모델 : 스캇
	    // 가격 : 2000000
	    Bicycle b1 = new Bicycle("스캇", 2000000);

	    System.out.println(b1.model);
	    System.out.println(b1.price);

	    // 비행기
	    // 모델 : 보잉
	    // 가용인원 : 120

	    Airplane a1 = new Airplane("보잉", 120);

	    System.out.println(a1.model);
	    System.out.println(a1.capacity);

	    // 핸드폰 
	    // 브랜드 : 갤럭시
	    // 가격 : 1200000
	    CellPhone cp1 = new CellPhone("갤럭시", 1200000);

	    System.out.println(cp1.brand);
	    System.out.println(cp1.price);


	    // 고양이
	    // 품종 : 터기쉬 앙고라
	    // 나이 : 4

	    Cat cat1 = new Cat("터키쉬 앙고라", 4);

	    System.out.println(cat1.kind);
	    System.out.println(cat1.age);
	}

}


class Car{
	String model;
	int max_velocity;
	public Car(String model, int max_velocity) {
		this.model = model;
		this.max_velocity = max_velocity;
	}
}

class Cat{
	String kind;
	  int age;

	  Cat(String a, int b) {
	    kind = a;
	    age = b;
	  }
}
class Airplane{
	String model;
	  int capacity;

	  Airplane(String a, int b) {
	    model = a;
	    capacity = b;
	  }
}
class Bicycle{
	String model;
	  int price;

	  Bicycle(String a, int b) {
	    model = a;
	    price = b;
	  }
}

class CellPhone{
	String brand;
	  int price;

	  CellPhone(String a, int b) {
	    brand = a;
	    price = b;
	  }
}

class Person {
	  String name;
	  int age;

	  Person(String a, int b) {
	    name = a;
	    age = b;
	  }
	}