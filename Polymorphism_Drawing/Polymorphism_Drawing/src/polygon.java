
import java.awt.Point;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ffonseca
 */
public class polygon 
{
 ArrayList<Point> pt; 
 int numberOfPoints = 0;
 
 polygon(ArrayList ipt)
 {
     pt=ipt;
     numberOfPoints = pt.size();
 }
    
}
