package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";
    private int cheese;
    private int topping;
    private boolean extraCheese=false;
    private boolean extraTopping=false;
    private boolean takeAway=false;
    private boolean billGenerated=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.price=0;
        // your code goes here
        if(isVeg)
        {   this.price=300;
            this.topping=70;
        }
        else
        {   
            this.price=400;
            this.topping=120;
        }
        this.cheese=80;
        this.bill+="Base Price Of The Pizza: "+this.price+"\n";
        
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
        if(!billGenerated)
        {
            if(extraCheese)
                this.bill+="Extra Cheese Added: "+this.cheese+"\n";
            if(extraTopping)
                this.bill+="Extra Toppings Added: "+this.topping+"\n";
            if(takeAway)
                this.bill+="Paperbag Added: "+"20"+"\n";

                this.bill+="Total Price: "+getPrice()+"\n";
                billGenerated=true;
        }
        return this.bill;
    }
    
    

    public void addExtraCheese(){
        // your code goes here
        
            if(!this.extraCheese)
            {   this.price=this.price+this.cheese;
               // this.bill+="Extra Cheese Added: "+80+"\n";
                this.extraCheese=true;
            }
       
    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.extraTopping)
        {
            this.price+=this.topping;
            this.extraTopping=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!this.takeAway)
        {
            this.price+=20;
            //this.bill+="Paperbag Added: "+20+"\n";
            this.takeAway=true;
        }
    }

   
}
