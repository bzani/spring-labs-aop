package com.bdpz.labs.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.bdpz.labs.model.Ticket;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TicketService {

	public void createTicket(Long id, Ticket ticket) {
		String ticketId = UUID.randomUUID().toString();
		log.warn("Entity={}, Operation={} - Ticket created: {}", ticket.clazz().getSimpleName(),
				ticket.operation().name(), ticketId);
		//push to queue
	}

}