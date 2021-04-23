package SpeedConverter.src;

public class MainRunnerC {
	public static void main(String[] args) {
		double milesPerHour = SpeedConverterC.toMilesPerHour(10.5);
		System.out.println("miles/hour= " + milesPerHour);
		SpeedConverterC.PrintConversion(10.5);
	}
}
