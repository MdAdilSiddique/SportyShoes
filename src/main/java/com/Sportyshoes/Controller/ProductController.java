package com.Sportyshoes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.Sportyshoes.Service.*;

@RestController
public class ProductController {

		@Autowired
		private ProductService productService;
}
