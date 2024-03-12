package com.shoesclick.bff.site.shoes.service;

import com.shoesclick.bff.site.shoes.aspect.ObjectReturnType;
import com.shoesclick.bff.site.shoes.aspect.ReturnNullObject;
import com.shoesclick.bff.site.shoes.entity.Filter;
import com.shoesclick.bff.site.shoes.entity.ListProduct;
import com.shoesclick.bff.site.shoes.entity.Product;
import com.shoesclick.bff.site.shoes.repository.ProductRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

    private final ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Cacheable(value="filter_products", key="#filter.filter + '_' + #filter.page")
    @ReturnNullObject(ObjectReturnType.SPRING_PAGE)
    public ListProduct filter(Filter filter) {
        return productRepository.filter(filter);
    }

    @Cacheable(value="all_products", key="#root.method.name")
    @ReturnNullObject(ObjectReturnType.SPRING_PAGE)
    public ListProduct listAll() {
        return productRepository.listAll();
    }

    @Cacheable(value="find_product", key="#id")
    @ReturnNullObject(ObjectReturnType.OBJECT)
    public Product findById(Long id) {
        return productRepository.findById(id);
    }

}