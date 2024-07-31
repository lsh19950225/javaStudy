package tennisProject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class GameManager {
	DataManager dm = DataManager.getInstance();
	DisplayManager dsm = new DisplayManager();

	public void startGame() {
		//TODO : 세트 선택, 선수 선택, 게임 종료 로직 , 엔터진행

		int setNumber = 0;
		int playerNumber = 0;
		int sdNumber = 0;
		try (Scanner scanner = new Scanner(System.in)){

			String sRegex = "[1-2]";
			String sInputData;
			do {
				System.out.print("세트 선택 1. 3set 2. 5set ");
				sInputData = scanner.next();
			} while (!sInputData.matches(sRegex));
			setNumber = sInputData.equals("1") ? 3 : 5;


			String sdRegex = "[1-2]";
			String sdInputData;
			do {
				System.out.print("단식 복식 선택 1. 단식 2. 복식 ");
				sdInputData = scanner.next();
			} while (!sdInputData.matches(sdRegex));
			sdNumber = Integer.parseInt(sdInputData);

			ArrayList<String> playerName = new ArrayList<String>();
			playerName.add("김준석");
			playerName.add("원충희");
			playerName.add("박준용");
			playerName.add("최사랑");
			playerName.add("이시훈");
			String pRegex = "[1-5]";
			String pInputData = null;
			String [] player = new String[4];

			for (int i = 0; i <= sdNumber*2-1; i++) {
				do {
					System.out.print("선수 선택 1. 김준석 2. 원충희 3. 박준용 4. 최사랑 5. 이시훈 ");
					pInputData = scanner.next();
				} while (!pInputData.matches(pRegex));
				playerNumber = Integer.parseInt(pInputData);
				player[i] = playerName.get(playerNumber-1);	
			}
			if (sdNumber == 1){
				System.out.printf("%s vs %s\n", player[0], player[1]);
			} else if (sdNumber == 2){
				System.out.printf("%s %s vs %s %s\n", player[0], player[1], player[2], player[3]);
			}

			/*if (sdNumber == 1) {
				for (int i = 0; i <= 1; i++) {
					do {
						System.out.print("선수 선택 1. 김준석 2. 원충희 3. 박준용 4. 최사랑 5. 이시훈 ");
						pInputData = scanner.next();
					} while (!pInputData.matches(pRegex));
					playerNumber = Integer.parseInt(pInputData);	
					player[i] = playerName.get(playerNumber-1);
				}
				System.out.printf("%s vs %s\n", player[0], player[1]);
			} else {
				for (int i = 0; i <= 3; i++) {
					do {
						System.out.print("선수 선택 1. 김준석 2. 원충희 3. 박준용 4. 최사랑 5. 이시훈 ");
						pInputData = scanner.next();
					} while (!pInputData.matches(pRegex));
					playerNumber = Integer.parseInt(pInputData);	
					player[i] = playerName.get(playerNumber-1);
				}
				System.out.printf("%s %s vs %s %s\n", player[0], player[1], player[2], player[3]);
			}*/

		} catch (Exception e) {
			e.printStackTrace();
		}


		dm.setTotalSetNumber(setNumber); // test 
		Random rnd = new Random();

		while (!dm.isStop()) { // test
			int i = rnd.nextInt(2);
			dsm.dispScoreBoard();
			dm.pointWinner(i);
		}
	}

}
