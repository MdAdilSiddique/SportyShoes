package com.Sportyshoes.Service;

import java.util.List;

import com.Sportyshoes.model.PurchaseItem;
import com.Sportyshoes.model.PurchaseOrder;
import com.Sportyshoes.model.User;



public interface PurchaseItemService {

	public PurchaseItem getPurchaseItemById(Long id);

	public List<PurchaseItem> getAllItemsByPurchaseOrder(PurchaseOrder order);

	public List<PurchaseItem> getAllPurchaseItemByUserId(User userId);

	public PurchaseItem savePurchaseItem(PurchaseItem purchaseItem);

	public List<PurchaseItem> getAllPurchaseItemList();

}
