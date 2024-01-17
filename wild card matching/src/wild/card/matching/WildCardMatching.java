/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wild.card.matching;
class Main
{	
	// Function that matches input String with given wildcard pattern
	public static boolean isMatching(char[] str, char[] pattern, int n, int m, 
									boolean[][] lookup)
	{
		// If both input string and pattern reaches their end,
		// return true
		if (m < 0 && n < 0) {
			return true;
		}

		// If only pattern reaches its end, return false
		else if (m < 0) {
			return false;
		}

		// If only input string reaches its end, return true
		// if remaining characters in the pattern are all '*'
		else if (n < 0)
		{
			for (int i = 0; i <= m; i++) {
				if (pattern[i] != '*') {
					return false;
				}
			}

			return true;
		}

		// If the sub-problem is encountered for the first time
		if (!lookup[n][m])
		{
			if (pattern[m] == '*')
			{
				// 1. * matches with current characters in input string.
				// Here we will move to next character in the string

				// 2. Ignore * and move to next character in the pattern
				lookup[n][m] = isMatching(str, pattern, n - 1, m, lookup) ||
							isMatching(str, pattern, n, m - 1, lookup);
			}
			else {
				// If the current character is not a wildcard character, it
				// should match with current character in the input string
				if (pattern[m] != '?' && pattern[m] != str[n]) {
					lookup[n][m] = false;
				}
				// check if pattern[0..m-1] matches str[0..n-1]
				else {
					lookup[n][m] = isMatching(str, pattern, n - 1, m - 1, lookup);
				}
			}
		}

		return lookup[n][m];
	}

	// main function
	public static void main(String[] args)
	{
		char[] str = "xyxzzxy".toCharArray();
		char[] pattern = "x***x?".toCharArray();

		// create a DP lookup table
		boolean[][] lookup = new boolean[str.length + 1][pattern.length + 1];

		if (isMatching(str, pattern, str.length - 1, pattern.length - 1, lookup)) {
			System.out.print("Match");
		} else {
			System.out.print("No Match");
		}
	}
}