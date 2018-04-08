
public class Gcodes {
	public static String set_speed(float speed) {
		return String.format("G1 F%s\n", speed * 60);
	}

	public static String set_accel(float accel) {
		return String.format("M204 T%s\n", accel);
	}

	public static String move_xy(float x, float y) {
		return String.format("G1 X%s Y%s\n", x, y);
	}

	public static String move_z(float z) {
		return String.format("G1 Z%s\n", z);
	}
	
	public static String move_arc_ccw(float i, float j) {
		return String.format("G3 I%s J%s\n", i, j);
	}
	
	public static String move_arc_cw(float i, float j) {
		return String.format("G2 I%s J%s\n", i, j);
	}

	public static String home() {
		return "G28 X Y Z\n";
	}
}
