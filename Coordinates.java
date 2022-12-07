import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Coordinates
{

	private String name;
	private double latitude;
	private double longitude;

	public Coordinates(String name, double latitude, double longitude)
	{
		Random rand = new Random();

		String Illinois;
		double min_lng = -91.512;
		double max_lng = -87.0213;
		double min_lat = 36.9894;
		double max_lat = 42.5116;
		double loCo = min_lng + (max_lng - min_lng) * rand.nextDouble();
		double laCo = min_lat + (max_lat - min_lat) * rand.nextDouble();

		this.name = name;
		this.latitude = laCo;
		this.longitude = loCo;

	}

	public double distanceTo(Coordinates that)
	{
		double STATUTE_MILES_PER_NAUTICAL_MILE = 1.15077945;
		double lat1 = Math.toRadians(this.latitude);
		double lon1 = Math.toRadians(this.longitude);
		double lat2 = Math.toRadians(that.latitude);
		double lon2 = Math.toRadians(that.longitude);

		double angle = Math
				.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));

		double nauticalMiles = 60 * Math.toDegrees(angle);
		double statuteMiles = STATUTE_MILES_PER_NAUTICAL_MILE * nauticalMiles;
		return statuteMiles;

	}

	public String toString()
	{
		return name + " (" + latitude + ", " + longitude + ")";
	}

	public static void main(String[] args)
	{
		for (int i = 0; i < 5; i++)
		{
			Coordinates Coor1 = new Coordinates("Illinois Point One", -91.512, 36.99894);
			Coordinates Coor2 = new Coordinates("Illinois Point Two", -87.0213, 42.5116);
			double distance = Coor1.distanceTo(Coor2);
			System.out.printf("%f miles from ", distance);
			System.out.println(Coor1 + (new SimpleDateFormat(" HH:mm:ss").format(new Date()) + " to " + Coor2
					+ (new SimpleDateFormat(" HH:mm:ss").format(new Date()))));
		}
	}

}
