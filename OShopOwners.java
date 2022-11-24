//Observable for this specific file. Only shows things that should be shown to users. Observable is
//used so that the update() method actually works
import java.util.Observable;

//Extends the imported file
public class OShopOwners extends Observable {
	
	//Creates news string.
    private String news;

//Set method to change the string 'news'
    public void setNews(String news) {
        this.news = news;
        setChanged();
        notifyObservers(news);
    }
}