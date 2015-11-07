package org.muzza.tester.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by muzzammil.ayyubi on 003 03 Nov, 15.
 */
@RestController
@RequestMapping("/data/")
public class DataController {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public @ResponseBody String getData(){
        return "data test";
    }
}
