package com.intelliFitHub.fitness.common.user.service;

import org.springframework.stereotype.Service;

import com.intelliFitHub.fitness.common.dao.domain.TdeeCalculator;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CalculationServiceImpl implements CalculationService{

    @Override
    public double CalculateTDEE(TdeeCalculator tdeeCalculator) throws Exception {
        try {
            //TODO: calculation
            return 8964.8964;
        } catch (Exception e) {
            // TODO: handle exception
        }
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'CalculateTDEE'");
    }
    
}
