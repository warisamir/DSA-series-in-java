class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ls=new ArrayList<>();
        if(n==0)
            return ls;
        return dfs(n,n,"",ls);
    }
    public List<String> dfs(int op,int cl,String st,List<String>res){
       if(op<0|| cl<0 ||cl<op)return res; 
        if(op==0 && cl==0)
        {  res.add(st);
        return res;}
        dfs(op-1,cl,st+"(",res);
        dfs(op,cl-1,st+")",res);
        return res;
    }
}