package com.example.assignment_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssignmentAppController {

    @GetMapping("/products")
public String msg() {
  return "This is the products page.";
}

    @GetMapping("/products/{productId}")
public String getProduct(@PathVariable int productId) {
    if(productId==1){
  return "This is detail for ID: " + productId + ". " + "Product Name: Apple";}
  else if(productId==2){
    return "This is detail for ID: " + productId + ". " + "Product Name: Banana";}
    else if(productId==3){
        return "This is detail for ID: " + productId + ". " + "Product Name: Banana";}
        else {
            return "No product found.";}
}
    
}
