package com.tns.Admin;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.tns.Admin.Order;
import com.tns.Admin.OrderService;


@RestController
public class OrderController {

	@Autowired
	private OrderService service;
	
	@GetMapping("/orders")
	   public List<Order> list() 
	{
	       return service.listAll();
	}
	
	 @GetMapping("/orders/{id}")

	   public ResponseEntity<Order> get(@PathVariable Integer id) {
	       try
	       {
	        Order order = service.get(id);
	           return new ResponseEntity<Order>(order, HttpStatus.OK);
	       } 
	       catch (NoSuchElementException e) 
	       {
	           return new ResponseEntity<Order>(HttpStatus.NOT_FOUND);
	       }      
	   }
	 
	 @PostMapping("/orders")
	   public void add(@RequestBody Order order) {
	       service.save(order);
	   }
	 
	 @PutMapping("/orders/{id}")
	   public ResponseEntity<?> update(@RequestBody Order order, @PathVariable Integer id) {
	       try {
	        Order existOrder = service.get(id);
	           service.save(order);
	           return new ResponseEntity<>(HttpStatus.OK);
	       } catch (NoSuchElementException e) {
	           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	       }      
	   }
	 
	 @DeleteMapping("/orders/{id}")
	   public void delete(@PathVariable Integer id) {
	       service.delete(id);
	   }
}
