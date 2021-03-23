package inheritance;

class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� �����ϴ�.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {

		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		
		// Animal a = new Human(); �� �ڵ�� �Ȱ��� ���̴�.
		
	}
	
	public void moveAnimal(Animal animal) {   // Animal �Ű������� �ڷ����� ����Ŭ����
		
		animal.move();   // �������� ��Ÿ���� �ڵ��̴�. �����ǵ� �޼��尡 ȣ���.
	}

}