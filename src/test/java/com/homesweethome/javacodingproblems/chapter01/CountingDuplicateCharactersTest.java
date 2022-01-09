/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.homesweethome.javacodingproblems.chapter01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bilel
 */
public class CountingDuplicateCharactersTest {
    
    public CountingDuplicateCharactersTest() {
    }
    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of inspect method, of class CountingDuplicateCharacters.
     */
    @org.junit.jupiter.api.Test
    public void testInspect() {
        System.out.println("inspect");
        CountingDuplicateCharacters instance = null;
        try
        {
            instance.inspect();
            fail("Calling inspect on a null sentence should throw an exception!");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @org.junit.jupiter.api.Test
    public void testInspectWithEmptySentence() {
        System.out.println("inspect");
        CountingDuplicateCharacters instance = new CountingDuplicateCharacters("");
        instance.inspect();
        assertEquals(0, instance.GetDistinctCharacters());
    }

    @org.junit.jupiter.api.Test
    public void testInspectWithASentenceWithNoDuplicateCharacters() {
        System.out.println("inspect");
        CountingDuplicateCharacters instance = new CountingDuplicateCharacters("abcdefghijklmnopqrstuvwxyz");
        instance.inspect();
        assertEquals(26, instance.GetDistinctCharacters());
    }

    @org.junit.jupiter.api.Test
    public void testInspectWithASentenceWithAllCharactersDuplicated() {
        System.out.println("inspect");
        String sentence = "aaaaaaaaaaaaaaaaaaaaaaaaaa";
        CountingDuplicateCharacters instance = new CountingDuplicateCharacters(sentence);
        instance.inspect();
        assertEquals(1, instance.GetDistinctCharacters());
    }

    /**
     * Test of summary method, of class CountingDuplicateCharacters.
     */
    @org.junit.jupiter.api.Test
    public void testSummary() {
        System.out.println("summary");
        CountingDuplicateCharacters instance = null;
        try
        {
            instance.summary();
            fail("Calling summary on a null sentence should throw an exception!");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @org.junit.jupiter.api.Test
    public void testSummaryWithASentenceWithOneCharacterDuplicated() {
        System.out.println("inspect");
        String sentence = "aaaaaaaaaaaaaaaaaaaaaaaaaa";
        CountingDuplicateCharacters instance = new CountingDuplicateCharacters(sentence);
        instance.summary();
        assertEquals(sentence.length(), instance.GetCharacterOccurrence('a'));
    }

    @org.junit.jupiter.api.Test
    public void testSummaryWithASentenceWithAllCharactersDuplicated() {
        System.out.println("inspect");
        String sentence = "aabbccddeeffgghhAABBCCDDEEFFGGHH";
        CountingDuplicateCharacters instance = new CountingDuplicateCharacters(sentence);
        instance.summary();
        assertEquals(2, instance.GetCharacterOccurrence('a'));
        assertEquals(2, instance.GetCharacterOccurrence('b'));
        assertEquals(2, instance.GetCharacterOccurrence('c'));
        assertEquals(2, instance.GetCharacterOccurrence('d'));
        assertEquals(2, instance.GetCharacterOccurrence('e'));
        assertEquals(2, instance.GetCharacterOccurrence('f'));
        assertEquals(2, instance.GetCharacterOccurrence('g'));
        assertEquals(2, instance.GetCharacterOccurrence('h'));
        assertEquals(2, instance.GetCharacterOccurrence('A'));
        assertEquals(2, instance.GetCharacterOccurrence('B'));
        assertEquals(2, instance.GetCharacterOccurrence('C'));
        assertEquals(2, instance.GetCharacterOccurrence('D'));
        assertEquals(2, instance.GetCharacterOccurrence('E'));
        assertEquals(2, instance.GetCharacterOccurrence('F'));
        assertEquals(2, instance.GetCharacterOccurrence('G'));
        assertEquals(2, instance.GetCharacterOccurrence('H'));
    }

    /**
     * Test of main method, of class CountingDuplicateCharacters.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        try
        {
            CountingDuplicateCharacters.main(args);
            fail("Calling main without arguments should throw an exception!");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }    
}
