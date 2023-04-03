package com.Sportyshoes.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sportyshoes.model.PurchaseItem;
import com.Sportyshoes.model.User;




@Repository
public interface PurchaseItemRepository extends JpaRepository<PurchaseItem, Long>{

	List<PurchaseItem> findByUser(User user, Sort sort);
}
