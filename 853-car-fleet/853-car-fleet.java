class Solution {
    public int carFleet(int target, int[] po,int sp[]) {
PriorityQueue<Car> pq=new PriorityQueue<>();
        for(int i=0;i<po.length;i++){
            Car c=new Car(po[i],sp[i]);
        pq.add(c);
            }
            int res=0;
        double time=0;
        while(pq.size()>0){
            Car c=pq.remove(); 
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
               return c.pos-this.pos;  
          }
      }
    }
