package days20;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * @author lsh
 * 	@date 2024. 7. 26. - 오전 11:27:00
 * @subject Properties 컬렉션 클래스 예제
 *	@content Ex03.java -> jdbcConfig.properites 파일을
 *					Properties 컬렉션 클래스를 사용해서
 *					환경설정값을 얻어오는 예제.
 *
 *					p.load(FileRearder)
 *					value = p.getProperty(key)
 *
 *					p.keyset() 모든 키를 얻어와서 value 출력.
 *					
 */
public class Ex03_03 {

	public static void main(String[] args) {

		String className;            
		String url;                  
		String user;                                                                   
		String password;
		
		Properties p = new Properties();
//		p.setProperty("className", "oracle.jdbc.driver.OracleDriver");
//		p.setProperty("url", "jdbc:oracle:thin:@localhost:1521:xe");
//		p.setProperty("user", "scott");
//		p.setProperty("password", "tiger");
		
		String fileName = ".\\src\\days20\\jdbcConfig.properties";
		// FileReader, BufferedReader
		// FileWriter
		try (FileReader reader = new FileReader(fileName)){
			p.load(reader);
			// 키 출력
			// user = p.getProperty("user");
			
			Set<Object> ks = p.keySet();
			Iterator<Object> ir = ks.iterator();
			while (ir.hasNext()) {
				String key = (String) ir.next();
				String value = p.getProperty(key);
				System.out.printf("key=%s, value=%s\n", key, value);
			}
			
			System.out.println(" SAVE END ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 새로고침하면 나옴.
		// # 주석처리를 뜻함.
		
		

	} // main

} // class
