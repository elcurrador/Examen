public class Casa extends InmuebleVivienda {
protected int númeroPisos; /* Atributo que identica el número de 
pisos que tiene una casa */

public Casa(int identificadorInmobiliario, int área, String dirección, 
int númeroHabitaciones, int númeroBaños, int númeroPisos) {
// Invoca al constructor de la clase padre
super(identificadorInmobiliario, área, dirección, 
númeroHabitaciones, númeroBaños);
this.númeroPisos = númeroPisos;
}

}