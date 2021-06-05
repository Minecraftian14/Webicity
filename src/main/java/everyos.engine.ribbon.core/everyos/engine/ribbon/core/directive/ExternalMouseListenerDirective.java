package everyos.engine.ribbon.core.directive;

import everyos.engine.ribbon.core.event.MouseListener;
import everyos.engine.ribbon.core.graphics.InvalidationLevel;
import everyos.engine.ribbon.core.ui.ComponentUI;
import everyos.engine.ribbon.core.ui.UIDirective;
import everyos.engine.ribbon.core.ui.UIDirectiveWrapper;

public interface ExternalMouseListenerDirective extends UIDirective {
	public MouseListener getListener();
	public static UIDirectiveWrapper of(MouseListener listener) {
		return UIDirectiveWrapper.<ExternalMouseListenerDirective>wrap(()->listener, InvalidationLevel.IGNORE, ComponentUI.class);
	}
}
