# [3567. Minimum Absolute Difference in Sliding Submatrix](https://leetcode.com/problems/minimum-absolute-difference-in-sliding-submatrix/description/)

You are given an <code>m x n</code> integer matrix <code>grid</code> and an integer <code>k</code>.

For every contiguous <code>k x k</code> **submatrix**  of <code>grid</code>, compute the **minimum absolute**  difference between any two **distinct**  values within that **submatrix** .

Return a 2D array <code>ans</code> of size <code>(m - k + 1) x (n - k + 1)</code>, where <code>ans[i][j]</code> is the minimum absolute difference in the submatrix whose top-left corner is <code>(i, j)</code> in <code>grid</code>.

**Note** : If all elements in the submatrix have the same value, the answer will be 0.
A submatrix <code>(x1, y1, x2, y2)</code> is a matrix that is formed by choosing all cells <code>matrix[x][y]</code> where <code>x1 <= x <= x2</code> and <code>y1 <= y <= y2</code>.

**Example 1:**
```
Input: grid = [[1,8],[3,-2]], k = 2

Output: [[2]]
```

Explanation:

- There is only one possible <code>k x k</code> submatrix: <code>[[1, 8], [3, -2]]</code>.
- Distinct values in the submatrix are <code>[1, 8, 3, -2]</code>.
- The minimum absolute difference in the submatrix is <code>|1 - 3| = 2</code>. Thus, the answer is <code>[[2]]</code>.

**Example 2:**

```
Input: grid = [[3,-1]], k = 1

Output: [[0,0]]
```

Explanation:

- Both <code>k x k</code> submatrix has only one distinct element.
- Thus, the answer is <code>[[0, 0]]</code>.

**Example 3:**

```
Input: grid = [[1,-2,3],[2,3,5]], k = 2

Output: [[1,2]]
```

Explanation:

- There are two possible <code>k × k</code> submatrix:

- Starting at <code>(0, 0)</code>: <code>[[1, -2], [2, 3]]</code>.

- Distinct values in the submatrix are <code>[1, -2, 2, 3]</code>.
- The minimum absolute difference in the submatrix is <code>|1 - 2| = 1</code>.

- Starting at <code>(0, 1)</code>: <code>[[-2, 3], [3, 5]]</code>.

- Distinct values in the submatrix are <code>[-2, 3, 5]</code>.
- The minimum absolute difference in the submatrix is <code>|3 - 5| = 2</code>.

- Thus, the answer is <code>[[1, 2]]</code>.

**Constraints:**

- <code>1 <= m == grid.length <= 30</code>
- <code>1 <= n == grid[i].length <= 30</code>
- <code>-10^5 <= grid[i][j] <= 10^5</code>
- <code>1 <= k <= min(m, n)</code>