
public class SpeedTest {
	
	final static String file = "test.gcode";
	
	public static void main(String[] args) {
		String output = "";
		output += Processes.test_proc_1(Machine.PRUSA_I3_MK3);
		System.out.println(output);
	}
}
