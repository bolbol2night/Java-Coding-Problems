/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.homesweethome.javacodingproblems.chapter01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import jdk.jfr.Unsigned;

/**
 *
 * @author bilel
 */
public class CountingDuplicateCharacters {
    
    String string;
    Map<Character, Integer> inspection;
    
    public int GetDistinctCharacters()
    {
        return inspection.size();
    }
    
    public int GetCharacterOccurrence(Character c)
    {
        return inspection.get(c);
    }
    
    public CountingDuplicateCharacters(String string)
    {
        this.string = string;
        inspection = new HashMap<>();
    }
    
    public void inspect()
    {
        for (int idx=0; idx<string.length(); ++idx)
        {
            Character c = string.charAt(idx);
            if (!inspection.containsKey(c))
                inspection. put(c, 1);
            else
                inspection. put(c, inspection.get(c) + 1);
        }
    }
    
    public void summary()
    {
        if (!string.isEmpty() && inspection.isEmpty())
        {
            inspect();
        }
        
        Set set = inspection.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext())
        {
            Map.Entry entry = (Map.Entry)it.next();
            if ((Integer)entry.getValue() > 1)
            {
                System.out.println("Character '" + entry.getKey() + "' repeated " + entry.getValue() + " times.");
            }
        }
    }
    
    public static void main(String[] args)
    {
        // first args is the string to parse
        CountingDuplicateCharacters instance = new CountingDuplicateCharacters(args[0]);
        instance.inspect();
        instance.summary();
    }
}
