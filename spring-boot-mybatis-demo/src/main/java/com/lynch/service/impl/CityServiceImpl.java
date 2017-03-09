/**
 * 
 */
package com.lynch.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lynch.dao.CityMapper;
import com.lynch.model.City;
import com.lynch.model.CityExample;
import com.lynch.service.CityService;

/**
 * @Description TODO
 * @author Lynch
 * @date 2017年3月8日
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;


    @Override
    public List<City> fetchAll() {
        CityExample cityExample=new CityExample();
        cityExample.createCriteria().andIdIsNotNull();
        return cityMapper.selectByExample(cityExample);
    }

    @Override
    public City fetchById(Integer id) {
        return cityMapper.selectByPrimaryKey(id);
    }

}
