import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel 
{
            /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) 
			{
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1, width+1, height+1);
                        
                        //Draws the border of the flag, stripes, triangle and star
                        g.setColor(Color.RED);
                        g.drawRect(x1+10, y1+10, x1+210, y1+150);
                        
                        Polygon stripe1 = new Polygon();
                        stripe1.addPoint(x1+10, y1+10);
                        stripe1.addPoint(x1+220, y1+10);
                        stripe1.addPoint(x1+220, y1+40);
                        stripe1.addPoint(x1+10, y1+40);
                        g.setColor(Color.RED);
                        g.fillPolygon(stripe1);
                        
                        
                        Polygon stripe2 = new Polygon();
                        stripe2.addPoint(x1+10, y1+70);
                        stripe2.addPoint(x1+220, y1+70);
                        stripe2.addPoint(x1+220, y1+100);
                        stripe2.addPoint(x1+10, y1+100);
                        g.setColor(Color.RED);
                        g.fillPolygon(stripe2);                 
                        
                        Polygon stripe3 = new Polygon();
                        stripe3.addPoint(x1+10, y1+130);
                        stripe3.addPoint(x1+220, y1+130);
                        stripe3.addPoint(x1+220, y1+160);
                        stripe3.addPoint(x1+10, y1+160);
                        g.setColor(Color.RED);
                        g.fillPolygon(stripe3);  
                        
                       
                        
                        Polygon triangle = new Polygon();
                        triangle.addPoint(x1+10, y1+10);
                        triangle.addPoint(x1+10, y1+160);
                        triangle.addPoint(x1+115, y1+85);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(triangle);
                        
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25, y1 + 73);
                        p2.addPoint(x1 + 41, y1 + 73);
                        p2.addPoint(x1 + 47, y1 + 58);
                        p2.addPoint(x1 + 53, y1 + 73);
                        p2.addPoint(x1 + 69, y1 + 73);
                        p2.addPoint(x1 + 56, y1 + 83);
                        p2.addPoint(x1 + 61, y1 + 98);
                        p2.addPoint(x1 + 47, y1 + 88);
                        p2.addPoint(x1 + 34, y1 + 98);
                        p2.addPoint(x1 + 38, y1 + 83);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                        
                        
                  
                        
                                         
            }
}
