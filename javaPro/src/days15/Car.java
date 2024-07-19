package days15;

public class Car {

	// 필드
	String name;
	String gearType;
	int door;
	private Engine engine = null; // 엔진 클래스 has-a 관계
	// Engine engine = new Engine(); // 결합력이 높은 코딩. 안하는게 좋다.
	
	// 생성자
	Car(){
		// this.engine = new Engine();
	}
	
	public Car(Engine engine) {
		this.engine = engine;
	}

	// getter, setter
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	// 메서드
	void speedUp(int fuel) {
		this.engine.moreFuel(fuel);
	}
	
	void speedDown(int fuel) {
		this.engine.lessFuel(fuel);
	}
	
	void stop() {
		this.engine.stop();
	}
}
