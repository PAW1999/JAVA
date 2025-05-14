class Food Delivery App {
	placeOrder(String itemName, int quantity, int quality,double amount){
		this.item_Name=item_Name;
		this.quantity=quantity;
		this.amount=amount;
		this.quality=quality;
		
		
	}
	void setItemName(int item_Name){
		this.itemName=itemName;
		
	} 
	int getitemName(){
		
		return itemName;
	}
	void setQuantity(int quantity){
		this.quantity=quantity;
	}
	int getQuantity(){
		return quatity;
	}
	void setQuality(int quality){
		this.quality=quality;
	}
	int getquality(){
		return quality;
	}
	void setAmount(){
		this.amount=amount;
		
	}
	double getamount(){
		return amount;
	}
	void display(){
		System.out.println("Please enter the customer itemName "+itemName);
		System.out.println("Please enter the quality of foood"+quality);
		System.out.println("Please enter the quantity of this food "+quantity);
		System.out.println("please enter your amount for buying a food :"+amount);	
		}
}
