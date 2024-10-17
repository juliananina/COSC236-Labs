package restaurant;
// Main class to demonstrate collaboration
public class RestaurantApp {
    public static void main(String[] args) {
        // Creating customer
    	// Set customer name to “Bob”
        Customer customer = new Customer("Bob");
        
        // Creating menu items
        // Added one dollar to the price of each menu item
        MenuItem pizza = new MenuItem("Pizza", 9.99);
        MenuItem burger = new MenuItem("Burger", 6.49);
        MenuItem soda = new MenuItem("Soda", 2.99);
        
        // Customer adds items to their order
        // Changed addMenuItemToOrder to addToOrder
        customer.addToOrder(pizza);  // Collaborating with MenuItem and Order
        customer.addToOrder(burger);
        customer.addToOrder(soda);
        
        // Customer places the order
        customer.placeOrder();  // Collaborating with Order to show order summary
    }
}
