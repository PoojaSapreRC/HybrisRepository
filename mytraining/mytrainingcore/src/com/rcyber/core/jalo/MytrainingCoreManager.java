/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.rcyber.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.rcyber.core.constants.MytrainingCoreConstants;
import com.rcyber.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class MytrainingCoreManager extends GeneratedMytrainingCoreManager
{
	public static final MytrainingCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (MytrainingCoreManager) em.getExtension(MytrainingCoreConstants.EXTENSIONNAME);
	}
}
