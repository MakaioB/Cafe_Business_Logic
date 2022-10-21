import java.util.ArrayList;

public class CafeUntil {
    public int getStreakGoal(int numWeeks) {
        int total = 0;
        for (int i = 0; i <= numWeeks; i++) {
            total = total + i; 
            System.out.println(total);
        }
        return(total);
    }

    public double getOrderTotal(double[] prices){
        double total = 0;
        for (int i = 0; i < prices.length; i++) {
            total = total + prices[i];
            System.out.println(total);
        }
        return total;
    }

    public void displayMenu(ArrayList<String>menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            String menu = menuItems.get(i);
            System.out.println(menu);
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        System.out.printf("There are %s people in front of you.", customers.size());
        customers.add(userName);
        System.out.println(customers);
    }
}

