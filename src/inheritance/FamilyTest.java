package inheritance;

class Family {
	public void move() {
		System.out.println("������ ���� �� ���� �մϴ�.");
	}
}

class Father extends Family {
	public void move() {
		System.out.println("�ƺ��� ���� �Ͻʴϴ�.");
	}
}

class Mother extends Family {
	public void move() {
		System.out.println("������ �丮�� �Ͻʴϴ�.");
	}
}

class Brother extends Family {
	public void move() {
		System.out.println("���°� �ڵ� ���θ� �մϴ�.");
	}
}

class Sister extends Family {
	public void move() {
		System.out.println("�������� ���б��� �ٴմϴ�.");
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
	
	public void moveFamily(Family family) { // Family �Ű������� �ڷ����� ����Ŭ���� 
		
		family.move();  // �������� ��Ÿ���� �ڵ��̴�. �����ǵ� �޼��尡 ȣ���
	}

}
