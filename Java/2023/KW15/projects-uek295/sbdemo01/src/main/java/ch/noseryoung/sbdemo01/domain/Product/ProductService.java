package ch.noseryoung.sbdemo01.domain.Product;

import ch.noseryoung.sbdemo01.domain.Product.Product;
import ch.noseryoung.sbdemo01.domain.Product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service //sagt, das die Klasse eine Service-Klasse ist
public class ProductService {
    @Autowired //Markiert einen Konstruktor, ein Feld, eine Setter-Methode oder eine Konfigurationsmethode
    ProductRepository prRepo;

    public List<Product> getAllProducts(){
        List<Product> products = new ArrayList<Product>();
        prRepo.findAll().forEach(product -> products.add(product));
        return products;
    }

    /*public void deleteProduct(int productId){
        prRepo.deleteById(productId);
    }*/

    public Product getProductById(int productId) throws ProductNotFoundException {
        return prRepo.findById(productId).orElseThrow(() -> new ProductNotFoundException("Could not find Product with specified id"));
    }

    public Product createProduct(Product product){
        return prRepo.save(product);
    }
}
