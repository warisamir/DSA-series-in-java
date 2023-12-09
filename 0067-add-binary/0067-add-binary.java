class Solution {
    public String addBinary(String a, String b) {
        int a1=a.length()-1;
        int b1=b.length()-1;
        int car=0;
        StringBuilder s=new StringBuilder();
        while(a1>=0 || b1>=0 || car==1){
            if(a1>=0)
               car+=a.charAt(a1--)-'0';
            if(b1>=0)
            car+=b.charAt(b1--)-'0';
            s.append(car%2);
            car=car/2;
        }
        return s.reverse().toString();
    }
}