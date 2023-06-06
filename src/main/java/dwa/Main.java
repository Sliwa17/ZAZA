package dwa;

import jeden.ShoppingItem;
import jeden.ShoppingListUtils;

import java.util.Scanner;

/**
 * Główna klasa aplikacji Lista zakupów. Pozwala użytkownikowi zarządzać listą zakupów.
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ShoppingListUtils shoppingListUtils = new ShoppingListUtils();

    /**
     * Metoda główna aplikacji. Uruchamia interaktywne menu i obsługuje wybory użytkownika.
     *
     * @param args argumenty wiersza poleceń
     */
    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("=== Lista zakupów ===");
            System.out.println("1. Dodaj przedmiot");
            System.out.println("2. Oznacz przedmiot jako zakupiony");
            System.out.println("3. Usuń przedmiot");
            System.out.println("4. Wyświetl listę zakupów");
            System.out.println("5. Wyjdź");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Podaj nazwę przedmiotu: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Podaj ilość: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Podaj cenę: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();

                    ShoppingItem newItem = new ShoppingItem(itemName, quantity, price);
                    shoppingListUtils.addItem(newItem);
                    System.out.println("Przedmiot dodany.");
                    break;
                case 2:
                    System.out.print("Podaj numer indeksu przedmiotu do oznaczenia jako zakupiony: ");
                    int itemIndex = scanner.nextInt();
                    scanner.nextLine();

                    shoppingListUtils.markItemAsPurchased(itemIndex);
                    System.out.println("Przedmiot oznaczony jako zakupiony.");
                    break;
                case 3:
                    System.out.print("Podaj numer indeksu przedmiotu do usunięcia: ");
                    int itemIndexToRemove = scanner.nextInt();
                    scanner.nextLine();

                    shoppingListUtils.removeItem(itemIndexToRemove);
                    System.out.println("Przedmiot usunięty.");
                    break;
                case 4:
                    System.out.println("=== Lista zakupów ===");
                    shoppingListUtils.displayShoppingList();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
                    break;
            }
        }

        System.out.println("Dziękujemy za skorzystanie z aplikacji Lista zakupów!");
    }
}
