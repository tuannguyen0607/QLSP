package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    public static List<Product> products = new ArrayList<>();


    static {
        products.add(new Product(1,"Tuấn","https://media-cdn-v2.laodong.vn/Storage/NewsPortal/2021/5/26/913299/Ngan-Ha24.jpg", 10000.0));
        products.add(new Product(2,"Toàn","https://media-cdn-v2.laodong.vn/Storage/NewsPortal/2021/5/26/913299/Ngan-Ha24.jpg", 10000.0));
        products.add(new Product(3,"Đức","https://media-cdn-v2.laodong.vn/Storage/NewsPortal/2021/5/26/913299/Ngan-Ha24.jpg", 10000.0));
        products.add(new Product(4,"Linh","https://media-cdn-v2.laodong.vn/Storage/NewsPortal/2021/5/26/913299/Ngan-Ha24.jpg", 10000.0));
    }
    public static void add(Product product){
        products.add(product);
    }
    public  static void delete(int id){
        products.remove(findByid(id));
    }
    public static Product findByid(int id){
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId()==id){
                return products.get(i) ;
            }
        }
        return null;
    }
}
