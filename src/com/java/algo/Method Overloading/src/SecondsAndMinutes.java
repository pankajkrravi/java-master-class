
public class SecondsAndMinutes {
	public static void main(String[] args) {

		getDurationString(65, 45);
		// System.out.println(3945L);
	}

	public static String getDurationString(long minute, long seconds) {
		if ((minute < 0) || (seconds < 0) || (seconds > 59)) {
			return "Invalid input";
		}
		long hours = minute / 60;
		long remainingMinutes = minute % 60;
		return hours + " h " + remainingMinutes + " m " + seconds + " s";
	}

	public static String getDurationString(long seconds) {

		if (seconds < 0)
			return "Invalid input";
		long minutes = seconds / 60;
		long remainingSeconds = seconds % 60;
		return getDurationString(minutes, seconds);
	}

}
