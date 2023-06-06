import jeden.ShoppingItem;
import jeden.ShoppingListUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Klasa testowa do testowania funkcjonalności klasy jeden.ShoppingListUtils.
 */
public class ShoppingListTest {
    private ShoppingListUtils shoppingListUtils;

    /**
     * Konfiguracja przed każdym testem.
     */
    @BeforeEach
    public void setup() {
        shoppingListUtils = new ShoppingListUtils();
    }

    /**
     * Test dodawania przedmiotu do listy zakupów.
     */
    @Test
    public void testAddItem() {
        ShoppingItem item = new ShoppingItem("Mleko", 2, 3.99);
        shoppingListUtils.addItem(item);

        Assertions.assertEquals(1, shoppingListUtils.getShoppingList().size());
    }

    /**
     * Test usuwania przedmiotu z listy zakupów.
     */
    @Test
    public void testRemoveItem() {
        ShoppingItem item1 = new ShoppingItem("Chleb", 1, 2.49);
        ShoppingItem item2 = new ShoppingItem("Masło", 1, 5.99);
        shoppingListUtils.addItem(item1);
        shoppingListUtils.addItem(item2);

        shoppingListUtils.removeItem(0);

        Assertions.assertEquals(1, shoppingListUtils.getShoppingList().size());
        Assertions.assertEquals("Masło", shoppingListUtils.getShoppingList().get(0).getName());
    }

    /**
     * Test oznaczania przedmiotu jako zakupiony.
     */
    @Test
    public void testMarkItemAsPurchased() {
        ShoppingItem item1 = new ShoppingItem("Jajka", 6, 4.99);
        ShoppingItem item2 = new ShoppingItem("Ser", 1, 7.99);
        shoppingListUtils.addItem(item1);
        shoppingListUtils.addItem(item2);

        shoppingListUtils.markItemAsPurchased(0);

        Assertions.assertTrue(shoppingListUtils.getShoppingList().get(0).isPurchased());
        Assertions.assertFalse(shoppingListUtils.getShoppingList().get(1).isPurchased());
    }
}
