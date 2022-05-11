Exit Point Of A Matrix
Easy

1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers (1's and 0's), representing elements of 2d array a.
4. Consider this array a maze and a player enters from top-left corner in east direction.
5. The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
6. You are required to print the indices in (row, col) format of the point from where you exit the matrix.

Constraints
1 <= n <= 10^2
1 <= m <= 10^2
e1, e2, .. n * m elements belongs to the set (0, 1)

Format
Input
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements

Output
row
col (of the point of exit)

Example
Sample Input

4
4
0
0
1
0
1
0
0
0
0
0
0
0
1
0
1
0

Sample Output
1
3
//
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int mat[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            mat[i][j]=sc.nextInt();
        }
        int fcol=0, frow=0;
        int prero=0,preco=0;
        int dir=0;
        while((fcol>=0)&&(frow>=0)&&(fcol<m)&&(frow<n)){
            if(mat[frow][fcol]==1){
                dir=(dir+1)%4;
            }
            prero=frow;
            preco=fcol;
            if(dir==0){
                fcol++;
            }
            else if(dir==1){
                frow++;
            }
            else if(dir==2){
                fcol--;
            }
            else{
                frow--;
            }
        }
        System.out.println(prero);
         System.out.println(preco);
    }

}
