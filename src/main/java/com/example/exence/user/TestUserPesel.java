package com.example.exence.user;

import junit.framework.TestCase;
import org.hibernate.validator.internal.constraintvalidators.hv.pl.PESELValidator;

public class TestUserPesel extends TestCase
{

    /**
     * Create the test case
     *
     * @param testName
     *            name of the test case
     */
    /*public TestUserPesel(String testName) {
        super(testName);
    }*/

    /**
     * @return the suite of tests being tested
     */
    /*public static Test suite() {
        return new TestSuite(TestUserPesel.class);
    }*/

    public void testApp()
    {
        PESELValidator validator = new PESELValidator();
        validator.initialize(null); //required initialization

        /*
        String pesel = null;
        assert validator.isValid(pesel, null) : "Pesel jest niepoprawny - wymagane pole!" + pesel;

        pesel = "";
        assert !validator.isValid(pesel, null) : "Pesel jest niepoprawny!" + pesel;

        pesel = "44052401458";
        assert !validator.isValid(pesel, null) : "Pesel jest niepoprawny!" + pesel;

        pesel = "44051401458";
        assert validator.isValid(pesel, null) : "Pesel jest poprawny!" + pesel;
         */

        String validPesel = "88051848299";
        assertTrue(validator.isValid(validPesel, null));

        validPesel = "75120215478";
        assertFalse(validator.isValid(validPesel, null));

        validPesel = "123";
        assertFalse(validator.isValid(validPesel, null));

        validPesel = "123456789101";
        assertFalse(validator.isValid(validPesel, null));

        validPesel = "";
        assertFalse(validator.isValid(validPesel, null));

        validPesel = "abc";
        assertFalse(validator.isValid(validPesel, null));

        validPesel = "*/-+=][;'><.;$@";
        assertFalse(validator.isValid(validPesel, null));
    }
}
