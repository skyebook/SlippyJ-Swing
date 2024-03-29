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
package net.skyebook.slippyj.swing;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;

import net.skyebook.slippyj.tile.Tile;
import net.skyebook.slippyj.tile.TileFactory;

/**
 * @author Skye Book
 *
 */
public class SwingTileFactory extends TileFactory {

	/**
	 * @param tileServer
	 */
	public SwingTileFactory(String tileServer) {
		super(tileServer);
	}

	/* (non-Javadoc)
	 * @see net.skyebook.slippyj.tile.TileFactory#createTile(int, int, int)
	 */
	@Override
	public Tile createTile(int zoomLevel, int x, int y, int xLocation, int yLocation) {
		SwingTile tile = new SwingTile();
		
		try {
			URL tileURL = new URL(tileServer+zoomLevel+"/"+x+"/"+y+".png");
			System.out.println("Tile URL: " + tileURL);
			ImageIcon image = new ImageIcon(tileURL);
			System.out.println("Tile Going To: " + xLocation +", "+yLocation);
			tile.setBounds(xLocation, yLocation, image.getIconWidth(), image.getIconHeight());
			tile.setIcon(image);
		} catch (MalformedURLException e) {
			e.printStackTrace();
			tile.setSize(256, 256);
			tile.setText("Tile Could Not Be Created");
			System.err.println("Could not create tile!");
		}
		return tile;
	}

}
