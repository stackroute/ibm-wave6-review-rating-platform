package com.stackroute.productOwnerservice.service;

import com.stackroute.productOwnerservice.domain.ProductOwner;
import com.stackroute.productOwnerservice.exception.ProductOwnerDetailsAlreadyExistsException;
import com.stackroute.productOwnerservice.exception.ProductOwnerDetailsNotFoundException;

import java.util.List;

public interface ProductOwnerService {

    public ProductOwner saveDetails(ProductOwner productowner) throws ProductOwnerDetailsAlreadyExistsException;

    public List<ProductOwner> getAllDetails();


    public ProductOwner deleteDetails(String emailId) throws ProductOwnerDetailsNotFoundException;

    public ProductOwner updateDetails(ProductOwner productowner) throws ProductOwnerDetailsNotFoundException;

}
