import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int size = 3;
		double xCoord;
		double yCoord;
		double zCoord;
		Point3d firstPoint = new Point3d();
		Point3d secondPoint = new Point3d();
		Point3d thirdPoint = new Point3d();

		for (int i = 1; i <= 3; i++) {
			Double[] array = new Double [size];
			System.out.print("Enter point #" + i + " coordinates with a space and press <Enter>: ");

			for (int j = 0; j < size; j++) {
				array[j] = num.nextDouble();
			}

			xCoord = array[0];
			yCoord = array[1];
			zCoord = array[2];

			switch (i) {
				case 1:
					firstPoint.setX(xCoord);
					firstPoint.setY(yCoord);
					firstPoint.setZ(zCoord);
					break;
				case 2:
					secondPoint.setX(xCoord);
					secondPoint.setY(yCoord);
					secondPoint.setZ(zCoord);
					break;
				case 3:
					thirdPoint.setX(xCoord);
					thirdPoint.setY(yCoord);
					thirdPoint.setZ(zCoord);
					break;
			}

		}

		if (firstPoint.equals(secondPoint) || secondPoint.equals(thirdPoint) || firstPoint.equals(thirdPoint)) {
			System.out.println("Two or more sides are equal. Enter the correct coordinates for the points.");
			System.exit(0);
		}

		double area = computeArea(firstPoint, secondPoint, thirdPoint);
		System.out.println("Area: " + ((double)Math.round(area * 100d) / 100d));

	}

	public static double computeArea(Point3d p1, Point3d p2, Point3d p3) {
		double a = p1.distanceTo(p2);
		double b = p2.distanceTo(p3);
		double c = p1.distanceTo(p3);

		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
}