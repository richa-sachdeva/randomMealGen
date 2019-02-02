package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class MealService {

    /* @RequestMapping(value = "/pizza", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody*/

    @Autowired
    private MealDao mealDao;

    @RequestMapping(value="/meal/welcome")
    public String welcome() {
        return "Welcome to random meal gen";
    }

    @RequestMapping(value = "/meal/all", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
    public List<Meal> getAllMeals () {
        return mealDao.getAllMeals();
    }

    @RequestMapping(value = "/meal/get/{id}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
    public Meal getMealById(@PathVariable("id") int id) {
        return mealDao.findById(id);
    }
}
