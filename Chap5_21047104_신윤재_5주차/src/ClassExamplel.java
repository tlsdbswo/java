
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
      
       
       System.out.println("��ǰ�ڵ� :"+obj.goodsCode);
       System.out.println("������ :"+obj.stockNum);
       
       obj.addSrock(100);
       
       System.out.println("��ǰ�ڵ� :"+obj.goodsCode);
       System.out.println("������ :"+obj.stockNum);
       
       obj.sudstractStock(200);
       
       System.out.println("��ǰ�ڵ� :"+obj.goodsCode);
       System.out.println("������ :"+obj.stockNum);
	}

	
	
}
