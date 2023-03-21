package com.ChinaMarket.ECommerce.Repository;

import com.ChinaMarket.ECommerce.Enum.Category;
import com.ChinaMarket.ECommerce.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
//    @Query(value = "select * from Product where  and card_id=:cardId and is_issue_operation=true",
//            nativeQuery = true)
    List<Product> getAllProductByCategory(Category category);
}
