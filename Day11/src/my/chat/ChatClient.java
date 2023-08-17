package my.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
	
public class ChatClient {
	public static void main(String[] args) {
		try {
			//Socket 생성과 동시에 localhost의 50001 Port로 연결 요청;
			Socket socket = new Socket("192.168.0.3", 50001);

			System.out.println( "[클라이언트] 연결 성공");
			
			// 데이터 보내기
			String message= "나는 자바가 좋다...";
			int data1 = 20;
			double data2 = 15.25;
			
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(message);
			dos.writeInt(data1);
			dos.writeDouble(data2);
			
			dos.flush();
			System.out.println("[클라이언트] 데이터 보냄: " + message+","+ data1+","+data2);
			
			// 데이터 받기----------------------------------------
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String receiveMessage = dis.readUTF();
			int receiveData2 = dis.readInt();
			double receiveData1 = dis.readDouble();
			System.out.println("[클라이언트] 데이터 받음: " + receiveMessage);
			System.out.println("[클라이언트] 데이터 받음: " + receiveData2);
			System.out.println("[클라이언트] 데이터 받음: " + receiveData1);
		
			// ----------------------------------------
					
			
			//Socket 닫기
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
		} catch (UnknownHostException e) {
			//IP 표기 방법이 잘못되었을 경우
		} catch (IOException e) {
			//해당 포트의 서버에 연결할 수 없는 경우
		}
	}
}