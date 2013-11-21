
public class ClassExamplel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
       GoodsStock obj;
       
       //obj = new GoodsStock();
       //GoodsStock obj = new GoodsStock
       //GoodsStock obj1 = new GoodsStock();
       
       //obj.goodsCode = "52135";
       //obj.stockNum = 200;
       
       obj = new GoodsStock("52135",200);
      
       
       System.out.println("상품코드 :"+obj.goodsCode);
       System.out.println("재고수량 :"+obj.stockNum);
       
       obj.addSrock(100);
       
       System.out.println("상품코드 :"+obj.goodsCode);
       System.out.println("재고수량 :"+obj.stockNum);
       
       obj.sudstractStock(200);
       
       System.out.println("상품코드 :"+obj.goodsCode);
       System.out.println("재고수량 :"+obj.stockNum);
	}

	
	
}
