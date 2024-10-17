package restaurant;
// MenuItem class
public class MenuItem {
    private String name;
    // changed price to priceInDollars
    private double priceInDollars;

    // changed price to priceInDollars
    public MenuItem(String name, double priceInDollars) {
        this.name = name;
	// changed price to priceInDollars
        this.priceInDollars = priceInDollars;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
	// changed price to priceInDollars
        return priceInDollars;
    }
}
