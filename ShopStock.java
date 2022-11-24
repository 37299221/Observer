//This file is used to observe NewsAgency. Whenever NewsAgency changes, then the update method is used.
public class ShopStock implements Channel {

//String variable made called 'news'.
    private String news;

//Overrides the code from the implemented file 'Channel', the interface for the program.
    @Override
	
	//Method made to update the existing news string in this file.
    public void update(Object news) {
		
		//Sets a new 'news' string in this file from the other file that has changed. This is done by using the update() method.
        this.setNews((String) news);
		
		//End of method.
    }

// Gets the news string and puts it in the new news variable.
    public String getNews() {
        return news;
    }
	
    public void setNews(String news) {
        this.news = news;
    }

}