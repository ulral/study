package com.example.study.home;

import com.example.study.array.model.service.ArrayService;
import com.example.study.company.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Locale;

@Controller
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    public ArrayService arrayService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home(Locale locale, ModelAndView model) {
        logger.info("시작 도메인으로 접속했습니다 {}.", locale);
        model.addObject("locale", locale);
        model.setViewName("index");
        return model;
    }

    @RequestMapping(value = "/array", method = RequestMethod.GET)
    public ModelAndView array(Locale locale, ModelAndView model) {
        logger.info("Array으로 이동했습니다 {}.", locale);
        model.addObject("array", arrayService.arrayList(new Employee()));
        model.setViewName("array");
        return model;
    }
}
