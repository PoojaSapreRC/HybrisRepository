/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 02-Jun-2021, 4:14:19 PM                     ---
 * ----------------------------------------------------------------
 */
package com.rcyber.core.jalo;

import com.rcyber.core.constants.MytrainingCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Rice}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedRice extends GenericItem
{
	/** Qualifier of the <code>Rice.Basmatirice</code> attribute **/
	public static final String BASMATIRICE = "Basmatirice";
	/** Qualifier of the <code>Rice.Whiterice</code> attribute **/
	public static final String WHITERICE = "Whiterice";
	/** Qualifier of the <code>Rice.Brownrice</code> attribute **/
	public static final String BROWNRICE = "Brownrice";
	/** Qualifier of the <code>Rice.Jasminerice</code> attribute **/
	public static final String JASMINERICE = "Jasminerice";
	/** Qualifier of the <code>Rice.UserRiceMap</code> attribute **/
	public static final String USERRICEMAP = "UserRiceMap";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(BASMATIRICE, AttributeMode.INITIAL);
		tmp.put(WHITERICE, AttributeMode.INITIAL);
		tmp.put(BROWNRICE, AttributeMode.INITIAL);
		tmp.put(JASMINERICE, AttributeMode.INITIAL);
		tmp.put(USERRICEMAP, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Rice.Basmatirice</code> attribute.
	 * @return the Basmatirice
	 */
	public String getBasmatirice(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BASMATIRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Rice.Basmatirice</code> attribute.
	 * @return the Basmatirice
	 */
	public String getBasmatirice()
	{
		return getBasmatirice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Rice.Basmatirice</code> attribute. 
	 * @param value the Basmatirice
	 */
	public void setBasmatirice(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BASMATIRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Rice.Basmatirice</code> attribute. 
	 * @param value the Basmatirice
	 */
	public void setBasmatirice(final String value)
	{
		setBasmatirice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Rice.Brownrice</code> attribute.
	 * @return the Brownrice
	 */
	public String getBrownrice(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BROWNRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Rice.Brownrice</code> attribute.
	 * @return the Brownrice
	 */
	public String getBrownrice()
	{
		return getBrownrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Rice.Brownrice</code> attribute. 
	 * @param value the Brownrice
	 */
	public void setBrownrice(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BROWNRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Rice.Brownrice</code> attribute. 
	 * @param value the Brownrice
	 */
	public void setBrownrice(final String value)
	{
		setBrownrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Rice.Jasminerice</code> attribute.
	 * @return the Jasminerice
	 */
	public String getJasminerice(final SessionContext ctx)
	{
		return (String)getProperty( ctx, JASMINERICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Rice.Jasminerice</code> attribute.
	 * @return the Jasminerice
	 */
	public String getJasminerice()
	{
		return getJasminerice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Rice.Jasminerice</code> attribute. 
	 * @param value the Jasminerice
	 */
	public void setJasminerice(final SessionContext ctx, final String value)
	{
		setProperty(ctx, JASMINERICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Rice.Jasminerice</code> attribute. 
	 * @param value the Jasminerice
	 */
	public void setJasminerice(final String value)
	{
		setJasminerice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Rice.UserRiceMap</code> attribute.
	 * @return the UserRiceMap
	 */
	public Map<String,String> getAllUserRiceMap(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, USERRICEMAP);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Rice.UserRiceMap</code> attribute.
	 * @return the UserRiceMap
	 */
	public Map<String,String> getAllUserRiceMap()
	{
		return getAllUserRiceMap( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Rice.UserRiceMap</code> attribute. 
	 * @param value the UserRiceMap
	 */
	public void setAllUserRiceMap(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, USERRICEMAP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Rice.UserRiceMap</code> attribute. 
	 * @param value the UserRiceMap
	 */
	public void setAllUserRiceMap(final Map<String,String> value)
	{
		setAllUserRiceMap( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Rice.Whiterice</code> attribute.
	 * @return the Whiterice
	 */
	public String getWhiterice(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WHITERICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Rice.Whiterice</code> attribute.
	 * @return the Whiterice
	 */
	public String getWhiterice()
	{
		return getWhiterice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Rice.Whiterice</code> attribute. 
	 * @param value the Whiterice
	 */
	public void setWhiterice(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WHITERICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Rice.Whiterice</code> attribute. 
	 * @param value the Whiterice
	 */
	public void setWhiterice(final String value)
	{
		setWhiterice( getSession().getSessionContext(), value );
	}
	
}
