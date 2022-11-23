# Count pairs Sum in matrices
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given two sorted matrices <strong>mat1</strong> and <strong>mat2</strong> of size <strong>N x N</strong> of elements. Given a value <strong>x</strong>. The problem is to count all pairs from both matrices whose sum is equal to <strong>x</strong>.</span><br>
<br>
<span style="font-size:18px"><strong>Note:</strong> The pair has an element from each matrix. Matrices are strictly sorted which means that matrices are sorted in a way such that all elements in a row are sorted in increasing order and for row ‘i’, where 1 &lt;= i &lt;= n-1, the first element of row 'i' is greater than the last element of row 'i-1'.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong> 
N = 3, x = 21
mat1 = { {1 5 6}
         {8 10 11}
         {15 16 18} }
mat2 = { {2 4 7}
         {9 10 12}
         {13 16 20} }
<strong>OUTPUT: </strong>4
<strong>Explanation: </strong>The pairs are (1, 20),
&nbsp;           (5, 16), (8, 13), (11, 10).</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 2, x = 10
mat1 = { {1 2}
         {3 4} }
mat2 = { {4 5}
         {6 7}
<strong>Output: </strong>2
<strong>Explanation: </strong>The pairs are (4, 6), (3, 7)</span></pre>

<p><span style="font-size:18px"><strong>User Task:</strong><br>
Your task is to complete the function&nbsp;<strong><code>countPairs()</code></strong><strong> </strong>which takes 4 arguments&nbsp;<strong>mat1</strong>, <strong>mat2</strong>, <strong>N</strong>, <strong>X</strong>, and returns the count of pairs. You don't need to take any input or print anything.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N<sup>2</sup>)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>

<p><span style="font-size:20px"><strong>Constraints:</strong><br>
1 ≤ T ≤ 100<br>
1 ≤ N ≤ 100<br>
1 ≤ X ≤ 10<sup>5</sup></span><br>
<span style="font-size:20px">1 ≤ mat1[i][j] , mat2[i][j] ≤ 10<sup>5</sup></span></p>
</div>