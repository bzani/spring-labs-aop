package com.bdpz.labs.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bdpz.labs.model.Ticket;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class TicketAspect {

	@Autowired
	private TicketService ticketService;
	
	@After(value = "@annotation(ticket)", argNames = "ticket")
	public void createTicket(JoinPoint joinPoint, Ticket ticket) throws Throwable {
		if (joinPoint.getArgs() == null || joinPoint.getArgs().length == 0) { 
			log.warn("No args were passed");
			return;
		}
		
		try {
			long entityId = Long.parseLong(joinPoint.getArgs()[0].toString());
			ticketService.createTicket(entityId, ticket);
		}
		catch (NumberFormatException e) {
			log.error("Id not parseable", e);
		}
	}

}
