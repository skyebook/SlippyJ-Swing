/**
 * 
 */
package net.skyebook.slippyj.swing;

import javax.swing.JPanel;

import net.skyebook.slippyj.TileContainer;
import net.skyebook.slippyj.tile.Tile;

/**
 * A Swing implementation of {@link TileContainer}
 * @author Skye Book
 *
 */
public class SwingTileContainer extends JPanel implements TileContainer<SwingTile>{
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
	}

	/* (non-Javadoc)
	 * @see net.skyebook.slippyj.TileContainer#removeTile(net.skyebook.slippyj.tile.Tile)
	 */
	@Override
	public void removeTile(SwingTile tile) {
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
		// TODO Auto-generated method stub

	}

}
