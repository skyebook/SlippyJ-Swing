/**
 * 
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
