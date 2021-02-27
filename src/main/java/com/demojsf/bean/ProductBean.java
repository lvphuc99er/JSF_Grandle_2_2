package com.demojsf.bean;

import com.demojsf.entity.Product;
import com.demojsf.service.ProductService;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("productBean")
@ViewScoped
@Setter
@Getter
public class ProductBean implements Serializable {

    private static final String PERSISTENCE_UNIT_NAME = "products";
    private static EntityManager entityMgrObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
    private static EntityTransaction transactionObj = entityMgrObj.getTransaction();

    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private double price;

    public static List<Product> listProduct;

    public static List<Product>  getAllProDuct() {
        Query queryObj = entityMgrObj.createQuery("SELECT s FROM Product s");
        List<Product> productList = queryObj.getResultList();
        if (productList != null && productList.size() > 0) {
            for (Product product:productList) {
                listProduct.add(product);
            }
        } else {
            return null;
        }
        return listProduct;
    }
}
