class FoodRatings {
    HashMap<String, PriorityQueue<Food>> x = new HashMap<>(); 
    HashMap<String, Food> menu = new HashMap<>();
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
          for(int i=0; i<foods.length; i++){
		Food curr = new Food(foods[i], cuisines[i], ratings[i]);
        x.putIfAbsent(cuisines[i], new PriorityQueue<>((a,b)->
            b.rating==a.rating ? a.food.compareTo(b.food) : b.rating-a.rating));
		PriorityQueue<Food> pq = x.get(cuisines[i]);
        pq.add(curr);
        menu.put(foods[i], curr);
     }
    }
    
    public void changeRating(String food, int newRating) {
        Food curr=menu.get(food);
        PriorityQueue<Food>pq = x.get(curr.cuisines);
        pq.remove(curr);
        curr.rating=newRating;
        pq.add(curr);
        
    }
    
    public String highestRated(String cuisine) {
return x.get(cuisine).peek().food;
    }
    class Food{
        int rating;
        String food,cuisines;
        Food(String food,String cuisines,int rating){
            this.rating=rating;
            this.food=food;
            this.cuisines=cuisines;
        }
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */