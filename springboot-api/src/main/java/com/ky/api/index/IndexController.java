package com.ky.api.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @ClassName IndexController
 * @Author lim@udiannet.com
 * @DATE 2018-09-11
 * @Version 1.0
 **/
@RestController
@RequestMapping(value="/index")
public class IndexController {

    @RequestMapping()
    public String index(){
        return "index";
    }
}
