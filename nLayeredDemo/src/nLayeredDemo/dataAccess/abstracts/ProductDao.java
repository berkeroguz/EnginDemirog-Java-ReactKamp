package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product get (int id); //tek ürüne tıkladıı mesela
    List<Product> getAlList(); // // Örnek acer yazdık aradık 300 tane pc getirdi.

}
