# Equal Sum
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array <strong>Arr</strong> of length <strong>N</strong>. Determine if there exists an element in the array such that the sum of the elements on its left is equal to the sum of the elements on its right. If there are no elements to the left/right, then the sum is considered to be zero.&nbsp;<br>
Formally, find an i, such that, <strong>Arr<sub>1&nbsp;</sub>+ Arr<sub>2&nbsp;</sub>... Arr<sub>i-1</sub> = Arr<sub>i+1&nbsp;</sub>+ Arr<sub>i+2&nbsp;</sub>... Arr<sub>N</sub></strong>.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 4
Arr[] = {1, 2, 3, 3}
<strong>Output:</strong> YES
<strong>Explanation:</strong> Consider i = 3, for [1, 2] 
sum is 3 and for&nbsp;[3]&nbsp;sum is also 3.
</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 2
Arr[] = {1, 5}
<strong>Output:</strong> NO
<strong>Explanation:</strong>&nbsp;No such index present.
</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
Complete the function <strong>equilibrium()</strong>&nbsp;which takes array <strong>arr</strong> and size&nbsp;<strong>n</strong>,&nbsp;as input parameters&nbsp;and returns a&nbsp;string representing the answer(<strong>YES&nbsp;</strong>or <strong>NO</strong>).&nbsp;You don't to print answer or take inputs.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1)<br>
<strong>Constraints:</strong><br>
1 ≤ N ≤ 10<sup>5</sup>&nbsp;<br>
1 ≤ Arr[i] ≤ 10<sup>6</sup></span></p>

<p>&nbsp;</p>
</div>