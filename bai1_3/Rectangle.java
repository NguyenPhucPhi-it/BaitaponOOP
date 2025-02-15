package bai1_3;

import java.util.Scanner;

public class Rectangle {
	private float length, width;

	public Rectangle() {
		length = 1.0f;
		width = 1.0f;
	}

	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	public double getArea() {
		return length * width;
	}
	
	public double getPerimeter() {
		return (length + width) * 2;
	}

	@Override
	public String toString() {
		return "Rectangle[length=" + length + ",width=" + width + "]";
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(1.2f, 3.4f);
		System.out.println(r1);
		Rectangle r2 = new Rectangle();
		System.out.println(r2);
		
		r1.setLength(5.6f);
		r1.setWidth(7.8f);
		System.out.println(r1);
		System.out.println("length is: " + r1.getLength());
		System.out.println("width is: " + r1.getWidth());
		System.out.println("area is: " + String.format("%.2f", r1.getArea()));
		System.out.println("perimeter is: " + String.format("%.2f", r1.getPerimeter()));
		
	}
}
