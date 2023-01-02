class Solution {
    public boolean isRectangleCover(int[][] rs) {
           Set<String> ps = new HashSet<>();
        int a = 0;
        int x1 = Integer.MAX_VALUE;
        int y1 = Integer.MAX_VALUE;
        int x2 = Integer.MIN_VALUE;
        int y2 = Integer.MIN_VALUE;
        for (int[] r : rs) {
            x1 = Math.min(x1, r[0]);
            y1 = Math.min(y1, r[1]);
            x2 = Math.max(x2, r[2]);
            y2 = Math.max(y2, r[3]);
            a += (r[2] - r[0]) * (r[3] - r[1]);
            String lb = r[0] + " " + r[1];
            String lu = r[0] + " " + r[3];
            String br = r[2] + " " + r[1];
            String ur = r[2] + " " + r[3];
            if (!ps.add(lb)) ps.remove(lb);
            if (!ps.add(lu)) ps.remove(lu);
            if (!ps.add(br)) ps.remove(br);
            if (!ps.add(ur)) ps.remove(ur);
        }
        
        if (!(ps.size() == 4)
            || !(ps.contains(x1 + " " + y1))
            || !(ps.contains(x1 + " " + y2))
            || !(ps.contains(x2 + " " + y1))
            || !(ps.contains(x2 + " " + y2))) return false;
        return a == (x1 - x2) * (y1 - y2);
    }
}