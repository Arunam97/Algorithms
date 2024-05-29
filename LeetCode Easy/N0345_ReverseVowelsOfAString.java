/*
* https://leetcode.com/problems/reverse-vowels-of-a-string/
*
* Given a string s, reverse only all the vowels in the string and return it.
* The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
*
* Solution: Two Pointer.
 */

public class N0345_ReverseVowelsOfAString {
    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'  || ch == 'o'  || ch == 'u'  ||
                ch == 'A'  || ch == 'E'  || ch == 'I'  || ch == 'O'  || ch == 'U' ;
    }

    public void swap(char[] charArray, int index1, int index2) {
        char temp = charArray[index1];
        charArray[index1] = charArray[index2];
        charArray[index2] = temp;
    }

    public String reverseVowels(String s) {

        char[] charArray = s.toCharArray();
        int head = 0;
        int tail = charArray.length - 1;
        while (head < tail) {
            while (head < charArray.length && !isVowel(charArray[head])) {
                head++;
            }
            while (tail >= 0 && !isVowel(charArray[tail])) {
                tail--;
            }
            if(head < tail) {
                swap(charArray, head, tail);
                head++;
                tail--;
            }
        }
        return new String(charArray);
    }
}
