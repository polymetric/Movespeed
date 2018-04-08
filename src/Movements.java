
public class Movements {
	public static String squares_cw(Machine machine, int divs, float speed, float accel) {
		String output = "";

		output += String.format("; squares - divs %s, speed %s, accel %s\n", divs, speed, accel);

		output += Gcodes.set_speed(speed);
		output += Gcodes.set_accel(accel);

		for (int i = 0; i < divs; i++) {
			int div = (int) Math.pow(2, i);
			output += square_cw(machine, div, speed, accel);
		}

		output += "\n";

		return output;
	}

	public static String square_cw(Machine machine, int div, float speed, float accel) {
		String output = "";

		output += String.format("; square - clockwise, div %s\n", div);

		output += Gcodes.move_xy(0,						0);
		output += Gcodes.move_xy(0,						machine.Y_LEN / div);
		output += Gcodes.move_xy(machine.X_LEN / div,	machine.Y_LEN / div);
		output += Gcodes.move_xy(machine.X_LEN / div,	0);
		output += Gcodes.move_xy(0,						0);

		return output;
	}
}
