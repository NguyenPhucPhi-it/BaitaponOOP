package Bai1_1;

import java.util.Scanner;

public class Circle {
	private double radius;
	private String color;
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập bán kính: ");
		int radius = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhâp màu sắc: ");
		String color = sc.nextLine();
		Circle circle = new Circle(radius, color);
		System.out.println("Diện tích hình tròn: " + circle.getArea());
		System.out.println("Thông tin hình tròn: " + circle);
		
		Circle circle2 = new Circle();
		System.out.println("Thông tin hình tròn: " + circle2);
	}
}
