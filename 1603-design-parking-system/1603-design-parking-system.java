class ParkingSystem {
  int park[];
    public ParkingSystem(int b, int m, int s) {
        park=new int[]{b,m,s};
        
    }
    
    public boolean addCar(int car) {
        if(park[car-1]>0)
        { park[car-1]--;
        return true;}
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */