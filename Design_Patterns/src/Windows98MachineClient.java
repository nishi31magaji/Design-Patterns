
public class Windows98MachineClient {
public static void main(String[] args) {
	Windows98Machine stdkeyboardmachine = new Windows98Machine(new StandardKeyboard(), new Monitor());
	stdkeyboardmachine.create98Machine();
	
	Windows98Machine gamingkeyboardmachine = new Windows98Machine(new GamingKeyboard(), new Monitor());
	gamingkeyboardmachine.create98Machine();
}
}
