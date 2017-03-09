/**
 * 
 */
package com.lynch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lynch.model.City;
import com.lynch.service.CityService;

/**
 * @Description TODO
 * @author Lynch
 * @date 2017年3月8日
 */
@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    private List<City> getAll() {
        return cityService.fetchAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    private City fetchById(@PathVariable("id") Integer id) {
        return cityService.fetchById(id);
    }
}
