package ProyectoDos;

public class Vector {

	private double x;
	private double y;
	double x1;
	double y1;

	public Vector(double iX, double iY, double fX, double fY) {
		x = iX;
		y = iY;
		x1 = fX;
		y1 = fY;
	}

	public double getModuloV() {
		return Math.sqrt(((x1-x)*(x1-x))+((y1-y)*(y1-y)));
	}

	private double getAngulo() {
		return (180*Math.acos((x1-x)/(getModuloV())))/Math.PI;
	}

	public double getAnguloDirec() {
		double resp = 0;
		if (y1-y>=0) {
			resp = getAngulo();
		}else {
			resp = 360 - getAngulo();
		}
		return resp-getAngulo()%0.0000001;
	}
}
