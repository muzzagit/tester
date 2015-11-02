package org.muzza.tester.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by muzzammil.ayyubi on 02 Nov, 15.
 */
@RestController
@RequestMapping("/")
public class BaseController {

    @RequestMapping("test")
    @ResponseBody
    public String test() {
        return "Testing the spring web app";
    }

}
