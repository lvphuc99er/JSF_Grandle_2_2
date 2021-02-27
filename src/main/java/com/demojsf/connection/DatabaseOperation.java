//package com.demojsf.connection;
//
//import com.demojsf.entity.Product;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//import javax.persistence.Query;
//import java.util.List;
//
//public class DatabaseOperation {
//    private static final String PERSISTENCE_UNIT_NAME = "products";
//    private static EntityManager entityMgrObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
//    private static EntityTransaction transactionObj = entityMgrObj.getTransaction();
//
//    public static List<Product>  getAllProDuct() {
//        Query queryObj = entityMgrObj.createQuery("SELECT s FROM Product s");
//        List<Product> productList = queryObj.getResultList();
//        if (productList != null && productList.size() > 0) {
//            return productList;
//        } else {
//            return null;
//        }
//    }
//}
