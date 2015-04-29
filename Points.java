/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package artstudio;

import java.awt.Point;

/**
 *
 * @author zvibock
 */
public class Points {
  private Point pointStart;
  private Point pointEnd;
  public Points(Point pointStart,Point pointEnd){
  this.pointStart=pointStart;
  this.pointEnd=pointEnd;
  }
  public Point getPointStart(){
    return pointStart;
  }
   public Point getPointEnd(){
    return pointEnd;
  }
}
