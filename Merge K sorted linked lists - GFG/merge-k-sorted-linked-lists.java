//{ Driver Code Starts
import java.util.*;

class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}


class GfG
{
    public static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {   
            int N = sc.nextInt();
            
            Node []a = new Node[N];
            
            for(int i = 0; i < N; i++)
            {
                int n = sc.nextInt();
                
                Node head = new Node(sc.nextInt());
                Node tail = head;
                
                for(int j=0; j<n-1; j++)
                {
                    tail.next = new Node(sc.nextInt());
                    tail = tail.next;
                }
                
                a[i] = head;
            }
            
            Solution g = new Solution();
             
            Node res = g.mergeKList(a,N);
            if(res!=null)
                printList(res);
            System.out.println();
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to merge K sorted linked list.
    Node mergeKList(Node[]arr,int K)
    {
        //Add your code here.
        int i=0;
        int last=K-1;
        int j=0;
        while(last!=0){
            i=0;j=last;
            while(i<j){
                arr[i]=merge(arr[i],arr[j]);
                i++;j--;
                if(i>=j)
                last=j;
            }
        }
        return arr[0];
    }
    public Node merge(Node a,Node b){
        Node res=null;
        if(a==null)
        return b;
       else if(b==null) return a;
        if(a.data<=b.data)
       { res=a;
        res.next=merge(a.next,b);
       }
       else 
       {
           res=b;
           res.next=merge(a,b.next);
       }
       return res;
    }
}
