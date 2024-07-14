package com.sam.ws.peacock_practice.service;

import com.sam.ws.peacock_practice.entity.Parent;

import java.util.List;

public interface ParentService {
    public Parent createParent(Parent parent);
    public Parent getParentById(Long id);
    public List<Parent> getAllParents();
    public Parent totalFee(Long id, Double totalFee);
    public Parent paidFee(Long id, Double paidFee);
    public Parent deleteParent(Long id);
}
