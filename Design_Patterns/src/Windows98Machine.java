
public class Windows98Machine {
	// private final StandardKeyboard keyboard;
	private final Keyboard keyboard;
	private final Monitor monitor;

	/*
	 * public Windows98Machine() { monitor = new Monitor(); keyboard = new
	 * StandardKeyboard(); }
	 */
	/*
	 * public Windows98Machine(StandardKeyboard keyboard,Monitor monitor) {
	 * this.keyboard=keyboard; this.monitor=monitor; }
	 */

	public Windows98Machine(Keyboard keyboard, Monitor monitor) {
		this.keyboard = keyboard;
		this.monitor = monitor;
	}
	public void create98Machine() {
		System.out.println("windows 98 machine created");
		keyboard.pressKey();
	}
}
