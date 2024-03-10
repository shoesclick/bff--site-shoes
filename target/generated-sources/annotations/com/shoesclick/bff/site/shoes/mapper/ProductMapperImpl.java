package com.shoesclick.bff.site.shoes.mapper;

import com.shoesclick.bff.site.shoes.entity.Filter;
import com.shoesclick.bff.site.shoes.entity.ListProduct;
import com.shoesclick.bff.site.shoes.entity.Pageable;
import com.shoesclick.bff.site.shoes.entity.Product;
import com.shoesclick.bff.site.shoes.entity.Sort;
import com.shoesclick.bff.site.shoes.entity.Status;
import com.shoesclick.bff.site.shoes.enums.Category;
import com.shoesclick.bff.site.shoes.openapi.model.domain.FilterRequest;
import com.shoesclick.bff.site.shoes.openapi.model.domain.ListProductResponse;
import com.shoesclick.bff.site.shoes.openapi.model.domain.PageableResponse;
import com.shoesclick.bff.site.shoes.openapi.model.domain.ProductRequest;
import com.shoesclick.bff.site.shoes.openapi.model.domain.ProductResponse;
import com.shoesclick.bff.site.shoes.openapi.model.domain.SortResponse;
import com.shoesclick.bff.site.shoes.openapi.model.domain.StatusResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-09T22:40:40-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductResponse map(Product response) {
        if ( response == null ) {
            return null;
        }

        ProductResponse productResponse = new ProductResponse();

        productResponse.setId( response.getId() );
        productResponse.setCode( response.getCode() );
        productResponse.setName( response.getName() );
        productResponse.setDescription( response.getDescription() );
        productResponse.setPrice( response.getPrice() );

        return productResponse;
    }

    @Override
    public Product map(ProductRequest request) {
        if ( request == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( request.getId() );
        product.setCode( request.getCode() );
        product.setName( request.getName() );
        product.setDescription( request.getDescription() );
        product.setPrice( request.getPrice() );
        if ( request.getCategory() != null ) {
            product.setCategory( Enum.valueOf( Category.class, request.getCategory() ) );
        }

        return product;
    }

    @Override
    public ListProductResponse map(ListProduct response) {
        if ( response == null ) {
            return null;
        }

        ListProductResponse listProductResponse = new ListProductResponse();

        listProductResponse.setContent( productListToProductResponseList( response.getContent() ) );
        listProductResponse.setPageable( pageableToPageableResponse( response.getPageable() ) );
        listProductResponse.setLast( response.getLast() );
        listProductResponse.setTotalPages( response.getTotalPages() );
        listProductResponse.setTotalElements( response.getTotalElements() );
        listProductResponse.setFirst( response.getFirst() );
        listProductResponse.setSize( response.getSize() );
        listProductResponse.setNumber( response.getNumber() );
        listProductResponse.setSort( sortToSortResponse( response.getSort() ) );
        listProductResponse.setNumberOfElements( response.getNumberOfElements() );
        listProductResponse.setEmpty( response.getEmpty() );

        return listProductResponse;
    }

    @Override
    public StatusResponse map(Status response) {
        if ( response == null ) {
            return null;
        }

        StatusResponse statusResponse = new StatusResponse();

        statusResponse.setCode( response.getCode() );
        statusResponse.setDescription( response.getDescription() );

        return statusResponse;
    }

    @Override
    public Filter map(FilterRequest request) {
        if ( request == null ) {
            return null;
        }

        Filter filter = new Filter();

        filter.setPage( request.getPage() );
        filter.setFilter( request.getFilter() );

        return filter;
    }

    protected List<ProductResponse> productListToProductResponseList(List<Product> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductResponse> list1 = new ArrayList<ProductResponse>( list.size() );
        for ( Product product : list ) {
            list1.add( map( product ) );
        }

        return list1;
    }

    protected SortResponse sortToSortResponse(Sort sort) {
        if ( sort == null ) {
            return null;
        }

        SortResponse sortResponse = new SortResponse();

        sortResponse.setEmpty( sort.getEmpty() );
        sortResponse.setSorted( sort.getSorted() );
        sortResponse.setUnsorted( sort.getUnsorted() );

        return sortResponse;
    }

    protected PageableResponse pageableToPageableResponse(Pageable pageable) {
        if ( pageable == null ) {
            return null;
        }

        PageableResponse pageableResponse = new PageableResponse();

        pageableResponse.setPageNumber( pageable.getPageNumber() );
        pageableResponse.setPageSize( pageable.getPageSize() );
        pageableResponse.setSort( sortToSortResponse( pageable.getSort() ) );
        pageableResponse.setOffset( pageable.getOffset() );
        pageableResponse.setUnpaged( pageable.getUnpaged() );
        pageableResponse.setPaged( pageable.getPaged() );

        return pageableResponse;
    }
}
