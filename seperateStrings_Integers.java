/** WAP to accept both numbers and Strings and then separate them
 *
 *
 */

package codes;

import java.util.ArrayList;
import java.util.List;

public class seperateStrings_Integers {

	public static void main(String[] args) {
		List mix = new ArrayList();
		List integers = new ArrayList();
		List strings = new ArrayList();

		mix.add("Virat");
		mix.add(64);
		mix.add(07);
		mix.add("Dhoni");
		mix.add("Sachin");
		mix.add(49);
		for (int i = 0; i < mix.size(); i++) {
			if (mix.get(i) instanceof String) {
				strings.add(mix.get(i));
			}

			else {
				integers.add(mix.get(i));
			}
		}

		System.out.println(strings);
		System.out.println(integers);

	}

}
