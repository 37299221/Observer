//Neccecary java files. Observable + observer for this file. Only shows things that should be shown to users.
import java.util.Observable;
import java.util.Observer;



public class OShopStock implements Observer {

//Creates new string
    private String stock;

//Overrides the code from the implemented file 'Shop', the interface for the program.
    @Override
	
	//Method made to update the existing stock string in this file.
    public void update(Observable o, Object stock)	{
		
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