# [3070. Count Submatrices with Top-Left Element and Sum Less Than k](https://leetcode.com/problems/count-submatrices-with-top-left-element-and-sum-less-than-k/description/)

You are given a **0-indexed**  integer matrix <code>grid</code> and an integer <code>k</code>.

Return the **number**  of <button type="button" aria-haspopup="dialog" aria-expanded="false" aria-controls="radix-:r1s:" data-state="closed" class="">submatrices</button> that contain the top-left element of the <code>grid</code>, and have a sum less than or equal to <code>k</code>.

**Example 1:**
<img alt="" src="https://assets.leetcode.com/uploads/2024/01/01/example1.png" style="padding: 10px; background: rgb(255, 255, 255); border-radius: 0.5rem;">

```
Input: grid = [[7,6,3],[6,6,1]], k = 18
Output: 4
Explanation: There are only 4 submatrices, shown in the image above, that contain the top-left element of grid, and have a sum less than or equal to 18.```
```

**Example 2:** 
<img alt="" src="https://assets.leetcode.com/uploads/2024/01/01/example21.png" style="padding: 10px; background: rgb(255, 255, 255); border-radius: 0.5rem;">

```
Input: grid = [[7,2,9],[1,5,0],[2,6,6]], k = 20
Output: 6
Explanation: There are only 6 submatrices, shown in the image above, that contain the top-left element of grid, and have a sum less than or equal to 20.
```

**Constraints:** 

- <code>m == grid.length </code>
- <code>n == grid[i].length</code>
- <code>1 <= n, m <= 1000 </code>
- <code>0 <= grid[i][j] <= 1000</code>
- <code>1 <= k <= 10^9</code>