package jeden;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasa pomocnicza do zarządzania listą zakupów.
 */
public class ShoppingListUtils {
    private List<ShoppingItem> shoppingList;

    /**
     * Tworzy nowy obiekt pomocniczy do zarządzania listą zakupów.
     */
    public ShoppingListUtils() {
        this.shoppingList = new ArrayList<>();
    }

    /**
     * Dodaje przedmiot do listy zakupów.
     *
     * @param item przedmiot do dodania
     */
    public void addItem(ShoppingItem item) {
        shoppingList.add(item);
    }

    /**
     * Usuwa przedmiot z listy zakupów na podstawie podanego indeksu.
     *
     * @param index indeks przedmiotu do usunięcia
     */
    public void removeItem(int index) {
        if (index >= 0 && index < shoppingList.size()) {
            shoppingList.remove(index);
        } else {
            System.out.println("Nieprawidłowy numer indeksu.");
        }
    }

    /**
     * Oznacza przedmiot na liście zakupów jako zakupiony na podstawie podanego indeksu.
     *
     * @param index indeks przedmiotu do oznaczenia jako zakupiony
     */
    public void markItemAsPurchased(int index) {
        if (index >= 0 && index < shoppingList.size()) {
            ShoppingItem item = shoppingList.get(index);
            item.setPurchased(true);
        } else {
            System.out.println("Nieprawidłowy numer indeksu.");
        }
    }

    /**
     * Wyświetla listę zakupów na konsoli.
     */
    public void displayShoppingList() {
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(i + ". " + shoppingList.get(i).toString());
        }
    }

    /**
     * Zwraca listę zakupów.
     *
     * @return lista zakupów
     */
    public List<ShoppingItem> getShoppingList() {
        return shoppingList;
    }
}
