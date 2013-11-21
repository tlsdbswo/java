
public class Account {
//1. 멤버변수
	String accountNo;
	String ownerName;
	int balance;
	//2. 생성자	
    Account(){
	}
     
	//3. 멤버 메소드	
   void deposit (int account){
	    this.balance += account;
   }
   
   int witgdraw(int account){
	   if(this.balance < account){
		   return 0;  
	   }
	   return this.balance -= account;
    }
}
