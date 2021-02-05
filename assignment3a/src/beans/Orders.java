package beans;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Orders
{
	//Class Variables
	ArrayList<Order> orders = new ArrayList<Order>();

	//constructor
	public Orders()
	{
		//object 1
		Order addition1 = new Order(1, "Cookies", 2.00, 5);
		orders.add(addition1);
		
		//object 2
		Order addition2 = new Order(2, "Brownies", 5.40, 3);
		orders.add(addition2);
		
		//object 3
		Order addition3 = new Order(3, "Lollipops", .50, 20);
		orders.add(addition3);
	}
	
	//orders getter
	public ArrayList<Order> getOrders() {
		return orders;
	}

	//orders setter
	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}
}