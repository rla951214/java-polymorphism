package inheritance;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 날읍니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {

		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		
		// Animal a = new Human(); 이 코드랑 똑같은 말이다.
		
	}
	
	public void moveAnimal(Animal animal) {   // Animal 매개변수의 자료형이 상위클래스
		
		animal.move();   // 다형성을 나타내는 코드이다. 재정의된 메서드가 호출됨.
	}

}
