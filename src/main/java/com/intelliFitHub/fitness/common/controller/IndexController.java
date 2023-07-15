package com.intelliFitHub.fitness.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class IndexController {

    @GetMapping({ "/", "/index" })
	public String index(Model model) {
		log.info("*** index");
    	return "index";
	}
}