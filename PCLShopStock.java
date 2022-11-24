import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PCLShopStock implements PropertyChangeListener {

    private String stock;

    public void propertyChange(PropertyChangeEvent evt) {
        this.setStock((String) evt.getNewValue());
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
}