package org.koushik.javabrains;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author adilb_000
 *
 */
public class Triangle implements Shape{
	
	//private List<Point> points;
	
	private Point PointA;
	private Point PointB;
	private Point PointC;
	private ApplicationContext context=null;
	
	
	public Point getPointA() {
		return PointA;
	}


	public void setPointA(Point pointA) {
		PointA = pointA;
	}


	public Point getPointB() {
		return PointB;
	}


	public void setPointB(Point pointB) {
		PointB = pointB;
	}


	public Point getPointC() {
		return PointC;
	}


	public void setPointC(Point pointC) {
		PointC = pointC;
	}

/*
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
*/
	/*
	private String type;
	private int height;
	public int getHeight() {
		return height;
	}
	public String getType() {
		return type;
	}
	public Triangle (String type,int height)
	{
		this.type=type;
		this.height=height;
	}/
	
/*	public void setType(String type) {
		this.type = type;
	}*/
	public void draw(){
	/*	for(Point point : points){
			System.out.println("Point B=("+ point.getX()+","+ point.getY()+")");
		}*/
		//System.out.println(getType()+" "+getHeight()+" Triangle draw");
		
		System.out.println("Drawing Traingle");
		
		System.out.println("Point A=("+ getPointA().getX()+","+ getPointA().getY()+")");

		System.out.println("Point B=("+ getPointB().getX()+","+ getPointB().getY()+")");
		
		System.out.println("Point C=("+ getPointC().getX()+","+ getPointC().getY()+")");
	}



/*
@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
    System.out.println("InitializingBean init method is called for Triangle");

	
}


@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("DisposableBean destroy method is called for Triangle");

	
}
*/
}
