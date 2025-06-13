package com.lcwd.orm.repositories;

import com.lcwd.orm.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface ProductRepo extends JpaRepository<Product, String> {

    //Custom(Finder) method
    Optional<Product> findByProductName(String productName);
    Product findBypId(String pId);
    //Product findByProductNameIs();
    //Product findByProductNameEquals();
    List<Product> findByProductNameIsNot(String name);

    List<Product> findByActiveTrue();
    List<Product> findByActiveFalse();

    List<Product> findByProductNameStartingWith(String prefix);
    List<Product> findByProductNameEndingWith(String suffix);
    List<Product> findByProductNameContaining(String infix);
    //String pattern = "Samsung%";
    List<Product> findByProductNameLike(String  pattern);

    List<Product> findByPriceLessThan(double price);
    List<Product> findByPriceLessThanEqual(double price);
    List<Product> findByPriceGreaterThan(double price);
    List<Product> findByPriceGreaterThanEqual(double price);

    List<Product> findByProductNameIn(Collection<String> names);
    List<Product> findByProductNameAndPrice(String name, double price);
    List<Product> findByProductNameOrPrice(String name, double price);
    List<Product> findByProductNameOrderByProductNameAsc(String productName);
    List<Product> findByProductNameOrderByProductNameDesc(String productName);


    //JPQL
    @Query("select p from Product p")
    List<Product> getAllProductWhileLearningJPA();

    @Query("SELECT p from Product p where p.productName = 'Iphone 14' ")
    List<Product> getAllActiveProducts();

    @Query("SELECT p from Product p where p.pId = ?1 AND p.productName=?2")
    Product getSingleProductByIdAndName1(int pId, String productName);

    @Query("SELECT p from Product p WHERE p.pId = :productId AND p.productName = :productName")
    Product getSingleProductByIdAndName2(@Param("productId") int productId, @Param("productName") String productName);

    //when we update anything via query then we also need write @Modifying annotations also along with the @Query


    //native queries

    @Query(value = "select * from jpa_product where product_name = :productName", nativeQuery = true)
    Product getProductByIdAndNameNative(@Param("productName") String productName);




}