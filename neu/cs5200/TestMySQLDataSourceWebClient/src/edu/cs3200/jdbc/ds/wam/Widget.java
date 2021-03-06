package edu.cs3200.jdbc.ds.wam;

public class Widget {
	public int id = -1;
	public String name;
	public String content;
	public int height;
	public int width;
	public int top;
	public int left;
	public String bgColor;
	public String fgColor;
	public Widget(int i, String n, String c) {
		this.id = i;
		this.name = n;
		this.content = c;
	}
	public Widget(int id, String name, String content, int top, int left, int width, int height, String bgColor, String fgColor) {
		this.id = id;
		this.name = name;
		this.content = content;
		this.top = top;
		this.left = left;
		this.width = width;
		this.height = height;
		this.bgColor = bgColor;
		this.fgColor = fgColor;
	}
	public Widget(String name, String content, int top, int left, int width, int height, String bgColor, String fgColor) {
		this.name = name;
		this.content = content;
		this.top = top;
		this.left = left;
		this.width = width;
		this.height = height;
		this.bgColor = bgColor;
		this.fgColor = fgColor;
	}
}
