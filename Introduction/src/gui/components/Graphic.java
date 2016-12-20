package gui.components;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class Graphic implements Visible {

	//fields 
	private BufferedImage image;
	private boolean loadedImages;
	private int x;
	private int y;
	
	//full size graphics constructor
	public Graphic(int x, int y, String imageLocation) {
		this.x = x;
		this.y = y;
		loadedImages = false;
		loadImages(imageLocation,0,0);
	}
	//custom size graphics constructor
	public Graphic(int x, int y, int w, int h, String imageLocation) {
		this.x = x;
		this.y = y;
		loadedImages = false;
		loadImages(imageLocation,w,h);
	}
	//scale size graphics constructor
	public Graphic(int x, int y, double scale, String imageLocation) {
		this.x = x;
		this.y = y;
		loadedImages = false;
		loadImages(imageLocation,scale);
	}
	private void loadImages(String imageLocation, double scale) {
		try{
			//get fullseize image
			ImageIcon icon = new ImageIcon(imageLocation);
			int newWidth = (int) (icon.getIconWidth()*scale);
			int newHeight = (int) (icon.getIconHeight()*scale);
			image = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
			Graphics2D g = image.createGraphics();
			g.drawImage(icon.getImage(), 0, 0, newWidth,newHeight,0,0,icon.getIconHeight(),icon.getIconHeight(),null);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	private void loadImages(String imageLocation, int w, int h) {
		try{
			//full size image
			ImageIcon icon = new ImageIcon(imageLocation);
			if(w<=0 && h<=0){
				//use fullsize icon
				image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
				//USE GRAPHICS 2D tool to copy icon
				Graphics2D g = image.createGraphics();
				g.drawImage(icon.getImage(), 0, 0, null);
			}
			else{
				//use custom size icon
				image = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
				//USE GRAPHICS 2D tool to copy icon
				Graphics2D g = image.createGraphics();
				/**
				 * note to self, this is how you crop:
				 *  image to draw
				 *  x cord of destination
				 *  y cord of destination 
				 *  width of destination
				 *  height of destination
				 *  x cord of target
				 *  y cord of target 
				 *  width of target
				 *  height of target
				 *  null
				 */
				g.drawImage(icon.getImage(), 0, 0, w,h,0,0,icon.getIconHeight(),icon.getIconHeight(),null);
			}
			loadedImages = true;
		}catch(Exception e){
			//this happens when you dont name the image correctly
			e.printStackTrace();
		}
	}

	@Override
	public BufferedImage getImage() {
		return image;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public int getWidth() {
		return image.getWidth();
	}

	@Override
	public int getHeight() {
		return image.getHeight();
	}

	@Override
	public boolean isAnimated() {
		return false;
	}

	@Override
	public void update() {
		//does nothing. image stays the same
	}

}
