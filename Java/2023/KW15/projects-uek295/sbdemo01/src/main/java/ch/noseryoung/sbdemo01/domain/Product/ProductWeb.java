package ch.noseryoung.sbdemo01.domain.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductWeb {
    @Autowired
    private ProductService service;

    public ProductWeb(){
    }

    @GetMapping("/products")
    private ResponseEntity<List<Product>> getAllProducts(){
        return ResponseEntity.ok().body(service.getAllProducts());
    }

    @GetMapping("/products/{pruductId}")
    private ResponseEntity<Product> getProduct(@PathVariable("pruductId") int pruductId){
        return ResponseEntity.status(200).body(service.getProductById(pruductId));
    }

    /*@DeleteMapping("/products/{productId}")
    private void deleteProduct(@PathVariable("poductId") int productId){
        service.deleteProduct(productId);
    }*/


    /*@GetMapping("/say/{requestedText}")
    public ResponseEntity<String> say
            (@PathVariable("requestedText") String requestedTExt){
        return ResponseEntity.ok().body(requestedTExt);
    }*/
}


