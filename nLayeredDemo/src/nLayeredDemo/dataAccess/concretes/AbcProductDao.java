package nLayeredDemo.dataAccess.concretes;

import java.util.List;

import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class AbcProductDao implements ProductDao{

	//Diyelim ki hibernate'ten daha iyi bir ABC framework çıkıt. Onu eklemek istiyoruz.
	//Solid kuralına göre o harfi derki; Sisteme ekleyeceğin
	//Yeni bir özellik olduğu zaman mevcut kodlara DOKUNAMAZSIN.
	
	@Override
	public void add(Product product) {
		System.out.println("Abc ile eklendi. " + product.getName());
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public List<Product> getAlList() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
