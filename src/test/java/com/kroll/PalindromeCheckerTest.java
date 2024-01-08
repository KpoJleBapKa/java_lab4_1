package com.kroll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {

    @Test
    public void testIsTextPalindrome() {
        assertTrue(Main.isTextPalindrome("А баба на волі цілована баба"));
        assertTrue(Main.isTextPalindrome("Уму мінімуму"));
        assertTrue(Main.isTextPalindrome("Три психи пили Пилипихи спирт"));
        assertTrue(Main.isTextPalindrome("І розморозь зором зорі"));
    }
}
