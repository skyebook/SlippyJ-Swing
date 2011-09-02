/**
 * 
 */
package net.skyebook.slippyj.test;

import java.lang.reflect.InvocationTargetException;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import net.skyebook.slippyj.Coordinate;
import net.skyebook.slippyj.Palette;
import net.skyebook.slippyj.swing.SwingTileContainer;
import net.skyebook.slippyj.swing.SwingTileFactory;

/**
 * @author Skye Book
 *
 */
public class SwingTest {

	/**
	 * @param args
	 * @throws InvocationTargetException 
	 * @throws InterruptedException 
	 */
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws InterruptedException, InvocationTargetException {
		SwingUtilities.invokeAndWait(new Runnable() {
			
			@Override
			public void run() {
				JFrame frame = new JFrame("SlippyJ Swing Test");
				SwingTileContainer stc = new SwingTileContainer();
				frame.setSize(1000, 1000);
				stc.setSize(1000, 1000);
				frame.add(stc);
				frame.setVisible(true);
				Palette palette = new Palette(new Coordinate(41, -74), 12, stc, new SwingTileFactory(Palette.OSMSlippyServer));
			}
		});
		
	}

}
