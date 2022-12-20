# Smallest subarray with all occurrences of a most frequent element
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array A. Let X be an element in the array which has the maximum frequency. The task is to find the smallest sub segment of the array which also has X as the maximum frequency element.</span></p>

<p><span style="font-size:18px"><strong>Note:</strong> if two or more elements have the same frequency (i.e., maximum frequency) and the same sub segment size then print the sub segment<strong> </strong>which occurs first in the array.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span><br>
&nbsp;</p>

<pre><span style="font-size:18px"><strong>Input :</strong> A[] = {1, 2, 2, 3, 1}
<strong>Output :</strong> 2 2
<strong>Explanation:</strong>
Note that there are two elements that appear two times,
1 and 2.The smallest window for 1 is whole array and
smallest window for 2 is {2, 2}.
Since window for 2 is smaller, this is our output.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input :</strong> A[] = {1, 4, 3, 3, 5, 5} <strong>
Output :</strong> 3 3 </span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function <strong>smallestSubsegment()</strong> that takes an array <strong>(arr)</strong>, sizeOfArray <strong>(n)</strong>, and return the required sub-segment of the array. The driver code takes care of the printing.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N).<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(N).</span><br>
&nbsp;</p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10<sup>5</sup><br>
1 ≤ A[i] ≤ 10<sup>5</sup></span></p>
</div>