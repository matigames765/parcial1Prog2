
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        /*Creamos istancias de atleta*/
        Athlete athlete1 = new Athlete(40683784,"Santiago",1.75,26,78);
        Athlete athlete2 = new Athlete(18357265,"Julian",1.80,52,83);
        Athlete athlete3 = new Athlete(3489567,"Giuliana",1.60,20,52);

        /*Creamos instancias de equipos nacionales*/
        NationalTeam nationalTeam1 = new NationalTeam("Azul y Blanco","Argentina");
        NationalTeam nationalTeam2 = new NationalTeam("Blanco","Irlanda");
        NationalTeam nationalTeam3 = new NationalTeam("Rojo","Gales");

        /*Creamos instancias de pruebas*/
        Test test1 = new Test(5234,"Test de Cooper");
        Test test2 = new Test(5009,"Sprint de 40 metros");
        Test test3 = new Test(4993,"Test de L-cono");

        /*Creamos instancias de instalaciones*/
        Facility facility1 = new Facility("Instalacion para deportes de equipo","Capital Mendoza","Malvinas Argentinas","Campo de futbol");
        Facility facility2 = new Facility("Instalacion para deportes de equipo","Belgrano Buenos Aires","Mas Monumental","Campo de futbol");
        Facility facility3 = new Facility("Instalacion para deportes de equipo","Barrio la Boca Ciudad de Buenos Aires","La Bombonera","Campo de futbol");

        /*Creamos instancias de sedes*/
        Campus campus1 = new Campus(1,"23/04/2024","9:00 AM");
        Campus campus2 = new Campus(2,"24/04/2024","11:00 AM");
        Campus campus3 = new Campus(1,"25/04/2024","3:00 PM");

        /*Añadiendo atletas al test 2*/


        test2.addAthletes(athlete1);
        test2.addAthletes(athlete2);
        test2.addAthletes(athlete3);

        /*Añadiendo pruebas al campus*/
        campus1.addTests(test1);
        campus1.addTests(test2);
        campus1.addTests(test3);

        /*Añadiendo la sede a la instalacion*/

        facility1.setCampus(campus1);

        /*Mostrar desde un objeto instalacion:
        Nombre del 3er atleta de la 2da prueba
        Codigo de la 2da prueba
         */

        System.out.println("El nombre del tercer atleta de la segunda prueba es " + facility1.getCampus().getTestArrayList().get(1).getAthletes().get(2).getName());
        System.out.println("El codigo de la segunda prueba es " + facility1.getCampus().getTestArrayList().get(1).getCode());

        System.out.println("------------------------------------------------------------------");

        /*
        Desde un objeto EquipoNacional obtener:
        Altura de todos los atletas.
        Peso extra de cada atleta.
         */


        nationalTeam1.addAthletesArrayList(athlete1);
        nationalTeam1.addAthletesArrayList(athlete2);
        nationalTeam1.addAthletesArrayList(athlete3);

        for (Athlete athlete : nationalTeam1.getAthleteArrayList()){
            System.out.println("Nombre: " + athlete.getName() + ", Altura: " + athlete.getHeight());
        }
        
        System.out.println("------------------------------------------------------------------");

        for (Athlete athlete : nationalTeam1.getAthleteArrayList()){
            if (athlete.thereIsEsxtraWeight(athlete.calculateIMC())){

                System.out.println("El peso extra del atleta de nombre " + athlete.getName() + " es " + (athlete.getWeight() - (Math.pow(athlete.getHeight(),2) * 24.9)));
            }else{
                System.out.println("El atleta de nombre " + athlete.getName() + " no tiene sobrepeso");
            }
        }











    }
}