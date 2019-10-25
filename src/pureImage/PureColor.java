package pureImage;

import java.awt.Color;
/**
 * 纯色
 * @author liyang
 * @version 2019年10月25日 下午7:29:28
 */
public class PureColor {
	/**
	 * 纯色名称
	 */
	private String name;
	/**
	 * 主颜色
	 */
	private Color color;
	/**
	 * 字体色
	 */
	private Color fontColor;
	/**
	 * rgb代码
	 */
	private String code;
	
	
	public PureColor(String name, Color color, Color fontColor, String code) {
		super();
		this.name = name;
		this.color = color;
		this.fontColor = fontColor;
		this.code = code;
	}
	
	public String getName() {
		return name;
	}
	public Color getColor() {
		return color;
	}
	public Color getFontColor() {
		return fontColor;
	}
	public String getCode() {
		return code;
	}

	@Override
	public String toString() {
		return "PureColor [name=" + name + ", color=" + color + ", fontColor=" + fontColor + ", code=" + code + "]";
	}
	
}
