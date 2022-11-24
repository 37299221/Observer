//Observable for this specific file. Only shows things that should be shown to users. Observable is
//used so that the update() method actually works
import java.util.Observable;

//Extends the imported file
public class OShopOwners extends Observable {
	
	//Creates stock string.
    private String stock;

//Set method to change the string 'stock'
    public void setStock(String stock) {
        this.stock = stock;
        setChanged();
        notifyObservers(stock);
    }
}