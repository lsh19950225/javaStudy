package days21;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * @author lsh
 * 	@date 2024. 7. 29. - 오후 2:02:14
 * @subject [메모리 스트림]
 *	@content 주로 다른 곳에 입, 출력 하기 전에
 *					메모리 상에서 데이터를 임시로 저장할 목적으로
 *					사용하는 스트림.
 *
 *					1) 바이트 스트림 x
 *					ByteArray[InputStream]/ByteArray[OutputStream]
 *					2) 문자 스트림 x
 *					CharArray[Reader]/CharArray[Writer]
 *					3) 문자 스트림 o
 *					StringReader/StringWriter
 * 
 */
public class Ex07 {

	public static void main(String[] args) {

		byte [] buf = {1,2,3,4,5,6,7,8,9};

		try (ByteArrayInputStream bis = new ByteArrayInputStream(buf);
				ByteArrayOutputStream bos = new ByteArrayOutputStream()){
			int code;
			while ((code = bis.read()) != -1) {
				System.out.println(code);
				bos.write(code);
			}
			
			// byte [] -> bis -> bos -> byte []
			byte [] outBuf = bos.toByteArray();
			System.out.println(Arrays.toString(outBuf));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
