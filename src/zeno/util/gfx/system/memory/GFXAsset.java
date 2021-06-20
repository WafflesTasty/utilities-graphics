package zeno.util.gfx.system.memory;

import zeno.util.algebra.linear.vector.Vector;
import zeno.util.gfx.system.GFXMemory;

/**
 * The {@code GFXAsset} interface defines an asset generated in {@code GFXMemory}.
 * 
 * @author Zeno
 * @since Sep 18, 2016
 * @version 1.0
 * 
 * 
 * @see GFXMemory
 */
public interface GFXAsset extends GFXMemory.Data
{
	/**
	 * The {@code Hints} interface defines rendering hints for a {@code GFXAsset}.
	 *
	 * @author Zeno
	 * @since 12 May 2020
	 * @version 1.0
	 */
	public static interface Hints
	{
		/**
		 * The {@code Scaling} enum defines scaling methods for a {@code GFXAsset}.
		 * 
		 * @author Zeno
		 * @since Sep 18, 2016
		 * @version 1.0
		 * 
		 * 
		 * @see Hints
		 */
		public static enum Scaling
		{
			/**
			 * Find the nearest pixel of the average between mipmaps.
			 */
			AVG_MIPMAP_NEAREST,
			/**
			 * Interpolate pixels of the average between mipmaps.
			 */
			AVG_MIPMAP_LINEAR,
			/**
			 * Find the nearest pixel of the nearest mipmap.
			 */
			MIPMAP_NEAREST,
			/**
			 * Interpolate pixels of the nearest mipmap.
			 */
			MIPMAP_LINEAR,
			/**
			 * Find the nearest pixel on the asset.
			 */
			NEAREST,
			/**
			 * Interpolate pixels on the asset.
			 */
			LINEAR;
		}

		/**
		 * The {@code Border} enum defines border methods for a {@code GFXAsset}.
		 * 
		 * @author Zeno
		 * @since Sep 18, 2016
		 * @version 1.0
		 * 
		 * 
		 * @see Hints
		 */
		public static enum Border
		{
			/**
			 * Do not draw beyond the edge of the {@code GFXAsset}.
			 */
			NONE,
			/**
			 * Clamp coordinates to the edge of the {@code GFXAsset}.
			 */
			CLAMP_TO_EDGE,
			/**
			 * Mirror and repeat coordinates of the {@code GFXAsset}.
			 */
			MIRROR_REPEAT,
			/**
			 * Repeat coordinates of the {@code GFXAsset}.
			 */
			REPEAT,
		}


		/**
		 * Changes the scaling method of the {@code GFXAsset}.
		 * 
		 * @param min  a minimum scaling method
		 * @param max  a maximum scaling method
		 * 
		 * 
		 * @see Scaling
		 */
		public abstract void setScaling(Scaling min, Scaling max);
			
		/**
		 * Changes the level of detail of the {@code GFXAsset}.
		 * 
		 * @param min  a minimum level of detail
		 * @param max  a maximum level of detail
		 */
		public abstract void setLevelOfDetail(int min, int max);
		
		/**
		 * Changes the border method of the {@code GFXAsset}.
		 * 
		 * @param border  a border method
		 * 
		 * 
		 * @see Border
		 */
		public abstract void setBorder(Border... border);
		
		
		/**
		 * Changes the scaling method of the {@code GFXAsset}.
		 * 
		 * @param scale  a scaling method
		 * 
		 * 
		 * @see Scaling
		 */
		public default void setScaling(Scaling scale)
		{
			setScaling(scale, scale);
		}
		
		/**
		 * Changes the level of detail of the {@code GFXAsset}.
		 * 
		 * @param lod  a maximum level of detail
		 */
		public default void setLevelOfDetail(int lod)
		{
			setLevelOfDetail(0, lod);
		}

		/**
		 * Changes the border method of the {@code GFXAsset}.
		 * 
		 * @param border  a border method
		 * 
		 * 
		 * @see Border
		 */
		public default void setBorder(Border border)
		{
			setBorder(border, border, border);
		}
	}
	
	
	/**
	 * Returns the rendering hints of the {@code GFXAsset}.
	 * 
	 * @return  a set of rendering hints
	 * 
	 * 
	 * @see Hints
	 */
	public abstract Hints Hints();
	
	/**
	 * Returns the size of the {@code GFXAsset}.
	 * 
	 * @return  a size vector
	 * 
	 * 
	 * @see Vector
	 */
	public abstract Vector Size();
}