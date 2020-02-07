package com.springioc.demo.mvc.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springioc.demo.mvc.entity.Product;

 
@Service
@Transactional
public class ProductService {
	public static final Map<Long,Product> PRODUCTS = new HashMap<>();
	public static long id=0l;
    
     
    public List<Product> listAll() {
      //  return repo.findAll();
    	  return new ArrayList<>(PRODUCTS.values());
    }
     
    public void save(Product product) {
        //repo.save(product);
    	id = id+1;
    	product.setId(id);
		PRODUCTS.put(Long.valueOf(id), product);
    }
     
    public Product get(long id) {
    	
        //return repo.findById(id).get();
    return	PRODUCTS.get(id);
    }
     
    
 public void update(Product product) {
    	
        //return repo.findById(id).get();
	 PRODUCTS.put(product.getId(), product);
    }
    public void delete(long id) {
       // repo.deleteById(id);
    	PRODUCTS.remove(id);
    	
    }
}