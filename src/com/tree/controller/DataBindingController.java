package com.tree.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by cqy on 17-7-17.
 */

@Controller
public class DataBindingController {

    private static final Log logger = LogFactory.getLog(DataBindingController.class);

    @RequestMapping(value = "/path/{userId}")
    public String pathVariableTest(@PathVariable Integer userId){
        logger.info("通过@PathVariable获得的数据:"+userId);

        return "result2";
    }
}
