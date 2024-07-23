package days17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		
		/*6. "SS21_Team.txt"  파일을 읽어서 본인의 팀원들만의 이름을 teamMember 배열에 
		저장한 후 팀장명을 제외한 나머지 팀원들의 이름을  
		내림차순으로 정렬해서 아래와 같이 출력하는 코딩을 하세요.
		[실행결과]  예 : 
		[ 2조 ]
		<ul>
			<li class="leader">박우현</li>
			<li>이동찬</li>
			<li>윤형준</li>
			<li>유진</li>
			<li>원대안</li>
		</ul>*/
		
		String fileName = "SS21_Team.txt";
		
		String myName = "이시훈";
		String teamLeader = null;
		String teamLine = null;
		String teamMemberLine = null;
		String [] teamMember = null; // 팀원들 저장할 배열
		String regex = "\\s*,\\s*";
		
		String key = "user.dir";
		String userDir = System.getProperty(key);
		System.out.println(userDir);
		
		fileName = String.format("%s\\src\\days17\\%s", userDir, fileName);
		// System.out.println(fileName);
		
		try (
				FileReader reader = new FileReader(fileName);
				BufferedReader br = new BufferedReader(reader);
				) {
			while ((teamLine = br.readLine()) != null) {
				teamMemberLine = br.readLine();
				
				if (teamMemberLine.contains(myName)) {
					break;
				} // if
			} // while
			
			// System.out.println(teamLine);
			// System.out.println(teamMemberLine);
			String prefix = "[팀장]";
			teamMember = teamMemberLine.split(regex);
			for (int i = 0; i < teamMember.length; i++) {
				if (teamMember[i].trim().startsWith(prefix))
					teamLeader = teamMember[i].trim().replace(prefix, "");
			}
			// System.out.println(teamLeader);
			// 나머지 팀원들을 내림차순으로 정렬.
			String [] temp = new String [teamMember.length - 1];
			System.arraycopy(teamMember, 1, temp, 0, teamMember.length -1);
			// System.out.println(Arrays.toString(temp));
			Arrays.sort(temp);
			// System.out.println(Arrays.toString(temp));
			System.arraycopy(temp, 0, teamMember, 1, temp.length);
			// System.out.println(Arrays.toString(teamMember));
			/*[ 2조 ]
					<ul>
						<li class="leader">박우현</li>
						<li>이동찬</li>
						<li>윤형준</li>
						<li>유진</li>
						<li>원대안</li>
					</ul>*/
			
			Arrays.sort(temp, (s1,s2) -> s2.compareTo(s1));
			
			StringBuilder sb = new StringBuilder(teamLine+"\n");
			sb.append("<ul>\n");
			sb.append("\t<li class=\"leader\">"+teamLeader+"</li>");
			sb.append("\t<li>");
			sb.append(String.join("</li>\n<li>", temp));
			sb.append("</li>\n</ul>\n");
			sb.append("</ul>\n");
			System.out.println(sb.toString());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
