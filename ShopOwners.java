//Both lines below allows the use of neccecary java for the ArrayList and List to work.
import java.util.ArrayList;
import java.util.List;

//Class used to contain the string 'news' and an array list containing names channels.
public class ShopOwners {

    //String to be used for news. Will be used in other methods below.
    private String news;

    //Creation of ArrayList. Allows other methods to use the 'news' variable to use the update() method.
    private List<Channel> channels = new ArrayList<>();


    //Code inside allows channels to be added to the array list.
    public void addObserver(Channel channel) {
        this.channels.add(channel);
    }

    //Code inside allows channels to be removed to the array list.
    public void removeObserver(Channel channel) {
        this.channels.remove(channel);
    }


    //Code inside allows the news string to be updated after being used. 'This.' specifies the program
//about a specific named variable / attribute.
    public void setNews(String news) {
        this.news = news;
        for (Channel channel : this.channels) {
            channel.update(this.news);
        }
    }
}