/*
* https://leetcode.com/problems/assign-cookies/
*
* Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie j has a size s[j].
* If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content.
* Your goal is to maximize the number of your content children and output the maximum number.
*
* Solution: Two Pointer.
*/
import java.util.Arrays;

public class N0455_AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        if (s != null && s.length == 0) {
            return 0;
        }
        if (g != null && g.length == 0) {
            return 0;
        }

        Arrays.sort(g);
        Arrays.sort(s);

        int cookieIndex = 0;
        int satisfiedCount = 0;

        while(cookieIndex < s.length && satisfiedCount < g.length) {
            if(s[cookieIndex] >= g[satisfiedCount]) {
                satisfiedCount++;
            }
            cookieIndex++;
        }
        return satisfiedCount;
    }
}
