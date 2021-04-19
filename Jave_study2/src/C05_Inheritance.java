
public class C05_Inheritance {
	
	/*
	 	#Ŭ���� ���
	 	 
	 	 - �̸� ������ �̹� �����ϴ� Ŭ������ �״�� �����޾Ƽ� ����ϴ� �ų� ���ļ� ����ϴ� ��
	 	 - ������ִ� Ŭ������ �θ� Ŭ���� �Ǵ� ���� Ŭ������� �Ѵ�
	 	 - ��ӹ޴� Ŭ������ �ڽ� Ŭ���� �Ǵ� ���� Ŭ������� �Ѵ�
	 
	 */
		public static void main(String[] args) {
			Person[] person = new Person[3];
			
			person[0] = new Person("ȫ�浿", 10, 10);
			person[1] = new Person("���浿", 45, 15);
			person[2] = new Person("�̱浿", 30, 12);
			
			
			person[0].sayHi();
			person[1].sayHi();
			person[2].sayHi();
			
			// �θ� Ŭ�������� ������� ����� �����Ӱ� ����� �� �ִ�
			Police police1 = new Police();
			
			police1.sayHi();
			police1.walk();
			police1.run();
			
			police1.thisSuperTest("�Ѹ�");
			
		}
}

class Person {
	String name;
	int age;
	int speed;
	
	public Person(String name, int age, int speed) {
		this.name = name;
		this.age= age;
		this.speed = speed;
		
	}
	void sayHi() {
		//�������� :  ���̰� �������� �����ϰ� �λ��ϵ��� ��������
		if(age < 0) {
			System.out.println("?");
		} else if (age < 10) {	
			System.out.printf("�ȳ�! �� �̸��� %s. ���̴� %d���̾�.\n", name, age);
		}else if (age < 20) {
			System.out.printf("�ȳ��ϼ���! �� �̸��� %s. %d���Դϴ�.\n", name, age);
		}else {
			System.out.printf("�ȳ��Ͻʴϱ�! �� �̸��� %s�̰� %d���Դϴ�.\n", name, age);
		}
	}
			void walk() {
		System.out.printf("%s���� �ѹ� ������ %d��ŭ �����Դϴ�.\n", name, speed / 2);
	}
	
	void run() {
		System.out.printf("%s���� %d���� �پ����ϴ�\n", name, speed);
	}
	
	
}
/*
 1. ��ӹ޴� Ŭ������ �����ڿ��� ���� ���� �θ��� �����ڸ� ȣ���ؾ� �Ѵ�.
 	�θ� Ŭ������ �⺻�����ڰ� �����ϸ� ������ �� ������,
 	�������� �������� ������ �Ұ����ϴ�
 	
 2. �ڽ� Ŭ������ �θ��� �޼��带 ������� ���ļ� ����� �� �ִ� (�������̵�, Override)
 
 3. �θ� Ŭ������ �ڽ� Ŭ������ �Ȱ��� �̸��� ���� �ڿ��� �ִ� ���
 	super�� this�� ��Ȯ�ϰ� ������ �� �ִ�
 
 */
		
class Police extends Person {
	
	String name = "������";

	
	//�ڽ� Ŭ������ �����ڿ����� ù �ٿ� super()�� �ݵ�� ȣ���ؾ� �Ѵ�. (�ʼ�)
	public Police() {
		super("�����", 23, 20);
		// super(): �θ� Ŭ������ �����ڸ� ȣ���� �� ����Ѵ�.
	}
	
	@Override
	void sayHi() {
		System.out.printf("�ȳ��Ͻʴϱ�! ���� %s �����Դϴ�.\n", name);
	}
	
	
	void thisSuperTest(String name) {
		System.out.println("�׳� name: " + name);
		System.out.println("this.name: " + this.name);
		System.out.println("super.name: " + super.name);
	}
	
	void arrest(String suspect) {
		System.out.printf("%s ����� ������ %s���� ü���߽��ϴ�" , name, suspect);
	}
}

//class Programmer extends Person {
	// �ڽ� Ŭ�������� �����ڸ� �������� ���� �� ������ �Ⱥ�������
	// �ڽ� Ŭ�������� �⺻ �����ڰ� ����� �θ� Ŭ������ �⺻ �����ڸ� ����Ѵ�
//}


















