package gui.components;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public abstract class Component implements Visible {

	//fields
	private int x;
	private int y;
	private int w;
	private int h;
	private BufferedImage image;
	
	public Component(int x, int y, int w, int h) {
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
		this.image = new BufferedImage(w,h,BufferedImage.TYPE_INT_ARGB);
		update(image.createGraphics());
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
		return w;
	}

	@Override
	public int getHeight() {
		return h;
	}

	@Override
	public boolean isAnimated() {
		return false;
	}

	@Override
	public void update() {
		update(image.createGraphics());
	}
	
	public abstract void update(Graphics2D g);
	
	public Graphics2D clear(){
		image=new BufferedImage(w,h, BufferedImage.TYPE_INT_ARGB);
		return image.createGraphics();
	}
	new Button(40,50,100,30,"Button",new Color(0,76,153), new Action(){
		public void act(){
		   act();
		}
		});
}
