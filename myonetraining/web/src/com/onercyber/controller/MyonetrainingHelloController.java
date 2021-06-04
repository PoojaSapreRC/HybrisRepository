/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.onercyber.controller;

import static com.onercyber.constants.MyonetrainingConstants.PLATFORM_LOGO_CODE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.onercyber.service.MyonetrainingService;


@Controller
public class MyonetrainingHelloController
{
	@Autowired
	private MyonetrainingService myonetrainingService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(final ModelMap model)
	{
		model.addAttribute("logoUrl", myonetrainingService.getHybrisLogoUrl(PLATFORM_LOGO_CODE));
		return "welcome";
	}
}
