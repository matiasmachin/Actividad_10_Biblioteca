package Biblioteca_1;

public class Inventario {

	public static void main(String[] args) {
		
		// Instanciar objetos
		Libro libro1= new Libro();
		libro1.setAutor("Miguel de Cervantes");
		libro1.setNombre("El Quijote de La Mancha");
		libro1.setEjemplares(2);
		libro1.setcantidadp(0);
		
		//System.out.println("Libro 1 :" + libro1.toString());
		
		System.out.println("Autor del Libro 1 :"+ libro1.getAutor()+ "\n" + ". Nombre del libro: " + libro1.getNombre()+ "\n"+" Nro. de Ejemplares: " + libro1.getEjemplares()+ "\n" + " Cantidad de Libros Prestado: " + libro1.getcantidadp()+"\n");
		
		//Instanciar objetos con parametros
		
		Libro libro2= new Libro("Arturo Perez Reverte", "El Capitán Alatriste", 1,1);
		
		System.out.println("Autor del Libro 2 :"+ libro2.getAutor()+ "\n" + ". Nombre del libro: " + libro2.getNombre()+ "\n"+" Nro. de Ejemplares: " + libro2.getEjemplares()+ "\n" + " Cantidad de Libros Prestado: " + libro2.getcantidadp()+"\n");
		
		
		//System.out.println("Libro 2 :" + libro2.toString());
		
		Libro libro3= new Libro("Mario Vargas Llosa", "La Ciudad y Los Perros", 0,0);
		
		//System.out.println("Libro 3 :" + libro3.toString());
		System.out.println("Autor del Libro 3 :"+ libro3.getAutor()+ "\n" + ". Nombre del libro: " + libro3.getNombre()+ "\n"+" Nro. de Ejemplares: " + libro3.getEjemplares()+ "\n" + " Cantidad de Libros Prestado: " + libro3.getcantidadp()+"\n\n\n");
		
		System.out.println(" SIMULACION DE PRESTAMOS DE LIBROS " + "\n\n\n");
		
		//Simulacion de Prestamos libro1
		if(libro1.prestamo())
		{
			System.out.println("Se ha prestado el Libro " + libro1.getNombre() + " Escrito por: "+ libro1.getAutor()+"\n");
			System.out.println("Cantidad Total de Libros Prestados: "+ libro1.getcantidadp()+ " del " + libro1.getNombre() +"\n \n" );
		}
		else
		{
			System.out.println("No quedan ejemplares del Libro: "+ libro1.getNombre()+"\n\n");
		}
		
		//Simulacion de Prestamos libro2
		if(libro2.prestamo())
		{
			System.out.println("Se ha prestado el Libro " + libro2.getNombre() + " Escrito por: "+ libro2.getAutor()+"\n");
			System.out.println("Cantidad Total de Libros Prestados: "+ libro2.getcantidadp()+ " del " + libro2.getNombre() +"\n \n" );		
		}
		else
		{
			System.out.println("No quedan ejemplares del Libro: "+ libro2.getNombre()+"\n\n");
		}
		
		//Simulacion de Prestamos libr3
				
		if(libro3.prestamo())
				{
					System.out.println("Se ha prestado el Libro " + libro3.getNombre() + " Escrito por: "+ libro3.getAutor()+"\n");
					System.out.println("Cantidad Total de Libros Prestados: "+ libro3.getcantidadp()+ " del " + libro3.getNombre() +"\n \n" );		
				}
		else
				{
					System.out.println("No quedan ejemplares del Libro: "+ libro3.getNombre()+"\n\n");
				}
		
		
		//simulacion de devoluciones
		
		System.out.println(" SIMULACION DE DEVOLUCION DE LIBROS " + "\n\n\n");

		//Devolucion de libro1
		
		if(libro1.devolucion()) {
			System.out.println("Se ha devuelto un ejemplar del libro: "+ libro1.getNombre() + " del autor: " + libro1.getAutor()+ "\n\n");
			System.out.println("Cantidad Total de Libros Disponibles: "+ (libro1.getEjemplares()-libro1.getcantidadp())+ "\n \n" );
		}
		else
		{
			System.out.println("No existen ejemplares del libro " + libro1.getNombre() + " prestados" +" \n\n");
		}
		
		//Devolucion de libro2
		
				if(libro2.devolucion()) {
					System.out.println("Se ha devuelto un ejemplar del libro: "+ libro2.getNombre() + " del autor: " + libro2.getAutor()+ "\n\n");
					System.out.println("Cantidad Total de Libros Disponibles: "+ (libro2.getEjemplares()-libro2.getcantidadp())+ "\n \n" );
				}
				else
				{
					System.out.println("No existen ejemplares del libro " + libro2.getNombre() + " prestados"+ " \n\n");
				}	
				//Devolucion de libro3
				
				if(libro3.devolucion()) {
					System.out.println("Se ha devuelto un ejemplar del libro: "+ libro3.getNombre() + " del autor: " + libro3.getAutor()+ "\n\n");
					System.out.println("Cantidad Total de Libros Disponibles: "+ (libro3.getEjemplares()-libro3.getcantidadp())+ "\n \n" );
				}
				else
				{
					System.out.println("No existen ejemplares del libro " + libro3.getNombre() + " prestados "+ "\n\n");
				}
	}

}
