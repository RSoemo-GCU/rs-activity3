package beans;

public class Order
{
	//Object variables
	int orderNumber;
	String orderProductName;
	double orderPrice;
	int orderQuantity;
	
	//Object Constructor
	public Order(int orderNumber, String orderProductName, double orderPrice, int orderQuantity) {
		this.orderNumber = orderNumber;
		this.orderProductName = orderProductName;
		this.orderPrice = orderPrice;
		this.orderQuantity = orderQuantity;
	}
	
	//Number getter
	public int getOrderNumber() {
		return orderNumber;
	}
	//Number setter
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	//Name getter
	public String getOrderProductName() {
		return orderProductName;
	}
	//Name setter
	public void setOrderProductName(String orderProductName) {
		this.orderProductName = orderProductName;
	}
	//Price getter
	public double getOrderPrice() {
		return orderPrice;
	}
	//Price setter
	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}
	//Quantity getter
	public int getOrderQuantity() {
		return orderQuantity;
	}
	//Quantity setter
	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
}