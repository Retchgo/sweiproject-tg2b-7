package edu.hm.sweI.eam.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static edu.hm.sweI.eam.Constants.API_BASE;

/**
 * Author: Mario
 * Date: 28.11.2017
 */
@RestController
public class MailController {

    private static final Logger LOGGER = LogManager.getLogger(MailController.class);


    @RequestMapping(API_BASE + "/mailAddress")
    public void mail(@RequestBody String mailAddress) {
        LOGGER.info("Transmitted mailAddress:" + mailAddress);
    }

}


