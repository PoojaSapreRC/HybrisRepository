/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.onercyber.setup;

import static com.onercyber.constants.MyonetrainingConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import com.onercyber.constants.MyonetrainingConstants;
import com.onercyber.service.MyonetrainingService;


@SystemSetup(extension = MyonetrainingConstants.EXTENSIONNAME)
public class MyonetrainingSystemSetup
{
	private final MyonetrainingService myonetrainingService;

	public MyonetrainingSystemSetup(final MyonetrainingService myonetrainingService)
	{
		this.myonetrainingService = myonetrainingService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		myonetrainingService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return MyonetrainingSystemSetup.class.getResourceAsStream("/myonetraining/sap-hybris-platform.png");
	}
}
