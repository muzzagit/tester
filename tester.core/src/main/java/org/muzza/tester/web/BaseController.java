package org.muzza.tester.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by muzzammil.ayyubi on 002 02 Nov, 15.
 */
@Controller
@EnableAutoConfiguration
public class BaseController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Testing the spring web app";
    }

}
