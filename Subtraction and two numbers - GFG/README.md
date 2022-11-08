# Subtraction and two numbers
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px"><span style="font-family:arial,helvetica,sans-serif">Given two integers A and B.Find out the number of steps required to repeatedly subtract the smaller of the two from the larger until one of them becomes 0.</span></span></p>

<p><span style="font-size:18px"><strong><span style="font-family:arial,helvetica,sans-serif">Example 1:</span></strong></span></p>

<pre><span style="font-size:18px"><span style="font-family:arial,helvetica,sans-serif"><strong>Input:</strong>
A=5,B=13
<strong>Output:</strong>
6
<strong>Explanation:</strong>
The steps are as follows:
(5,13)-&gt;(5,8)-&gt;(5,3)-&gt;(2,3)-&gt;(2,1)-&gt;(1,1)-&gt;(1,0)
Thus, 6 steps are required.</span></span></pre>

<p><span style="font-size:18px"><strong><span style="font-family:arial,helvetica,sans-serif">Example 2:</span></strong></span></p>

<pre><span style="font-size:18px"><span style="font-family:arial,helvetica,sans-serif"><strong>Input:</strong>
A=5,B=15
<strong>Output:</strong>
3</span><span style="font-family:arial,helvetica,sans-serif">
<strong>Explanation:</strong>
The steps are as follows:
(5,15)-&gt;(5,10)-&gt;(5,5)-&gt;(5,0).
Thus, 3 steps are required.</span></span></pre>

<p><br>
<span style="font-size:18px"><span style="font-family:arial,helvetica,sans-serif"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>repeatedSubtraction()</strong> which takes two integers A and B as input parameters and returns the number of steps required to repeatedly subtract until one of the numbers becomes 0.</span></span></p>

<p><br>
<span style="font-size:18px"><span style="font-family:arial,helvetica,sans-serif"><strong>Expected Time Complexity:</strong>O(Log(max(A,B))<br>
<strong>Expected Auxillary Space:</strong>O(1)</span></span></p>

<p><br>
<span style="font-size:18px"><span style="font-family:arial,helvetica,sans-serif"><strong>Constraints:</strong><br>
1&lt;=A,B&lt;=10<sup>9</sup></span></span></p>
</div>