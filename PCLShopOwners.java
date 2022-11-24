//Required java files below (2 lines).

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


//Class used to send notifications to observers.
public class PCLShopOwners {
    private String stock;

    private PropertyChangeSupport support;

    public PCLShopOwners() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    public void setStock(String value) {
        support.firePropertyChange("stock", this.stock, value);
        this.stock = value;

    }
}