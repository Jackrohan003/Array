/**WAP for the below condition if array is {3,5,6,2}

*  then output is {60,36,30,90}

*  The Logic is

{(5*6*2) ,(6*2*3),(2*3*5),(3*5*6)}

 

*
*

*

 **/

package codes;

import java.util.ArrayList;

import java.util.Iterator;

import java.util.List;

public class mutliply_OtherNumbers {

	public static void main(String[] args) {

		int a[] = { 3, 5, 6, 2 };

		List a2 = new ArrayList();

		for (int i = 0; i < a.length; i++) {

			int p1 = 1;

			for (int j = 0; j < a.length; j++) {

				if (i != j) {

					p1 = p1 * a[j];

				}

			}

			a2.add(p1);

		}

		Iterator itr = a2.iterator();

		while (itr.hasNext()) {

			System.out.print(itr.next() + " ");

		}

	}

}
