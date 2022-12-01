class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        ArrayList<Integer>ls=new ArrayList<>();
        return helper(expression,0,expression.length()-1);
    }
    List<Integer> helper(String s ,int st,int en){
        List<Integer>ls=new ArrayList<>();
        for(int k=1+st;k<en;k++){
            if(Character.isDigit(s.charAt(k)))
                continue;
            List<Integer>lf=helper(s,st,k-1);
            List<Integer>rig=helper(s,k+1,en);
            char ch=s.charAt(k);
            for(Integer l:lf){
                for(Integer r:rig){
                    switch(ch){
                        case '+':
                            ls.add(l+r);
                            break;
                        case '-':
                            ls.add(l-r);
                            break;
                        case '*':
                            ls.add(l*r);
                            break;
                        case '/':
                            ls.add(l/r);
                            break;
                    }
                }
            }
        }
            if(ls.isEmpty())
                ls.add(Integer.parseInt(s,st,en+1,10));
                return ls;
            
    }
}