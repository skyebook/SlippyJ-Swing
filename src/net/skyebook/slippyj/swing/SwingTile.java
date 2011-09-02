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

import javax.swing.JLabel;

import net.skyebook.slippyj.Coordinate;
import net.skyebook.slippyj.tile.ITileMouseMotionListener;
import net.skyebook.slippyj.tile.ITileSelectionListener;
import net.skyebook.slippyj.tile.Tile;

/**
 * @author Skye Book
 *
 */
public class SwingTile extends JLabel implements Tile {
	private static final long serialVersionUID = 1L;
	
	private int x;
	private int y;

	/**
	 * 
	 */
	public SwingTile() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see net.skyebook.slippyj.tile.Tile#getMinimumLatitude()
	 */
	@Override
	public double getMinimumLatitude() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see net.skyebook.slippyj.tile.Tile#getMinimumLongitude()
	 */
	@Override
	public double getMinimumLongitude() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see net.skyebook.slippyj.tile.Tile#getMaximumLatitude()
	 */
	@Override
	public double getMaximumLatitude() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see net.skyebook.slippyj.tile.Tile#getMaximumLongitude()
	 */
	@Override
	public double getMaximumLongitude() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see net.skyebook.slippyj.tile.Tile#getCenter()
	 */
	@Override
	public Coordinate getCenter() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see net.skyebook.slippyj.tile.Tile#addTileSelectionListener(net.skyebook.slippyj.tile.ITileSelectionListener)
	 */
	@Override
	public void addTileSelectionListener(
			ITileSelectionListener tileSelectionListener) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see net.skyebook.slippyj.tile.Tile#addTileMouseMotionListener(net.skyebook.slippyj.tile.ITileMouseMotionListener)
	 */
	@Override
	public void addTileMouseMotionListener(
			ITileMouseMotionListener tileMouseMotionListener) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see net.skyebook.slippyj.tile.Tile#getZoomLevel()
	 */
	@Override
	public int getZoomLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see net.skyebook.slippyj.tile.Tile#getTileXValue()
	 */
	@Override
	public int getTileXValue() {
		return x;
	}

	/* (non-Javadoc)
	 * @see net.skyebook.slippyj.tile.Tile#getTileYValue()
	 */
	@Override
	public int getTileYValue() {
		return y;
	}

	/* (non-Javadoc)
	 * @see net.skyebook.slippyj.tile.Tile#isDisplayed()
	 */
	@Override
	public boolean isDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see net.skyebook.slippyj.tile.Tile#setDisplayed(boolean)
	 */
	@Override
	public boolean setDisplayed(boolean displayed) {
		// TODO Auto-generated method stub
		return false;
	}

}
