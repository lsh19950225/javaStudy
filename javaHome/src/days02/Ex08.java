package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.management.relation.RelationServiceNotRegisteredException;

public class Ex08 {

	public static void main(String[] args) throws IOException {
		/*Scanner scanner = new Scanner(System.in);
		String name;
		int age;
		char grade;
		System.out.print("이름, 나이, 등급 ? ");
		name = scanner.next();
		age = scanner.nextInt();
		grade = scanner.next().charAt(0);
		
		System.out.printf("이름=%s, 나이=%d, 등급=%c\n", name, age, grade);*/
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		int age;
		char grade;
		
		System.out.print("이름, 나이, 등급 ? ");
		String data = bufferedReader.readLine();
		String a = ",";
		String [] datas = data.split(a);
		
		name = datas[0];
		age = Integer.parseInt(datas[1]);
		grade = datas[2].charAt(0);
		
		System.out.printf("이름=\"%s\", 나이=%d, 등급='%c'\n", name, age, grade);
		

	}

}
