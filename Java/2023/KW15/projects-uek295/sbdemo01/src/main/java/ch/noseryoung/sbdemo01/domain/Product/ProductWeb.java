package ch.noseryoung.sbdemo01.domain.Product;

import ch.qos.logback.core.net.AutoFlushingObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.persistence.ManyToMany;
import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

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
    private ResponseEntity<Product> getProduct(@PathVariable("pruductId") int pruductId) throws ProductNotFoundException {
        return ResponseEntity.status(200).body(service.getProductById(pruductId));
    }

    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(@Valid @RequestBody Product product) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createProduct(product));
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<String> handlePrdouctNotFoundException(ProductNotFoundException pnfe){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(pnfe.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleMethodArgumentNotValidException(MethodArgumentNotValidException manv){
        return ResponseEntity.status(400).body(manv.getFieldError().getDefaultMessage());
    }


    @GetMapping("/say/{requestedText}")
    public ResponseEntity<String> say
            (@PathVariable("requestedText") String requestedTExt){
        return ResponseEntity.ok().body(requestedTExt);
    }
}


