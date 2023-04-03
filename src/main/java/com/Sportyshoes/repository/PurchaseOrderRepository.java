package com.Sportyshoes.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.Sportyshoes.model.PurchaseOrder;



public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {
	
	

}
