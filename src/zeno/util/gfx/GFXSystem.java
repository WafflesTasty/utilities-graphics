package zeno.util.gfx;

import zeno.util.gfx.system.GFXWindow;
import zeno.util.gfx.system.GFXMemory;

/**
 * The {@code GFXSystem} interface defines the core functionality of a graphics system.
 * 
 * @author Zeno
 * @since Sep 12, 2016
 * @version 1.0
 */
public interface GFXSystem
{	
	/**
	 * Returns the memory of the {@code GFXSystem}.
	 * 
	 * @return  a system memory
	 * 
	 * 
	 * @see GFXMemory
	 */
	public abstract GFXMemory Memory();
	
	/**
	 * Returns the window of the {@code GFXSystem}.
	 * 
	 * @return  a rendering window
	 * 
	 * 
	 * @see GFXWindow
	 */
	public abstract GFXWindow Window();
	
	/**
	 * Validates the state of the {@code GFXSystem}.
	 * 
	 * @return {@code true} if the system is valid
	 */
	public default boolean validate()
	{
		return true;
	}
}