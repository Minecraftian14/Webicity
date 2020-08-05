package everyos.browser.webicity.webribbon.component;

import java.util.HashMap;

import everyos.browser.webicity.renderer.html.dom.Node;
import everyos.browser.webicity.webribbon.misc.DrawData;
import everyos.engine.ribbon.renderer.guirenderer.GUIRenderer;
import everyos.engine.ribbon.renderer.guirenderer.graphics.Color;

public class WebAnchorComponent extends WebComponent { //TODO: Code will be moved to WebUI
	public WebAnchorComponent(Node node) {
		super(node);
	}
	
	public void calculateCascade() {
		attributes = new HashMap<>();
		attributes.put("display", "inline");
		attributes.put("color", Color.BLUE);
	};
	
	public void paint(GUIRenderer r, DrawData d) {
		r.setForeground(Color.BLUE);
		paintChildren(r, d);
	}
}
