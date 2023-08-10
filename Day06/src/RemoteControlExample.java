
public class RemoteControlExample {

	public static void main(String[] args) {
		
		//////////////////////////
		RemoteControl re = null;
		re = new Television();
		////////////////////////////
		
		//re =  new Audio();
		
		re.turnOn();
		re.setVolum(5);
		
		re.setMute(true);
		re.setMute(false);
		
//		re.turnOff();
//		
//		re.turnOn();
		re.setVolum(15);
//		
		RemoteControl.changeBattery();
		
		

	}

}
