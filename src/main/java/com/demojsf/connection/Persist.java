//package com.demojsf.connection;
//
//import com.demojsf.entity.Product;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import javax.persistence.Query;
//import java.util.List;
//import java.util.Scanner;
//
//public class Persist {
//
//    public static List<Product> productList;
//
//    public static void main(String[] args) {
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("products");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        Scanner scanner1 = new Scanner(System.in);
//        Scanner scanner2 = new Scanner(System.in);
//
//        System.out.print("ID Product: ");
//        int id = scanner1.nextInt();
//        System.out.print("Name Product: ");
//        String name = scanner2.nextLine();
//        System.out.print("Price Product: ");
//        double price = scanner1.nextDouble();
//
//        entityManager.getTransaction().begin();
//
//        Product p1 = new Product(id,name,price);
//
//        entityManager.persist(p1);
//
//        Query query = entityManager.createQuery("SELECT e FROM Product e", Product.class);
//        productList = query.getResultList();
//
//        entityManager.getTransaction().commit();
//
//        entityManager.close();
//        entityManagerFactory.close();
//    }
//}
