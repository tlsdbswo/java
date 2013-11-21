
public class ClassExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	SubscriberInfo obj1	=new SubscriberInfo("name", "id", "password");
	obj1.setPhoneNo("010-8516-5707"); 
	obj1.setAddress("서울특별시 관악구 난향동");
	SubscriberInfo obj2=new SubscriberInfo("안세준", "id", "password");
	obj2.setPhoneNo("010-7724-0590");
	obj2.setAddress("경기도 성남시 분당구");
	
	
	System.out.println(obj1.name+obj1.id+obj1.password+obj1.address+obj1.phoneNo);
	
	//System.out.println(obj1.name+obj1.id+obj1.password+obj1.address+obj1.phoneNo);
	System.out.println("이름: "+obj1.name);
	System.out.println("아이디:"+obj1.id);
	System.out.println("비밀번호:"+obj1.password);
	System.out.println("전화번호:"+obj1.phoneNo);
	System.out.println("주소:"+obj1.address);
	}
	
	
	
}

