package my.thread;

import java.awt.Toolkit;


public class BeepPrintExample {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		
		System.out.println(mainThread.getName());
		
		Toolkit toolkit  = Toolkit.getDefaultToolkit();
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
							
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {
						
						Thread.sleep(500);
						
					}catch(Exception e) {
						
					}
				}
			}
			
		});
		///////////////////////
		thread.start();
		/////////////////////////
		
		
		
		for(int i = 0 ; i<5; i++) {
			System.out.println("띵");
			try {

				Thread.sleep(500);

			} catch (Exception e) {

			}
		}
		

	}

}
