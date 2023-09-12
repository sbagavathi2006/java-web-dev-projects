package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //Test 2:
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //Test 3: opening bracket comes before the closing bracket;

    @Test
    public  void openingBracketComesBeforeClosingBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    //Test 4: adding test with actual string inside brackets;

    @Test
    public void bracketsWithStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    //Test 5: if adding one char inside the brackets return true;
    @Test
    public void bracketsWithOneCharReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[L]"));
    }


    //Test 6: if adding only opening bracket returns false;
    @Test
    public void openingBracketOnlyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch"));
    }

    //Test 7: if adding only closing bracket returns false;

    @Test
    public void closingBracketOnlyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]"));
    }

    //Test 8: if balanced brackets before the string returns true;

    @Test
    public void balancedBracketsBeforeReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Launch"));
    }

    //Test 9: if balanced brackets after the string returns true;

    @Test
    public void balancedBracketsAfterReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[]"));
    }

    //Test 10: if null is passed in return false.??
    @Test
    public void nullPassedInReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    //Test 11: if there is no brackets returns true.
    @Test
    public void onlyStringWithNoBracketReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch"));
    }

    //Test 12: ("Launch]Code[") if unordered bracket returns false;
    @Test
    public void unOrderedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
}