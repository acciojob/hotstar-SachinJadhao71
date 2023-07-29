package com.driver.services;


import com.driver.EntryDto.ProductionHouseEntryDto;
import com.driver.model.ProductionHouse;
import com.driver.model.WebSeries;
import com.driver.repository.ProductionHouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductionHouseService {

    @Autowired
    ProductionHouseRepository productionHouseRepository;

    public Integer addProductionHouseToDb(ProductionHouseEntryDto productionHouseEntryDto){

        ProductionHouse productionHouse = new ProductionHouse();
//        fetch the attribute from the dto
        productionHouse.setName(productionHouseEntryDto.getName());
        productionHouse.setRatings(0);
        ProductionHouse savedProduction = productionHouseRepository.save(productionHouse);
        return  savedProduction.getId();
    }
}
