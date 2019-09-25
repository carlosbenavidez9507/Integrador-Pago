package com.rappi.pagoservice.model;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString


@Document(collection="Pago")
public class Pago {
	@Id
	private String id;
	private Date fechaApuesta;
	private String tipoPago;
	private Object apuesta;
	

}
