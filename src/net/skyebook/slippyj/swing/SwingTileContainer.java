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

import java.awt.Component;

import javax.swing.JPanel;

import net.skyebook.slippyj.TileContainer;

/**
 * A Swing implementation of {@link TileContainer}
 * @author Skye Book
 *
 */
public class SwingTileContainer<Tile> extends JPanel implements TileContainer<SwingTile>{
	private static final long serialVersionUID = 1L;

	public SwingTileContainer() {
		super();
		// use an absolute layout
		setLayout(null);
	}

	/* (non-Javadoc)
	 * @see net.skyebook.slippyj.TileContainer#addTile(net.skyebook.slippyj.tile.Tile)
	 */
	@Override
	public void addTile(SwingTile tile) {
		add(tile);
	}

	/* (non-Javadoc)
	 * @see net.skyebook.slippyj.TileContainer#removeTile(net.skyebook.slippyj.tile.Tile)
	 */
	@Override
	public void removeTile(SwingTile tile) {
		remove(tile);
	}

	/* (non-Javadoc)
	 * @see net.skyebook.slippyj.TileContainer#getWidth()
	 */
	@Override
	public int getWidth() {
		return super.getWidth();
	}

	/* (non-Javadoc)
	 * @see net.skyebook.slippyj.TileContainer#getHeight()
	 */
	@Override
	public int getHeight() {
		return super.getHeight();
	}

	/* (non-Javadoc)
	 * @see net.skyebook.slippyj.TileContainer#moveTiles(int, int)
	 */
	@Override
	public void moveTiles(int xDelta, int yDelta) {
		for(Component tile : getComponents()){
			tile.setLocation(tile.getX()+xDelta, tile.getY()+yDelta);
		}
	}

	/* (non-Javadoc)
	 * @see net.skyebook.slippyj.TileContainer#isXInverted()
	 */
	@Override
	public boolean isXInverted() {
		return false;
	}

	/* (non-Javadoc)
	 * @see net.skyebook.slippyj.TileContainer#isYInverted()
	 */
	@Override
	public boolean isYInverted() {
		return false;
	}

	@Override
	public void removeAllTiles() {
		for(Component component : getComponents()){
			if(component instanceof SwingTile){
				remove(component);
			}
		}
	}

}
