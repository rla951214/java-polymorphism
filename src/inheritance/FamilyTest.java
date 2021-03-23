package inheritance;

class Family {
	public void move() {
		System.out.println("가족이 각자 할 일을 합니다.");
	}
}

class Father extends Family {
	public void move() {
		System.out.println("아빠가 일을 하십니다.");
	}
}

class Mother extends Family {
	public void move() {
		System.out.println("엄마가 요리를 하십니다.");
	}
}

class Brother extends Family {
	public void move() {
		System.out.println("정태가 코딩 공부를 합니다.");
	}
}

class Sister extends Family {
	public void move() {
		System.out.println("여동생이 대학교를 다닙니다.");
	}
}

public class FamilyTest {

	public static void main(String[] args) {
		
		FamilyTest test = new FamilyTest();
		test.moveFamily(new Father());
		test.moveFamily(new Mother());
		test.moveFamily(new Brother());
		test.moveFamily(new Sister());
	}
	
	public void moveFamily(Family family) { // Family 매개변수의 자료형이 상위클래스 
		
		family.move();  // 다형성을 나타내는 코드이다. 재정의된 메서드가 호출됨
	}

}
