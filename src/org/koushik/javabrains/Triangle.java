package org.koushik.javabrains;

/**
 * @author adilb_000
 *
 */
public class Triangle {

	private Point PointA;
	private Point PointB;
	private Point PointC;
	
	
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
		//System.out.println(getType()+" "+getHeight()+" Triangle draw");
		System.out.println("Point A=("+ getPointA().getX()+","+ getPointA().getY()+")");

		System.out.println("Point B=("+ getPointB().getX()+","+ getPointB().getY()+")");
		
		System.out.println("Point C=("+ getPointC().getX()+","+ getPointC().getY()+")");
	}

}
