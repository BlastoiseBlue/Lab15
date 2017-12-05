package problem15;

public class Driver {

	public static void main(String[] args) {
		Pizza pizza1 = new Pizza("small", 2, 2, 3);
		Pizza pizza2 = new Pizza(2, 1, 4, 3);
		Pizza pizza3 = new Pizza("large", 5, 3, 4);
		Pizza pizza4 = new Pizza(1, 4, 5, 3);
		Pizza pizza5 = new Pizza("medium", 6, 4, 5);
		Pizza[] group1 = { pizza1, pizza2, pizza3, pizza4, pizza5 };
		PizzaOrder order1 = new PizzaOrder(group1);
		PizzaOrder.outputTotal(group1);
	}

}
