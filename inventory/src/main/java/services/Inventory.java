package services;

import entities.Catalog;

public interface Inventory {
    Catalog getCatalog();
    void addToPurchase(String purchaseCode,String itemId,int amount);
}
