package days15;

//				~able : 움직일 수 있는
interface Movable {
	
	int COLOR = 1; // public static final 생략
	void move(int x, int y); // public abstract 생략
	
} // interface


abstract class Unit {
	int currentHP; // 현재 유닛의 체력
	int x; // 현재 유닛의 위치(x좌표)
	int y; // 현재 유닛의 위치(y좌표)
} // class

interface Attackable {
	void attack(Unit unit);
}

// 인터페이스 끼리 다중 상속이 가능(extends)
interface Fightable extends Movable, Attackable {
	
}

// 하늘 유닛
class AirUnit extends Unit {
	
}

// 땅 유닛
class GroundUnit extends Unit {
	
}

// 수송선
class DropShip extends AirUnit implements Fightable {

	@Override
	public void move(int x, int y) {
		
		
	}

	@Override
	public void attack(Unit unit) {
		
		
	}
	
}

// 군인
class Fighter extends GroundUnit implements Fightable {

	@Override
	public void move(int x, int y) {
			// 걷기, 뛰기..
		
	}

	@Override
	public void attack(Unit unit) {
			// 총, 칼..
		
	}
	
}

// 탱크
class Tank extends GroundUnit implements Fightable, Repairable {

	@Override
	public void move(int x, int y) {
		// 탱크 이동.
		
	}

	@Override
	public void attack(Unit unit) {
		// 포 공격..
		
	}
	
}

interface Repairable {
	
}

// 공격, 수리, 건축
// 수리 가능 : 탱크, SCV
// 수리 불가능 : Fighter
class SCV extends GroundUnit implements Repairable, Fightable {

	@Override
	public void move(int x, int y) {
		
		
	}

	@Override
	public void attack(Unit unit) {
		
		
	}
	
	// 수리하는 메서드 추가
	void repair(Repairable unit) { // 인터페이스 매개변수 다형성
		if (unit instanceof Tank) {
			// 탱크 수리하는 코딩.
		} else if (unit instanceof SCV) {
			// SCV 수리하는 코딩.
		}
	}
	
}

// 해상
class Marine extends Unit implements Fightable {

	@Override
	public void move(int x, int y) {
		
		
	}

	@Override
	public void attack(Unit unit) {
		
		
	}
	
}







