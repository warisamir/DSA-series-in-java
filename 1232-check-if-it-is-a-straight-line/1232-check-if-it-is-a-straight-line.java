class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
          double dy = coordinates[1][1] - coordinates[0][1]; 
        double dx = coordinates[1][0] - coordinates[0][0];
        
        for(int i = 1 ; i < coordinates.length - 1 ; i++)
        {
            double ndx = coordinates[i+1][0] - coordinates[i][0];
            double ndy = coordinates[i+1][1] - coordinates[i][1];
            
            if( (dx*ndy) != (dy*ndx) )
                return false ;
        }
        return true ;
    }
}