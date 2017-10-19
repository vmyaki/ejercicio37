import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Creamos 3 objetos Animal
		Animal panda1 = new Animal();
		Animal panda2 = new Animal();
		Animal panda3 = new Animal();
		Animal panda4 = new Animal();
		Animal panda5 = new Animal();
		
		//Le damos los valores para poder usarlos
		panda1.setNombre("poo");
		panda1.setPeso(200);
		panda2.setNombre("yaki");
		panda2.setPeso(400);
		panda3.setNombre("aroa");
		panda3.setPeso(300);
		panda4.setNombre("laki");
		panda4.setPeso(100);
		panda5.setNombre("yako");
		panda5.setPeso(250);
		
		//Creamo la lista y añadimos los animales al array
		ArrayList <Animal> listaPandas = new ArrayList <Animal>();
		
		listaPandas.add(panda1);
		listaPandas.add(panda2);
		listaPandas.add(panda3);
		listaPandas.add(panda4);
		listaPandas.add(panda5);
		
		//Mostramos la listaPandas en orden inverso
		for(int i=listaPandas.size()-1; i>=0; i--)
		{
			System.out.println(listaPandas.get(i));
			//Primero obtengo panda1.comer();
			System.out.println(listaPandas.get(i).comer());
		}

	
	}

	

}
