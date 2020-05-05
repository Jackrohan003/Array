/*
We can also using the idea of shifting. We shift the first $n - 1$ elements by one before placing the last element in the beginning of the array.

Time: O(N * K)
Space: O(1)
*/

public void rotate(int[] nums, int k) {
  int n = nums.length;
  k = k % n;
  for (int i = 0; i < k; ++i) { // rotate by k times
    // each time rotate all elements by one step, starting from the rihgtmost element
    int prev = nums[n - 1];
    for (int j = 0; j < n; ++j) {
      int temp = nums[j]; // backup
      nums[j] = prev;
      prev = temp;
    }
  }
}
/*

Time: O(N)
Space: O(1)

Cyclic Replacements (In-Place)

1 2 3 4 5 6 7
Reverse all elements
7 6 5 4 3 2 1
Reverse first k elements
5 6 7
Reverse last (n - k) elements
      1 2 3 4
5 6 7 1 2 3 4

*/



public void rotate(int[] nums, int k) {
  int n = nums.length;
  k = k % n;
  reverse(nums, 0, n - 1);
  reverse(nums, 0, k - 1);
  reverse(nums, k, n - 1);
}

private void reverse(int[] nums, int lo, int hi) {
  int n = hi - lo + 1;
  for (int i = 0; i < n / 2; ++i) {
    swap(nums, lo + i, hi - i);
  }
}

private void swap(int[] nums, int i, int j) {
  int temp = nums[i];
  nums[i] = nums[j];
  nums[j] = temp;
}
