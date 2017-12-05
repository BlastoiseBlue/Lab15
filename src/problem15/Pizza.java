package problem15;

import java.text.NumberFormat;

public class Pizza {
	private int size = 0;
	private int numCheese = 0;
	private int numPepperoni = 0;
	private int numHam = 0;
	private double baseCost = 10.0; // Base cost of the pizza
	private double sizeCost = 2.0; // Cost of increasing size by 1 level
	private double toppingCost = 2.0; // Cost per topping
	NumberFormat numberFormatter = NumberFormat.getCurrencyInstance();

	public String pizzaSize() {
		switch (size) {
		case 0:
			return "Small";
		case 1:
			return "Medium";
		case 2:
			return "Large";
		default:
			return null;
		}
	}

	public void setSize(int inputSize) {
		if (inputSize >= 0 && inputSize <= 2)
			size = inputSize;
		else
			size = 0;
	}

	public void setSize(String inputSize) {
		switch (inputSize.toLowerCase()) {
		case "small":
			size = 0;
			break;
		case "medium":
			size = 1;
			break;
		case "large":
			size = 2;
			break;
		default:
			size = 0;
		}
	}

	public void setCheese(int inputCheese) {
		numCheese = inputCheese;
	}

	public void setPepperoni(int inputPepperoni) {
		numPepperoni = inputPepperoni;
	}

	public void setHam(int inputHam) {
		numHam = inputHam;
	}

	public double cheeseCost() {
		return ((double) numCheese * toppingCost);
	}

	public double pepperoniCost() {
		return ((double) numPepperoni * toppingCost);
	}

	public double hamCost() {
		return ((double) numHam * toppingCost);
	}

	public double calcCost() {
		return (baseCost + (size * sizeCost) + ((numCheese + numPepperoni + numHam) * toppingCost));
	}

	public void getDescription() {
		System.out.println(pizzaSize() + " pizza: " + numberFormatter.format((baseCost + (size * sizeCost))));
		System.out.println(numCheese + " cheese toppings: " + numberFormatter.format(cheeseCost()));
		System.out.println(numPepperoni + " pepperoni toppings: " + numberFormatter.format(pepperoniCost()));
		System.out.println(numHam + " ham toppings: " + numberFormatter.format(hamCost()));
		System.out.println("Total cost: " + numberFormatter.format(calcCost()));
	}

	public Pizza() {

	}

	public Pizza(Pizza pizza) {
		setSize(pizza.size);
		setCheese(pizza.numCheese);
		setPepperoni(pizza.numPepperoni);
		setHam(pizza.numHam);
	}

	public Pizza(int inputSize) {
		setSize(inputSize);
	}

	public Pizza(String inputSize) {
		setSize(inputSize);
	}

	public Pizza(int inputSize, int inputCheese, int inputPepperoni, int inputHam) {
		setSize(inputSize);
		setCheese(inputCheese);
		setPepperoni(inputPepperoni);
		setHam(inputHam);
	}

	public Pizza(String inputSize, int inputCheese, int inputPepperoni, int inputHam) {
		setSize(inputSize);
		setCheese(inputCheese);
		setPepperoni(inputPepperoni);
		setHam(inputHam);
	}
}
