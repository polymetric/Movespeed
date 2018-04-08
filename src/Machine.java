
public class Machine {
	static enum Corner {
		BACK_LEFT, BACK_RIGHT, FRONT_LEFT, FRONT_RIGHT
	}
	
	// Machine Parameters
	public final float X_LEN;
	public final float Y_LEN;
	public final float Z_LEN;
	public final float MAX_SPEED;
	public final float MAX_ACCEL;
	public final float DEFAULT_ACCEL;
	public final Corner HOME_CORNER;
	
	public Machine(float x_len, float y_len, float z_len, float max_speed, float max_accel, float default_accel, Corner home_corner) {
		X_LEN = x_len;
		Y_LEN = y_len;
		Z_LEN = z_len;
		MAX_SPEED = max_speed;
		MAX_ACCEL = max_accel;
		DEFAULT_ACCEL = default_accel;
		HOME_CORNER = home_corner;
	}
	
	// Machine Definitions
	public static final Machine PRUSA_I3_MK3 = new Machine(250, 210, 210, 200, 2000, 1500, Corner.FRONT_LEFT);
}
