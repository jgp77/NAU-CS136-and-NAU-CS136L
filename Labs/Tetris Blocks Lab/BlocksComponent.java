import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.geom.AffineTransform;

class BlocksComponent extends JComponent
	{
	  @Override
	  protected void paintComponent(Graphics g)
	  {
		super.paintComponent(g);
		Graphics2D g2d=(Graphics2D)g;
		AffineTransform cords=g2d.getTransform();
		// Set up for Graphics2D, paintComponent, and the default transformation cords
		Rectangle block_l1 = new Rectangle(0,0,40,20);
		Rectangle block_l2 = new Rectangle(0,0,20,60);
		g2d.setColor(Color.ORANGE);
		//Creates 2 new rectangles for the L shaped block. Sets the color to ORANGE
		g2d.translate(0,420);
		g2d.scale(1,-1);
		// Moves the block into place and flips it to correct orientation
		g2d.fill(block_l1);
		g2d.fill(block_l2);
		// Filles in the blocks for L
		g2d.translate(80,-40);
		// Translation for the 2nd L block
		g2d.fill(block_l1);
		g2d.fill(block_l2);
		// Filling the second L block
		g2d.translate(-80,400);
		g2d.scale(1,-1);
		// Translates back to default orientation an flips g2d back to normal
		Rectangle block_z1 = new Rectangle(20,0,20,40);
		Rectangle block_z2 = new Rectangle(0,20,20,40);
		g2d.setColor(Color.RED);
		// Creates the rectangles for the Z block and sets color to RED
		g2d.translate(80,320);
		g2d.rotate(Math.toRadians(90));
		// Translates to correct place and rotates block
		g2d.fill(block_z2);
		g2d.fill(block_z1);
		// Fills the first Z block
		g2d.translate(60,20);
		// Moves g2d to the correct location
		g2d.fill(block_z2);
		g2d.fill(block_z1);
		// Fills in the second Z block
		g2d.setTransform(cords);
		// Resets transformation back to 0,0
		Rectangle block_j1 = new Rectangle(0,0,20,60);
		Rectangle block_j2 = new Rectangle(0,0,40,20);
		g2d.setColor(Color.BLUE);
		// Creates 2 new rectangles for the J block
		g2d.translate(60,0);
		g2d.rotate(Math.toRadians(90));
		g2d.translate(420,0);
		// Translates into correct place followed by a rotation
		g2d.fill(block_j1);
		g2d.fill(block_j2);
		// Fills in the first J block
		g2d.setTransform(cords);
		// Resets transformation back to 0,0
		g2d.translate(60,0);
		g2d.rotate(Math.toRadians(90));
		g2d.translate(380,-80);
		// Translates into correct place followed by a rotation
		g2d.fill(block_j1);
		g2d.fill(block_j2);
		// Fills the 2nd J block
		g2d.setTransform(cords);
		// Resets transformation back to 0,0
		Rectangle block_i1 = new Rectangle(0,0,20,80);
		g2d.setColor(Color.CYAN);
		// Creates the rectangle for the I block
		g2d.translate(80,0);
		g2d.rotate(Math.toRadians(90));
		g2d.translate(480,0);
		// Translates into correct place followed by a rotation
		g2d.fill(block_i1);
		// Fills in the first I block
		g2d.setTransform(cords);
		// Resets transformation back to 0,0
		g2d.translate(160,320);
		// Translates 2nd block in to place
		g2d.fill(block_i1);
		// Fills in the 2nd I block
		Rectangle block_o1 = new Rectangle(0,0,40,40);
		g2d.setColor(Color.YELLOW);
		// Creates the rectangle for the O block and sets color to YELLOW
		g2d.translate(-20,80);
		g2d.fill(block_o1);
		// Translates block in to place and fills it in
		g2d.translate(-40,60);
		g2d.fill(block_o1);
		// Translates 2nd block into place and fills it in
		Rectangle block_s1 = new Rectangle(0,0,20,40);
		Rectangle block_s2 = new Rectangle(20,20,20,40);
		g2d.setColor(Color.GREEN);
		// Creates the rectangles for the S block and changes color to GREEN
		g2d.translate(-40,-20);
		g2d.fill(block_s1);
		g2d.fill(block_s2);
		// Translates block into place and then fills it in
		g2d.translate(40,-40);
		g2d.fill(block_s1);
		g2d.fill(block_s2);
		// Translates block into place and then fills it in
		Rectangle block_t1 = new Rectangle(0,0,60,20);
		Rectangle block_t2 = new Rectangle(20,20,20,20);
		g2d.setColor(Color.MAGENTA);
		// Creates the rectangles for the T block and changes color to MAGENTA (Couldn't find purple)
		g2d.rotate(Math.toRadians(90));
		g2d.translate(40,-80);
		// Rotates the block and then translates it into place
		g2d.fill(block_t1);
		g2d.fill(block_t2);
		// Fills the first T block
		g2d.translate(-100,20);
		// Translates 2nd T block into place
		g2d.fill(block_t1);
		g2d.fill(block_t2);
		// Fills in the 2nd T block
	}
}
