
public class Account {
//1. �������
	String accountNo;
	String ownerName;
	int balance;
	//2. ������	
    Account(){
	}
     
	//3. ��� �޼ҵ�	
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
