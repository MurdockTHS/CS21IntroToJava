// Name: Abner Acosta
// Date: June 22, 2022
// Course: CS21
public class TicketPurchase
{
    public static void receipt()
    {
        double ticket1 = 162.03, ticket2 = 99.36, ticket3 = 21.02,ticket4 = 436.36;
        double subtotal = ticket1 + ticket2 + ticket3 + ticket4;
        double tax = 0.08;
        double taxAmount = subtotal * tax;
        double totalCost = taxAmount + subtotal;
        
        System.out.println("Ticket 1: $" + ticket1);
        System.out.println("Ticket 2: $" + ticket2);
        System.out.println("Ticket 3: $" + ticket3);
        System.out.println("Ticket 4: $" + ticket4);
        System.out.println("======================");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Sales tax = 0.08%");
        System.out.println("Tax amount: $" + taxAmount);
        System.out.println("Total: $" + totalCost);
    }
    public static void main(String[] args)
    {
        receipt();
        System.out.println();
    }

}
