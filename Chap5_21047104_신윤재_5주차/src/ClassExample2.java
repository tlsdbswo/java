
public class ClassExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	SubscriberInfo obj1	=new SubscriberInfo("name", "id", "password");
	obj1.setPhoneNo("010-8516-5707"); 
	obj1.setAddress("����Ư���� ���Ǳ� ���⵿");
	SubscriberInfo obj2=new SubscriberInfo("�ȼ���", "id", "password");
	obj2.setPhoneNo("010-7724-0590");
	obj2.setAddress("��⵵ ������ �д籸");
	
	
	System.out.println(obj1.name+obj1.id+obj1.password+obj1.address+obj1.phoneNo);
	
	//System.out.println(obj1.name+obj1.id+obj1.password+obj1.address+obj1.phoneNo);
	System.out.println("�̸�: "+obj1.name);
	System.out.println("���̵�:"+obj1.id);
	System.out.println("��й�ȣ:"+obj1.password);
	System.out.println("��ȭ��ȣ:"+obj1.phoneNo);
	System.out.println("�ּ�:"+obj1.address);
	}
	
	
	
}

