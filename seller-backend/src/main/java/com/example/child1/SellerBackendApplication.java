package com.example.child1;

import com.example.model.Seller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class SellerBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SellerBackendApplication.class, args);
	}

	@GetMapping("/")
	public ResponseEntity getSeller() {
		return ResponseEntity.ok(new Seller("seller-backend"));
	}
}
