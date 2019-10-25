package pureImage;

import java.awt.Color;
/**
 * ��ɫ
 * @author liyang
 * @version 2019��10��25�� ����7:29:28
 */
public class PureColor {
	/**
	 * ��ɫ����
	 */
	private String name;
	/**
	 * ����ɫ
	 */
	private Color color;
	/**
	 * ����ɫ
	 */
	private Color fontColor;
	/**
	 * rgb����
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
