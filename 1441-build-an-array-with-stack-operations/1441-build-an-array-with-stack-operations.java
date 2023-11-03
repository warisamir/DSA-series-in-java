class Solution {
    public List<String> buildArray(int[] arr, int n) {
        Stack<String>ls=new Stack<>();
        int i=1;
        for(int a:arr){
            while(i<a){
                ls.push("Push");
                ls.push("Pop");
                i++;
            }
            ls.add("Push"); 
            i++;
        }
        return ls;
    }
}