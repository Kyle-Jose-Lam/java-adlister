package products;

public class DaoFactory {
//    private static Ads adsDao;
//
//    public static Ads getAdsDao() {
//        if (adsDao == null) {
//            adsDao = new ListAdsDao();
//        }
//        return adsDao;
//    }

    private static Products productsDao;

    public static Products getProductsDao() {
        if (productsDao == null) {
            productsDao = new ProductsDao();
        }
        return productsDao;
    }

}
