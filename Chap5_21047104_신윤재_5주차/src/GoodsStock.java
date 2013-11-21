/**
 * 상품 제고 클레스
 * @author 신윤재
 *
 */
public class GoodsStock {
	//필드(멤버변수)
	String goodsCode;
	int stockNum;
	
	
	//생성자
	
	//public GoodsStock(){}
	
	public GoodsStock(String goodsCode,int stockNum){
		this.goodsCode = goodsCode;
		this.stockNum =  stockNum;
	}
	//멤버 메소드
	/**
	 * 재고를 더한다 기능에 해당하는 메소드
	 * @param amount : 추가하기 위한 제고량 
	 */
	void addSrock(int amount){
		stockNum += amount;//stockNum = stockNum + amount;
	}
	
	/**
	 * 재고를 뺀다 기능에 해당하는 메소드
	 * @param amount : 빼기위한 재고량
	 * @return : 빼기위한 재고량
	 */
	int sudstractStock(int amount){
		if(stockNum<amount){
			return 0;
			
		}
		stockNum -= amount; //stockNum = stockNum - amount;
		return amount;
	}
}
