
public class Cafe {

	public static void main(String[] args) {
		
		CoffeeMachine cf = new CoffeeMachine(2,2,2);
		cf.makecoffee(2,2);
		System.out.println(cf.getSugar());
		cf.setSugar(1);
		System.out.println(cf.getSugar());
		

	}

}




class CoffeeMachine{	
	
	private int coffee;
	private int cream;
	private int sugar;
		
	public CoffeeMachine() {}
	
	public CoffeeMachine(int coffee, int cream, int sugar) {
		
		this.coffee = coffee;
		this.cream = cream;
		this.sugar = sugar;
	}

	public void setCoffee(int coffee) {
		this.coffee = coffee;
	}
	
	public void setCream(int cream) {
		this.cream = cream;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}	
	
	// 메소드 오버로딩

	public int getCoffee() {
		return coffee;
	}

	public int getCream() {
		return cream;
	}

	public int getSugar() {
		return sugar;
	}

	public void makecoffee(int coffee, int sugar) {
		System.out.println("커피: " + coffee + ", " + "설탕: " + sugar +" 커피 만듭니다.");
	}
	public void makecoffee(int coffee) {
		System.out.println("커피: "+ " 커피 만듭니다.");
	}
	
	public void makecoffee(int coffee, int sugar, int cream) {
		System.out.println("커피: " + coffee + ", " + "크림: " + cream +"설탕:"+sugar+"커피 만듭니다.");
	}
	
	
	
	
	
	
}

