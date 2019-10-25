package pureImage;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PureImageUtil {
	public static List<PureColor> pureColors = new ArrayList<PureColor>();
	public static List<PhoneStyle> styles = new ArrayList<>();
	static{
		pureColors.add(new PureColor("Óñô¢ÂÌ", new Color(164,202,182), Color.white, "a4cab6"));
		pureColors.add(new PureColor("ÇçÉ½À¶", new Color(143,178,201), Color.white, "8fb2c9"));
		pureColors.add(new PureColor("±¦Ê¯À¶", new Color( 36,134,185), Color.white, "2486b9"));
		pureColors.add(new PureColor("ÖñÂÌ", new Color(27,167,132), Color.white, "1ba784"));
		pureColors.add(new PureColor("ÔÂÓ°°×", new Color(192,196,195), Color.white, "c0c4c3"));
		pureColors.add(new PureColor("½ª»Æ", new Color(226,192,39), Color.white, "e2c027"));
		pureColors.add(new PureColor("Ñã»Ò", new Color(128,118,110), Color.white, "80766e"));
		pureColors.add(new PureColor("Ý®½´ºì", new Color(250,93,25), Color.white, "fa5d19"));
		pureColors.add(new PureColor("Çúºì", new Color(240,90,70), Color.white, "f05a46"));
		pureColors.add(new PureColor("½Û¹£×Ï", new Color(129,60,133), Color.white, "813c85"));
		
		styles.add(new PhoneStyle("Ð¡Ã×9", 1080, 2340));
		styles.add(new PhoneStyle("Í¨ÓÃ", 1080, 1920));
	}

}
