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
	public final Long id=Long.valueOf(0);
    
     
    public List<Product> listAll() {
      //  return repo.findAll();
    	  return new ArrayList<>(PRODUCTS.values());
    }
     
    public void save(Product product) {
        //repo.save(product);
    	PRODUCTS.put(id.longValue()+1, product);
    }
     
    public Product get(long id) {
    	
        //return repo.findById(id).get();
    return	PRODUCTS.get(id);
    }
     
    public void delete(long id) {
       // repo.deleteById(id);
    	PRODUCTS.remove(id);
    	
    }
}