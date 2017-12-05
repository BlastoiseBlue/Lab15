package problem15;

import java.text.NumberFormat;

public class PizzaOrder {
	private int numPizzas = 1;
	static double totalCost = 0.0;
	Pizza pizza1 = new Pizza();
	Pizza pizza2 = new Pizza();
	Pizza pizza3 = new Pizza();
	static NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();

	public int getNumPizzas() {
		return numPizzas;
	}

	public Pizza getPizza1() {
		return pizza1;
	}

	public Pizza getPizza2() {
		return pizza2;
	}

	public Pizza getPizza3() {
		return pizza3;
	}

	public void setNumPizzas(int inputNumPizzas) {
		// if (inputNumPizzas >= 1 && inputNumPizzas <= 3)
		numPizzas = inputNumPizzas;
	}

	public void placeOrder() {
		switch (numPizzas) {
		case 3:
			pizza3 = new Pizza();
		case 2:
			pizza2 = new Pizza();
		case 1:
			pizza1 = new Pizza();
			break;
		default:
			System.out.println("ERROR: Invalid quantity of pizzas.");
		}
	}

	public void placeOrder(Pizza[] pizza) {
		Pizza[] order = new Pizza[pizza.length];
		for (int i = 0; i < pizza.length; i++) {
			order[i] = new Pizza(pizza[i]);
		}
	}

	public void placeOrder(int inputNumPizzas) {
		setNumPizzas(inputNumPizzas);
		placeOrder();
	}

	public void setPizza(Pizza pizza, int size, int numCheese, int numPepperoni, int numHam) {
		pizza.setSize(size);
		pizza.setCheese(numCheese);
		pizza.setPepperoni(numPepperoni);
		pizza.setHam(numHam);
	}

	public void setPizza(Pizza pizza, String size, int numCheese, int numPepperoni, int numHam) {
		pizza.setSize(size);
		pizza.setCheese(numCheese);
		pizza.setPepperoni(numPepperoni);
		pizza.setHam(numHam);
	}

	public void setPizza(Pizza inputPizza) {

	}

	public void setPizza1(Pizza inputPizza) {
		pizza1 = new Pizza(inputPizza);
	}

	public void setPizza2(Pizza inputPizza) {
		pizza2 = new Pizza(inputPizza);
	}

	public void setPizza3(Pizza inputPizza) {
		pizza3 = new Pizza(inputPizza);
	}

	/*
	 * public double calcTotal() { totalCost = 0.0; switch (numPizzas) { case 3:
	 * totalCost = totalCost + pizza3.calcCost(); case 2: totalCost = totalCost +
	 * pizza2.calcCost(); case 1: totalCost = totalCost + pizza1.calcCost(); break;
	 * } return totalCost; }
	 */
	public static double calcTotal(Pizza[] pizza) {
		totalCost = 0.0;
		for (int i = 0; i < pizza.length; i++) {
			totalCost += pizza[i].calcCost();
		}
		return totalCost;
	}

	public static void outputTotal(Pizza[] pizza) {
		System.out.println(moneyFormatter.format(calcTotal(pizza)));
	}

	/*
	 * public PizzaOrder() { placeOrder(); }
	 * 
	 * public PizzaOrder(int inputNumPizzas) { setNumPizzas(inputNumPizzas);
	 * placeOrder(inputNumPizzas); }
	 * 
	 * public PizzaOrder(PizzaOrder pizzaOrder) {
	 * setNumPizzas(pizzaOrder.numPizzas); placeOrder(pizzaOrder.numPizzas);
	 * setPizza1(pizzaOrder.pizza1); setPizza2(pizzaOrder.pizza2);
	 * setPizza3(pizzaOrder.pizza3); }
	 */
	public PizzaOrder(Pizza[] inputPizza) {
		placeOrder(inputPizza);
	}
}
