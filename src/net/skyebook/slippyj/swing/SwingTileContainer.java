/**
 * 
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

}
