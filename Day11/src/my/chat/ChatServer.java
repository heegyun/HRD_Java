package my.chat;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatServer {
	
	private  ServerSocket serverSocket = null;
	
	// 100개 스레드로 요청을 처리하는 스레드풀 생성
	protected  ExecutorService executorService = Executors.newFixedThreadPool(100);
	
	// SocketClient를 관리하는  채팅방 
	Map<String,SocketClient> chatRoom = Collections.synchronizedMap(new HashMap<>());
	///////////////////////////////////////////////////////////////////////////////////
	
	
	public static void main(String[] args) {
		
		ChatServer chatServer = new ChatServer();
		System.out.println("-------------------------------------------------------");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter 키를 입력하세요.");
		System.out.println("-------------------------------------------------------");
		
		//TCP 서버 시작
		try {
		chatServer.startServer();

		//키보드 입력
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String key = scanner.nextLine();
			if(key.toLowerCase().equals("q")) {
				break;
			}
		}
		scanner.close();
		}catch(Exception e) {
			
		}
		//TCP 서버 종료
		chatServer.stopServer();
		
	}
	
	public  void startServer() throws Exception {

		// ServerSocket 생성 및 Port 바인딩
		serverSocket = new ServerSocket(50001);
		System.out.println("[서버] 시작됨");

		// 작업 스레드 정의
		Thread thread = new Thread(() -> {
			try {
				while (true) {
					// System.out.println("\n[서버] 연결 요청을 기다림\n");
					// 연결 수락
					Socket socket = serverSocket.accept();
					SocketClient sc = new SocketClient(this, socket);

				}

			} catch (IOException e) {
				// System.out.println("[서버] " + e.getMessage());
			}

		});

		// 스레드 시작
		thread.start();
	}

	
	// SocketClietn Map에 추가, 삭제 메소드 구현
	public void addSocketClient(SocketClient socketClient) {
		String key = socketClient.chatName + "@" + socketClient.clientIp;
		chatRoom.put(key, socketClient);
		System.out.println("입장" + key);
		System.out.println("현재 채팅자 수: " + chatRoom.size() +"\n");
		
		
		
	}
	
	
	
	public void removeSocketClient(SocketClient socketClient) {
		String key = socketClient.chatName + "@" + socketClient.clientIp;
		chatRoom.remove(key, socketClient);
		System.out.println("나감" + key);
		System.out.println("현재 채팅자 수: " + chatRoom.size() +"\n");
		
	}
	
	
	
	
	


	public  void stopServer() {
		try {
			// ServerSocket을 닫고 Port 언바인딩
			serverSocket.close();
			executorService.shutdownNow(); // 스레드풀 종료
			System.out.println("[서버] 종료됨 ");
		} catch (IOException e1) {
		}
	}
}
