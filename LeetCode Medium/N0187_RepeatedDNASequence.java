/*
 * https://leetcode.com/problems/repeated-dna-sequences/
 * 
 * The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.
 * Given a string s that represents a DNA sequence, 
 * return all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule. 
 * You may return the answer in any order.
 */
import java.util.*;
public class N0187_RepeatedDNASequence
{
    // We store all the possible 10 letter sequences to a set
    // and if we see them again we add them to our output set.
    public List<String> findRepeatedDnaSequences(String s) 
    {
        Set<String> set = new HashSet<String>();
        Set<String> output = new HashSet<String>();
        for (int i = 0 ; i < s.length() - 10 + 1 ; i++)
        {
            String str = s.substring(i, i + 10);
            if (!set.add(str))
            {
                output.add(str);
            }
        }
        return new ArrayList<String>(output);
    }  
}
