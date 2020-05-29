/** WAP to input 2 arrays sort them and then put both in third array in sorted order without using any Sorting technique
 * 
 * 
 */

package codes;

public class Sorted_Array_into_Third_Array {

	public static void main(String[] args) {

		int a[] = { 2, 8, 15, 20 };
		int b[] = { 1, 6, 19, 22, 30, 58, 100 };
		int l1 = a.length;
		int l2 = b.length;
		int l = l1 + l2;
		int c[] = new int[l];
		int i = 0, j = 0, k = 0;
		// code starts.........
		while (i < l1 && j < l2) {
			if (a[i] < b[j]) {
				c[k] = a[i];
				k++;
				i++;
			}

			else {
				c[k] = b[j];
				k++;
				j++;
			}

		}
		while (i < l1) {
			c[k++] = a[i++];
		}
		while (j < l2) {
			c[k++] = b[j++];
		}

		System.out.println("Merged  array is.......");
		for (int d = 0; d < l; d++) {
			System.out.print(c[d] + " ");
		}

	}

}
