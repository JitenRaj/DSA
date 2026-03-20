# [3546. Equal Sum Grid Partition I](https://leetcode.com/problems/equal-sum-grid-partition-i/description/)

You are given an <code>m x n</code> matrix <code>grid</code> of positive integers. Your task is to determine if it is possible to make **either one horizontal or one vertical cut**  on the grid such that:

- Each of the two resulting sections formed by the cut is **non-empty** .
- The sum of the elements in both sections is **equal** .

Return <code>true</code> if such a partition exists; otherwise return <code>false</code>.

**Example 1:**

<div class="example-block">
Input: grid = [[1,4],[2,3]]

Output: true

Explanation:

<img alt="" src="https://assets.leetcode.com/uploads/2025/03/30/lc.png" style="width: 200px;"><img alt="" src="https://assets.leetcode.com/uploads/2025/03/30/lc.jpeg" style="width: 200px; height: 200px;">

A horizontal cut between row 0 and row 1 results in two non-empty sections, each with a sum of 5. Thus, the answer is <code>true</code>.

**Example 2:**

<div class="example-block">
Input: grid = [[1,3],[2,4]]

Output: false

Explanation:

No horizontal or vertical cut results in two non-empty sections with equal sums. Thus, the answer is <code>false</code>.

**Constraints:**

- <code>1 <= m == grid.length <= 10^5</code>
- <code>1 <= n == grid[i].length <= 10^5</code>
- <code>2 <= m * n <= 10^5</code>
- <code>1 <= grid[i][j] <= 10^5</code>