package ar.edu.ort.tp1.final2.clases;

public class BuzoAdvancedOpenWater extends Buzo {

	private static final int PROFUNDIDAD_MAXIMA_PERMITIDA = 30;

	public BuzoAdvancedOpenWater(String nombre, String nacionalidad, int edad) {
		super(nombre, nacionalidad, edad);
	}

	@Override
	public boolean habilitadoBuceoProfundo() {
		return false;
	}

	@Override
	public boolean habilitadoBuceoMedio() {
		return true;
	}

	@Override
	public boolean habilitado(int metros) {
		return metros <= PROFUNDIDAD_MAXIMA_PERMITIDA;
	}
}
