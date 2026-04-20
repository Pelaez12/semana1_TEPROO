package arreglo;

import java.lang.reflect.Array;
import java.util.ArrayList;

import clase.Empleado;

public class ArregloEmpleado {
	private ArrayList<Empleado>emple;
	public ArregloEmpleado() {
		emple=new ArrayList<Empleado>();
		
	}
	public void Adicionar (Empleado x) {
		emple.add(x);
	}
	public int Tamaño() {
		return emple.size();
	
	}
	public Empleado Obtener (int x) {
		return emple.get(x);
	}
	public Empleado Buscar(int dni) {
		for (int i = 0; i < Tamaño(); i++) {
			if(Obtener(i).getDni()==dni)return Obtener(i);
		}
		return null;
}
	public void Eliminar(Empleado x) {
		emple.remove(x);
}
}