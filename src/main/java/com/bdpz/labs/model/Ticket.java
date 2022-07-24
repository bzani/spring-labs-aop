package com.bdpz.labs.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Ticket {
	public TicketOperationEnum operation();
	public Class<?> clazz();
	public String description() default "";
}