
public class SpeedConverter {

	public static long toMilesPerHour(double kiloMeterPerHour) {

		if (kiloMeterPerHour < 0)
			return -1;
		return Math.round(kiloMeterPerHour / 1.609);// convert kilometers to miles

	}

	public static void PrintConversion(double kiloMeterPerHour) {
		if (kiloMeterPerHour < 0)
			System.out.println("Invalid value..");
		else {
			long milesPerHour = toMilesPerHour(kiloMeterPerHour);
			System.out.println(kiloMeterPerHour + " km/h " + milesPerHour + " mi/h ");
		}
	}
}
