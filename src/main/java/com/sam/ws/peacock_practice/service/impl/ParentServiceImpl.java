package com.sam.ws.peacock_practice.service.impl;

import com.sam.ws.peacock_practice.entity.Parent;
import com.sam.ws.peacock_practice.repository.ParentRepository;
import com.sam.ws.peacock_practice.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentServiceImpl implements ParentService {

    @Autowired
    ParentRepository parentRepository;

    @Override
    public Parent createParent(Parent parent) {
        Parent parentSaved=parentRepository.save(parent);
        return parentSaved;
    }

    @Override
    public Parent getParentById(Long id) {
        return null;
    }

    @Override
    public List<Parent> getAllParents() {
        return List.of();
    }

    @Override
    public Parent totalFee(Long id, Double totalFee) {
        return null;
    }

    @Override
    public Parent paidFee(Long id, Double paidFee) {
        return null;
    }

    @Override
    public Parent deleteParent(Long id) {
        return null;
    }
}
