class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        String s1=event1[0].replace(":","0");
        String s2=event2[0].replace(":","0");
        String e1=event1[1].replace(":","0");
        String e2=event2[1].replace(":","0");
        int num1=Integer.parseInt(s1);
        int num2=Integer.parseInt(s2);
        int num3=Integer.parseInt(e1);
        int num4=Integer.parseInt(e2);
        return num2<=num3 && num1<=num4;
    }
}