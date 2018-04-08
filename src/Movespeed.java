import java.io.PrintWriter;

public class Movespeed {
	final static String file = "test.gcode";

	public static void main(String[] args) throws Exception {
		String output = "";
		output += Processes.test_proc_1(Machine.PRUSA_I3_MK3);

		// Create and write file
		PrintWriter writer = new PrintWriter(file, "UTF-8");
		writer.println(output);
		writer.close();
		System.out.println("wrote " + file);
	}
}
