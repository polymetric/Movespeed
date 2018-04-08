import java.io.PrintWriter;

public class Movespeed {
	public static void main(String[] args) throws Exception {
		writeFile("test_circles_i3.gcode", Processes.test_circles(Machine.PRUSA_I3_MK3));
		writeFile("test_squares_crosses_i3.gcode", Processes.test_squares_crosses(Machine.PRUSA_I3_MK3));
	}
	
	public static void writeFile(String file, String contents) throws Exception {
		PrintWriter writer = new PrintWriter(file, "UTF-8");
		writer.println(contents);
		writer.close();
		System.out.println("wrote " + file);
	}
}
