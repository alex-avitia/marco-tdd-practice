import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTests {

    @Test
    public void testIfCompanyNameIsEquals() {
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);
        assertNotEquals("Alex", actual);
    }

    @Test
    public void testIfArrayListsAreSame() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void testIfArrayIsEqual() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testIfStringContains() {
        String language = "PHP";
        assertTrue(language.contains("H")); // use assertTrue for this statement
        assertFalse(language.contains("J")); // use assertFalse for this statement
    }

//    @Test
//    public void testManhattan() {
//        ArrayList<String> ingredients = new ArrayList<>();
//        ArrayList<String> manhattan = new ArrayList<>();
//        ingredients.add("gin");
//        ingredients.add("vodka");
//        ingredients.add("whiskey");
//        ingredients.add("tequila");
//        ingredients.add("rum");
//        ingredients.add("sweet vermouth");
//        ingredients.add("dry vermouth");
//        ingredients.add("lemon juice");
//        ingredients.add("lime juice");
//        ingredients.add("simple syrup");
//        ingredients.add("orange");
//        ingredients.add("cherry");
//        ingredients.add("bitters");
//
//        manhattan.add("whiskey");
//        manhattan.add("sweet vermouth");
//        manhattan.add("bitters");
//
//        assert
//    }

//    @Test
//    public void testIfChangeIsCorrect() {
//        Double price = 10.0;
//        Double discount = 4.5;
//
//        assertEquals(5.5, price - discount, 0);
//        assertEquals(5.1, price - discount, 0.5);
//        assertNotEquals(4.9, price - discount, 0.5);
//    }

//    @Test
//    public void testIfObjectsAreDifferent() {
//        Object dog = new Object();
//        Object sheep = new Object();
//
//        String instructor1 = "Douglas";
//        String instructor2 = instructor1;
//
//        assertSame(instructor1, instructor2);
//
//        assertNotSame(dog, sheep);
//    }

//    @Test
//    public void testIfArrayEquals() {
//        char[] expected = {'J','u','n','i','t'};
//        char[] actual = "Junit".toCharArray();
//
//        assertArrayEquals(expected, actual);
//    }
}
