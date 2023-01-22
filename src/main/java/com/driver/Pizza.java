package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";
    private boolean extraCheese=false;
    private boolean extraTopping=false;
    private boolean takeAway=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.price=0;
        // your code goes here
        if(this.isVeg)
        {   this.price=this.price+300;
            this.bill=this.bill+"Base Price Of The Pizza "+300+"\n";
        }
        else
        {
            this.price+=400;
            this.bill=this.bill+"Base Price Of The Pizza "+400+"\n";
        }
    }

    // getter and setter for price
    public void setPrice(int price)
    {
        this.price=price;
    }
    public int getPrice(){
        return this.price;
    }

    // getter and setter for isveg
    public boolean getIsVeg()
    {
        return this.isVeg;
    }
    public void setIsVeg(boolean isveg)
    {
        this.isVeg=isveg;
    }

    //getter and setter for bill
    public String getBill()
    {
        this.bill+="Total Price: "+getPrice()+"\n";
        return this.bill;
    }
    
    

    public void addExtraCheese(){
        // your code goes here
        
            if(!this.extraCheese)
            {   this.price=this.price+80;
                this.bill+="Extra Cheese Added: "+80+"\n";
                this.extraCheese=true;
            }
       
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg)
        {
            if(!this.extraTopping)
            {
                this.price+=70;
                this.bill+="Extra Toppings Added: "+70+"\n";
                this.extraTopping=true;
            }
        }
        else
        {
            if(!this.extraTopping)
            {
                this.price=120;
                this.bill+="Extra Toppings Added: "+120+"\n";
                this.extraTopping=true;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!this.takeAway)
        {
            this.price+=20;
            this.bill+="Paperbag Added: "+20+"\n";
            this.takeAway=true;
        }
    }

   
}
