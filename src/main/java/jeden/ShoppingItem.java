package jeden;

/**
 * Klasa reprezentująca przedmiot na liście zakupów.
 */
public class ShoppingItem {
    private String name;
    private int quantity;
    private double price;
    private boolean purchased;

    /**
     * Tworzy nowy obiekt przedmiotu na liście zakupów.
     *
     * @param name     nazwa przedmiotu
     * @param quantity ilość przedmiotu
     * @param price    cena przedmiotu
     */
    public ShoppingItem(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.purchased = false;
    }

    /**
     * Zwraca nazwę przedmiotu.
     *
     * @return nazwa przedmiotu
     */
    public String getName() {
        return name;
    }

    /**
     * Sprawdza, czy przedmiot został zakupiony.
     *
     * @return true, jeśli przedmiot jest zakupiony; false w przeciwnym razie
     */
    public boolean isPurchased() {
        return purchased;
    }

    /**
     * Ustawia status zakupiony/niezakupiony dla przedmiotu.
     *
     * @param purchased true, jeśli przedmiot ma zostać oznaczony jako zakupiony; false w przeciwnym razie
     */
    public void setPurchased(boolean purchased) {
        this.purchased = purchased;
    }

    /**
     * Zwraca tekstową reprezentację przedmiotu.
     *
     * @return tekstowa reprezentacja przedmiotu
     */
    @Override
    public String toString() {
        return "Przedmiot: " + name + " | Ilość: " + quantity + " | Cena: " + price + " | Zakupiony: " + purchased;
    }
}
