package com.example.study.home;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Locale;

@Controller
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home(Locale locale, ModelAndView model) {
        logger.info("시작 도메인으로 접속했습니다 {}.", locale);
        model.addObject("locale", locale);
        model.setViewName("index");
        return model;
    }

}
