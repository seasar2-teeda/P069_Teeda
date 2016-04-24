package tutorial.chura.web.time;

import java.util.Date;

public class TimePage {

	public Date initializedTime;
	public Date prerenderedTime;

	public Class<?> doSubmit() {
		return null;
	}

	public Class<?> initialize() {
		initializedTime = new Date();
		return null;
	}

	public Class<?> prerender() {
		prerenderedTime = new Date();
		return null;
	}

}
