package com.shoesclick.bff.site.shoes.mapper;

import com.shoesclick.bff.site.shoes.entity.Address;
import com.shoesclick.bff.site.shoes.entity.Customer;
import com.shoesclick.bff.site.shoes.entity.Status;
import com.shoesclick.bff.site.shoes.openapi.model.domain.AddressRequest;
import com.shoesclick.bff.site.shoes.openapi.model.domain.AddressResponse;
import com.shoesclick.bff.site.shoes.openapi.model.domain.CustomerRequest;
import com.shoesclick.bff.site.shoes.openapi.model.domain.CustomerResponse;
import com.shoesclick.bff.site.shoes.openapi.model.domain.StatusResponse;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-09T22:40:40-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerResponse map(Customer response) {
        if ( response == null ) {
            return null;
        }

        CustomerResponse customerResponse = new CustomerResponse();

        customerResponse.setId( response.getId() );
        customerResponse.setName( response.getName() );
        customerResponse.setEmail( response.getEmail() );
        customerResponse.setUsername( response.getUsername() );
        customerResponse.setPassword( response.getPassword() );
        customerResponse.setAddress( addressToAddressResponse( response.getAddress() ) );

        return customerResponse;
    }

    @Override
    public Customer map(CustomerRequest request) {
        if ( request == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setId( request.getId() );
        customer.setName( request.getName() );
        customer.setUsername( request.getUsername() );
        customer.setEmail( request.getEmail() );
        customer.setPassword( request.getPassword() );
        customer.setAddress( map( request.getAddress() ) );

        return customer;
    }

    @Override
    public Address map(AddressRequest request) {
        if ( request == null ) {
            return null;
        }

        Address address = new Address();

        if ( request.getId() != null ) {
            address.setId( request.getId().longValue() );
        }
        address.setZipCode( request.getZipCode() );
        address.setNumber( request.getNumber() );
        address.setStreet( request.getStreet() );
        address.setNeighborhood( request.getNeighborhood() );
        address.setCity( request.getCity() );
        address.setState( request.getState() );

        return address;
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

    protected AddressResponse addressToAddressResponse(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressResponse addressResponse = new AddressResponse();

        if ( address.getId() != null ) {
            addressResponse.setId( address.getId().intValue() );
        }
        addressResponse.setZipCode( address.getZipCode() );
        addressResponse.setNumber( address.getNumber() );
        addressResponse.setStreet( address.getStreet() );
        addressResponse.setNeighborhood( address.getNeighborhood() );
        addressResponse.setState( address.getState() );
        addressResponse.setCity( address.getCity() );

        return addressResponse;
    }
}
