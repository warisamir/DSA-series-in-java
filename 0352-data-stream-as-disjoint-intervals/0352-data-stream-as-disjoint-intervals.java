class SummaryRanges {
  Set<Integer>hs;
    public SummaryRanges() {
        hs=new TreeSet<>();
    }
    
    public void addNum(int value) {
        hs.add(value);
    }
    
    public int[][] getIntervals() {
           if (hs.isEmpty()) {
            return new int[0][2];
        }
        List<int[]> intervals = new ArrayList<>();
        int left = -1, right = -1;
        for (Integer value : hs) {
            if (left < 0) {
                left = right = value;
            } else if (value == right + 1) {
                right = value;
            } else {
                intervals.add(new int[] {left, right});
                left = right = value;
            } 
        }
        intervals.add(new int[] {left, right});
        return intervals.toArray(new int[0][]); 
    }
}

/**
 * Your SummaryRanges object will be instantiated and called as such:
 * SummaryRanges obj = new SummaryRanges();
 * obj.addNum(value);
 * int[][] param_2 = obj.getIntervals();
 */