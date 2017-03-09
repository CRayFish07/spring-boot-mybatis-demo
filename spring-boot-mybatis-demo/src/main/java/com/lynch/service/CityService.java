/**
 * 
 */
package com.lynch.service;

import java.util.List;

import com.lynch.model.City;

/**
 * @Description TODO
 * @author Lynch
 * @date 2017年3月8日
 */
public interface CityService {
    List<City> fetchAll();

    City fetchById(Integer id);
}
