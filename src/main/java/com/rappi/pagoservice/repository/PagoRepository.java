package com.rappi.pagoservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rappi.pagoservice.model.Pago;



public interface PagoRepository extends MongoRepository<Pago,String> {
	
	Pago findPagoById(String IdPago);

}
