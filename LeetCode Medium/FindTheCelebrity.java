/*
 * https://leetcode.com/problems/find-the-celebrity/
 * 
 * Suppose you are at a party with n people labeled from 0 to n - 1 and among them,
 * there may exist one celebrity. 
 * The definition of a celebrity is that all the other n - 1 people know the celebrity, 
 * but the celebrity does not know any of them.
 * You are given a helper function bool knows(a, b) that tells you whether a knows b. 
 * Implement a function int findCelebrity(n). There will be exactly one celebrity if they are at the party.
 * Return the celebrity's label if there is a celebrity at the party. If there is no celebrity, return -1.
 */
/* 
 * The knows API is defined in the parent class Relation. 
 * boolean knows(int a, int b); Returns true if a knows b, else false.
 */
public class FindTheCelebrity extends Relation
{
    public int findCelebrity(int n) 
    {
        /*
         * Intuition: Whenever we call knows(i, j), we can always determine if either i or j is NOT a celebrity.
         * If knows(i, j) returns true that means i cannot be a celebrity but j can possibly be a celebrity; because i knows someone.
         * If knows(i, j) returns false that means j cannot be a celebrity but i possibly can be a celebrity; because j knows someone.
         * We can use this logic to find the celebrity.
         */
        int presumedCeleb = 0; // We assume that the first person is the celebrity.
        for (int person = 0 ; person < n ; person++)
        {
            /*
             * If the presumed celebrity knows anyone, then that person cannot be a celebrity.
             * Storing the most likely presumed celebrity and checking if they are the celebrity 
             * is more efficient than checking if all people are celebrities.
             */
            if (knows(presumedCeleb, person))
            {
                // Change presumedCeleb to the person we were checking against. (As that person could be a celebrity).
                presumedCeleb = person;
            }
        }
        // Here we check if our presumed celebrity is a celebrity.
        if (isCelebrity(presumedCeleb, n))
        {
            return presumedCeleb;
        }
        return -1;
    }
    
    // Simple algorithm to return true if a person is a celebrity.
    private boolean isCelebrity(int presumedCeleb, int n)
    {
        for (int i = 0 ; i < n ; i++)
        {
            // A person always knows themself, therefore we skip over that condition.
            if (presumedCeleb == i)
            {
                continue;
            }
            // If a 'person' knows another person 'i' or if 'i' does not know that 'person', then 'person' is not celebrity.
            if (knows(presumedCeleb, i) || !knows(i, presumedCeleb))
            {
                return false;
            }
        }
        return true;
    }
}
