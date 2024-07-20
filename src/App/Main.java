package App;

import java.util.Scanner;


class Main {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name.");
        String name = scanner.nextLine();
        System.out.println("Enter your Address.");
        String address = scanner.nextLine();
        String product;
        product = "smartphone";
        byte p = 20;
        System.out.println ("Order No 1 Client: " +name  +
                "\nProduct: " + product +
                "\nPrice: " + p + "\n Address: "+ address + "\nThank you for your order!");
    }
}
