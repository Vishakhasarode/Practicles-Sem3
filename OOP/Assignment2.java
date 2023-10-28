import java.util.*;
//Vishakha Sarode SE IT 27069

class Publication {
    String title;
    int copies;
    float price;
    float total_sale;

    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("Enter the title of the publication: ");
        title = sc.nextLine();
        System.out.println("Enter the number of copies of the publication: ");
        copies = sc.nextInt();
        System.out.println("Enter the price of the publication: ");
        price = sc.nextFloat();
        System.out.println("#########");
    }

    public void display() {
        System.out.println("Title of the publication: " + title);
        System.out.println("Number of copies of the publication: " + copies);
        System.out.println("Price of the publication: " + price);
    }
}

class Book extends Publication {
    String author;
    int order;
    float total_price;

    public void input() {
        super.input();
        sc.nextLine(); // Consume the newline character
        System.out.println("Enter the name of the author: ");
        author = sc.nextLine();
        System.out.println("Enter the number of orders: ");
        order = sc.nextInt();
        total_price = price * order;
    }

    public void display() {
        super.display();
        System.out.println("Author of the book: " + author);
        System.out.println("Number of orders: " + order);
        System.out.println("Total Amount for your order is: " + total_price);
    }
}

class Magazine extends Publication {
    int current_issue;
    int receive_issue;
    float total_cost;

    public void input() {
        super.input();
        sc.nextLine(); // Consume the newline character
        System.out.println("Enter the current issue of the magazine: ");
        current_issue = sc.nextInt();
        System.out.println("Enter the receive issue of the magazine: ");
        receive_issue = sc.nextInt();
        total_cost = price * copies;
    }

    public void display() {
        super.display();
        System.out.println("Current issue of the magazine: " + current_issue);
        System.out.println("Receive issue of the magazine: " + receive_issue);
        System.out.println("Total cost of your ordered magazine is: " + total_cost);
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        Publication p = new Publication();
        Book b = new Book();
        Magazine m = new Magazine();
        p.input();
        p.display();
        b.input();
        b.display();
        m.input();
        m.display();
        float totalSale = b.total_price + m.total_cost;
        System.out.println("Total sale of Publication: " + totalSale);
    }
}
