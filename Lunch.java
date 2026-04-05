
  import java.util.Scanner;

  public class Lunch 
  {
        public static void main(String[] args) {

        Lunchbox[] orders = new Lunchbox[5];
        
int count = 0;

Scanner input = new Scanner(System.in);
boolean running = true;

orders[count] = new Lunchbox("Kate", "Pizza", 2, 12.50);
count++;

orders[count] = new Lunchbox("John", "Burger", 1, 9.99);
count++;

orders[count] = new Lunchbox("Emma", "Pasta", 3, 15.50);
count++;

while (running) {
  System.out.println("\n--- MENU ---");
System.out.println("1. View Orders");
System.out.println("2. Add Order");
System.out.println("3. Exit");
System.out.print("Choose an option: ");  

    int choice = input.nextInt();

    if (choice == 1) {
    for (int i = 0; i < count; i++) {
        System.out.println("Order #" + (i + 1));
        orders[i].displayOrder();
        System.out.println();
    }
}
else if (choice == 2) {
  System.out.print("Enter customer name: ");
String name = input.next();

System.out.print("Enter item: ");
String item = input.next();

System.out.print("Enter quantity: ");
int qty = input.nextInt();

System.out.print("Enter price: ");
double price = input.nextDouble();

orders[count] = new Lunchbox(name, item, qty, price);
count++;

System.out.println("Order added!");
}


      else if (choice == 3) {
        running = false;
        System.out.println("Goodbye!");
    }
    else {
    System.out.println("Invalid choice.");
}
}
}
}

       


        
    

    


