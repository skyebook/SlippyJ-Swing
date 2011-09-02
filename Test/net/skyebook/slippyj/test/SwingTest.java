/**
 *  SlippyJ - Slippery Maps in Java
 *  Copyright (C) 2011  Skye Book
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.skyebook.slippyj.test;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
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
				final Coordinate center = new Coordinate(41, -74);
				final Palette palette = new Palette(center, 12, stc, new SwingTileFactory(Palette.OSMSlippyServer));
				
				frame.addComponentListener(new ComponentListener() {
					
					@Override
					public void componentShown(ComponentEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void componentResized(ComponentEvent e) {
						if(!palette.isUpdating()) palette.build(center);
					}
					
					@Override
					public void componentMoved(ComponentEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void componentHidden(ComponentEvent e) {
						// TODO Auto-generated method stub
						
					}
				});
			}
		});
		
	}

}
