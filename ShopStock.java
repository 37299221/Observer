//This file is used to observe ShopOwners. Whenever ShopOwners changes, then the update method is used.
public class ShopStock implements Channel {

//String variable made called 'stock'.
    private String stock;

//Overrides the code from the implemented file 'Channel', the interface for the program.
    @Override
	
	//Method made to update the existing stock string in this file.
    public void update(Object stock) {
		
		//Sets a new 'stock' string in this file from the other file that has changed. This is done by using the update() method.
        this.setStock((String) stock);
		
		//End of method.
    }

// Gets the stock string and puts it in the new stock variable.
    public String getStock() {
        return stock;
    }
	
    public void setStock(String stock) {
        this.stock = stock;
    }

}