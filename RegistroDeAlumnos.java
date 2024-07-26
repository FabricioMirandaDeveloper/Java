import java.util.ArrayList;
import java.util.Scanner;

public class RegistroDeAlumnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();
        boolean salir = false;
        while (!salir) {
            System.out.println("""
                Elije una opcion:
                1) Registrar alumno
                2) Mostrar todos los alumnos
                3) Mostrar promedio de notas
                4) Buscar alumno por nombre
                6) Salir
                """);
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.println("Ingresa el nombre del nuevo alumno");
                    String nombre = sc.nextLine();
                    System.out.println("Ingresa la nota del nuevo alumno");
                    double nota = sc.nextInt();
                    nombres.add(nombre);
                    notas.add(nota);
                    System.out.println("Alumno registrado correctamente");
                }
                case 2 -> {
                    if(nombres.isEmpty()) {
                        System.out.println("No hay alumnos registrados");
                    }else {
                        System.out.println("Lista de alumnos");
                        for (int i = 0; i < nombres.size(); i++) {
                            System.out.println("Nombre: "+nombres.get(i)+", Nota: "+notas.get(i));
                        }
                    }
                }
                case 3 -> {
                    if (notas.isEmpty()) {
                        System.out.println("No hay notas registradas");
                    }else {
                        double sumatotal = 0;
                        for(double nota: notas ){
                            sumatotal += nota;
                        }
                        double promedio = sumatotal / notas.size();
                        System.out.println("El promedio de la clase es: "+promedio);
                    }
                }
                case 4 -> {
                    if(nombres.isEmpty()) {
                        System.out.println("No hay estudiantes registrados");
                    }else {
                        System.out.println("Ingresa el nombre del alumno a buscar");
                        String buscar = sc.nextLine();
                        boolean encontrado = false;
                        for (int i = 0; i < nombres.size(); i++) {
                            if(nombres.get(i).equalsIgnoreCase(buscar)) {
                                System.out.println("Alumno encontrado: Nombre: " + nombres.get(i) + ", Nota: " + notas.get(i));
                                encontrado = true;
                                break;
                            }
                        }
                        if(!encontrado) {
                            System.out.println("Alumno no encontrado");
                        }
                    }
                }
                case 6 -> {
                    salir = true;
                    System.out.println("Saliendo del programa...");
                }
                default -> System.out.println("Opción no válida, por favor elija una opción válida.");
            }
        }


    }
}
