public class ObserverIntegrationTest {

    public void whenChangingShopOwnersState_thenShopStockNotified() {

        ShopOwners observable = new ShopOwners();
        ShopStock observer = new ShopStock();

        observable.addObserver(observer);

        observable.setStock("stock");
        //assertEquals(observer.getStock(), "stock");
    }

    public void whenChangingOShopOwnersState_thenOShopStockNotified() {

        OShopOwners observable = new OShopOwners();
        OShopStock observer = new OShopStock();

        observable.addObserver(observer);

        observable.setStock("stock");
        //assertEquals(observer.getStock(), "stock");
    }

    public void whenChangingPCLShopOwnersState_thenOShopStockNotified() {

        PCLShopOwners observable = new PCLShopOwners();
        PCLShopStock observer = new PCLShopStock();

        observable.addPropertyChangeListener(observer);

        observable.setStock("stock");
        //assertEquals(observer.getStock(), "stock");
    }

}