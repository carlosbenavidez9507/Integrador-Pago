package com.rappi.pagoservice.controller;

import java.io.IOException;

import org.bouncycastle.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.net.HttpHeaders;
import com.rappi.pagoservice.model.Pago;
import com.rappi.pagoservice.repository.PagoRepository;

@RestController
@RequestMapping("/")
public class PagoController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private Environment env;
	
	 @Autowired
	 private PagoRepository repository;
	 
	 @GetMapping(value = "/pago")
		public Iterable<Pago> all (){
			return repository.findAll();
		}
	 
	 @GetMapping(value = "/pago/{pagoId}")
		public Pago findByPagoId (@PathVariable String pagoId){
		 
		    
		   return repository.findPagoById(pagoId);
		     
		}
	 
	 
	 
	 @PostMapping(value = "/pago")
		public Pago save (@RequestBody Pago pago) throws IOException{
			Pago pay=repository.save(pago);
			
			//ObjectMapper objectMapper = new ObjectMapper();
		
			 //HttpHeaders headers = new HttpHeaders();
		      //headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		      //HttpEntity<Product> entity = new HttpEntity<Product>(product,headers);
			//Object tmp=pago.getApuesta();
				
				//restTemplate.postForObject("http://apuesta-service/apuesta",tmp,String.class);
				//JsonNode root = objectMapper.readTree(personResultAsJsonStr);
			
			return pay;
		}
	 
	
	 
	 @PutMapping(value = "/pago")
		public Pago update (@RequestBody Pago pago){
			return repository.save(pago);
		}
	 
	 @DeleteMapping(value = "/pago")
		public void delete (@RequestBody Pago apuesta){
			repository.delete(apuesta);
		}

}
