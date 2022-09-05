class Solution {
    public int carFleet(int target, int[] po,int sp[]) {
        Car car[]=new Car[po.length];
           for(int i=0;i<po.length;i++){
               car[i]=new Car(po[i],sp[i]);
           }
      Arrays.sort(car);
        int res=0;
        double time=0;
        for(int i=car.length-1;i>=0;i--){
            Car c=car[i]; 
            double ct=(target-c.pos)*1.0/c.speed;
            
            if(ct>time){
                time=ct;
                res++;
            }
        }return res;
        }
      class Car implements Comparable <Car>{
          int pos;
          int speed;
          Car(int   pos,int speed ){
              this.pos=pos;
              this.speed=speed;
          }
        public int compareTo(Car c){
         return    this.pos-c.pos ;
        }
      }
    }
