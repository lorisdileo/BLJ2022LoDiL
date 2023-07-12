package ch.noseryoung.sbdemo01.domain.Product;

public class ProductNotFoundException extends Exception{
    public ProductNotFoundException(String message){
        super(message);
    }
    public ProductNotFoundException(){
        super();
    }
}
