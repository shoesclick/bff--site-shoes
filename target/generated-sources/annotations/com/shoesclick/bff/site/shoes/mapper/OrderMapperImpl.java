package com.shoesclick.bff.site.shoes.mapper;

import com.shoesclick.bff.site.shoes.entity.Order;
import com.shoesclick.bff.site.shoes.entity.OrderItem;
import com.shoesclick.bff.site.shoes.entity.OrderStatus;
import com.shoesclick.bff.site.shoes.entity.Status;
import com.shoesclick.bff.site.shoes.openapi.model.domain.OrderItemRequest;
import com.shoesclick.bff.site.shoes.openapi.model.domain.OrderItemResponse;
import com.shoesclick.bff.site.shoes.openapi.model.domain.OrderRequest;
import com.shoesclick.bff.site.shoes.openapi.model.domain.OrderResponse;
import com.shoesclick.bff.site.shoes.openapi.model.domain.OrderStatusRequest;
import com.shoesclick.bff.site.shoes.openapi.model.domain.StatusResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-09T10:25:43-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Order map(OrderRequest request) {
        if ( request == null ) {
            return null;
        }

        Order order = new Order();

        if ( request.getId() != null ) {
            order.setId( request.getId().longValue() );
        }
        order.setStatus( request.getStatus() );
        if ( request.getIdCustomer() != null ) {
            order.setIdCustomer( request.getIdCustomer().longValue() );
        }
        order.setCreatedAt( request.getCreatedAt() );
        order.setPaymentType( request.getPaymentType() );
        Map<String, Object> map = request.getPaymentParams();
        if ( map != null ) {
            order.setPaymentParams( new LinkedHashMap<String, Object>( map ) );
        }
        order.setOrderItems( orderItemRequestListToOrderItemList( request.getOrderItems() ) );

        return order;
    }

    @Override
    public OrderResponse map(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderResponse orderResponse = new OrderResponse();

        if ( order.getId() != null ) {
            orderResponse.setId( order.getId().intValue() );
        }
        orderResponse.setStatus( order.getStatus() );
        if ( order.getIdCustomer() != null ) {
            orderResponse.setIdCustomer( order.getIdCustomer().intValue() );
        }
        orderResponse.setCreatedAt( order.getCreatedAt() );
        orderResponse.setOrderItems( orderItemListToOrderItemResponseList( order.getOrderItems() ) );

        return orderResponse;
    }

    @Override
    public List<OrderResponse> map(List<Order> orderList) {
        if ( orderList == null ) {
            return null;
        }

        List<OrderResponse> list = new ArrayList<OrderResponse>( orderList.size() );
        for ( Order order : orderList ) {
            list.add( map( order ) );
        }

        return list;
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
    public OrderStatus map(OrderStatusRequest request) {
        if ( request == null ) {
            return null;
        }

        OrderStatus orderStatus = new OrderStatus();

        orderStatus.setStatus( request.getStatus() );

        return orderStatus;
    }

    protected OrderItem orderItemRequestToOrderItem(OrderItemRequest orderItemRequest) {
        if ( orderItemRequest == null ) {
            return null;
        }

        OrderItem orderItem = new OrderItem();

        orderItem.setIdProduct( orderItemRequest.getIdProduct() );
        orderItem.setNameProduct( orderItemRequest.getNameProduct() );
        orderItem.setPrice( orderItemRequest.getPrice() );

        return orderItem;
    }

    protected List<OrderItem> orderItemRequestListToOrderItemList(List<OrderItemRequest> list) {
        if ( list == null ) {
            return null;
        }

        List<OrderItem> list1 = new ArrayList<OrderItem>( list.size() );
        for ( OrderItemRequest orderItemRequest : list ) {
            list1.add( orderItemRequestToOrderItem( orderItemRequest ) );
        }

        return list1;
    }

    protected OrderItemResponse orderItemToOrderItemResponse(OrderItem orderItem) {
        if ( orderItem == null ) {
            return null;
        }

        OrderItemResponse orderItemResponse = new OrderItemResponse();

        if ( orderItem.getIdProduct() != null ) {
            orderItemResponse.setIdProduct( orderItem.getIdProduct().intValue() );
        }
        orderItemResponse.setNameProduct( orderItem.getNameProduct() );
        orderItemResponse.setPrice( orderItem.getPrice() );

        return orderItemResponse;
    }

    protected List<OrderItemResponse> orderItemListToOrderItemResponseList(List<OrderItem> list) {
        if ( list == null ) {
            return null;
        }

        List<OrderItemResponse> list1 = new ArrayList<OrderItemResponse>( list.size() );
        for ( OrderItem orderItem : list ) {
            list1.add( orderItemToOrderItemResponse( orderItem ) );
        }

        return list1;
    }
}
