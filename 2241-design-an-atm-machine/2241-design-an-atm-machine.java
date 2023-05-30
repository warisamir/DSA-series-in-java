class ATM {
   long atm[];
    int notes[]={20,50,100,200,500};
    public ATM() {
        atm=new long[5];
    }
    
    public void deposit(int[] banknote) {
        for(int i=0;i<5;i++){
            atm[i]+=banknote[i];
        }
    }
    
    public int[] withdraw(int amount) {
        int temp[]=new int[5];
        for(int i=4;i>=0;i--){
              int x =(int)Math.min(amount/notes[i],atm[i]);
            temp[i]=x;
            amount-=x*notes[i];
        }
         if(amount!=0) return new int[]{-1};
        for(int i=0;i<5;i++){
            atm[i]-=temp[i];
        }
        return temp;
    }
}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */