package com.bdpz.labs.service;

import org.springframework.stereotype.Service;

import com.bdpz.labs.model.Product;
import com.bdpz.labs.model.Ticket;
import com.bdpz.labs.model.TicketOperationEnum;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ProductService {

	@Ticket(clazz = Product.class, operation = TicketOperationEnum.REMOVE)
	public void remove(Long id) {
		log.warn("Removing product {}", id);
		//db operation
	}

}