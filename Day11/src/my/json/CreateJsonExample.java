package my.json;

import java.io.FileWriter;
import java.io.Writer;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonExample {
	
	public static void main(String[] args) {
		
		//JSON객체 생성
		JSONObject root = new JSONObject();
		
		// 속성 추가
		root.put("id", "winter");
		root.put("name", "한겨울");
		root.put("age", 25);
		root.put("student", true);
		
		// 객체 속성 추가
		JSONObject tel = new JSONObject();
		tel.put("home", "042-111-2222");
		tel.put("mobile", "010-3333-5555");
		
		
		root.put("tel", tel);
		
		// 배열 속성 추가
		JSONArray skill = new JSONArray();
		skill.put("java");
		skill.put("c");
		skill.put("c++");
		skill.put("python");
		
		root.put("skill", skill);
		
		//JSON 객체 얻기
		String json = root.toString();
		
		// 콘솔로 출력하기
		System.out.println(json);
				
		
		// 파일로 저장하기
		try {
		Writer writer = new FileWriter("member.json", Charset.forName("UTF-8"));
		writer.write(json);
		writer.flush();
		writer.close();
		
		}catch(Exception e) {
			e.getMessage();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
