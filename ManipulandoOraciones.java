import java.util.Arrays;
import java.util.Scanner;

public class ManipulandoOraciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String oracion = "";
        boolean salir = false;
        while (!salir) {
            System.out.println("""
                Elije una opcion
                1) Crear oración o Borrar oración
                2) Cantidad de caracteres de la oración
                3) Cantidad de palabras de la oración
                4) Mostrar palabras ordenadas alfabéticamente
                5) Ingresar un número y devolver la palabra correspondiente
                6) Buscar palabra dentro de la oración
                7)
                8)
                9) Salir
                """);
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1 -> {
                    if (oracion.isEmpty()) {
                        boolean oracionValida = false;
                        while (!oracionValida) {
                            System.out.println("Crear oración:");
                            oracion = sc.nextLine();
                            if(!oracion.isEmpty()) {
                                oracionValida = true;
                                System.out.println("Oracion creada: "+oracion);
                            }else {
                                System.out.println("La oración no puede estar vacía. Inténtalo de nuevo.");
                            }
                        }
                    } else {
                        System.out.println("Oracion actual: "+oracion);
                        System.out.println("¿Deseas borrar la oraión (s/n)");
                        String respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("s")) {
                            oracion = "";
                            System.out.println("Oración borrada.");
                        } else {
                            System.out.println("La oración no fue borrada.");
                        }
                    }
                }
                case 2 -> {
                    if(oracion.isEmpty()) {
                        System.out.println("No hay ninguna oración creada.");
                    }else {
                        System.out.println("La oracion: "+oracion+" tiene "+oracion.length()+" caracteres");
                    }
                }
                case 3 -> {
                    if(oracion.isEmpty()) {
                        System.out.println("No hay ninguna oración creada.");
                    }else {
                        String[] palabras = oracion.split("\\s+");
                        System.out.println("La oracion "+oracion+" tiene "+palabras.length+" palabras.");
                    }
                }
                case 4 -> {
                    if(oracion.isEmpty()) {
                        System.out.println("No hay ninguna oración creada.");
                    }else {
                        String[] palabras = oracion.split("\\s+");
                        Arrays.sort(palabras);
                        System.out.println("Palabras ordenadas: " + Arrays.toString(palabras));
                    }
                }
                case 5 -> {
                    if (oracion.isEmpty()) {
                        System.out.println("No hay ninguna oración creada.");
                    } else {
                        String[] palabras = oracion.split("\\s+");
                        System.out.println("Ingresa un número (1 a " + palabras.length + "):");
                        int numero = sc.nextInt();
                        sc.nextLine(); // Limpiar el buffer del scanner
                        if (numero >= 1 && numero <= palabras.length) {
                            System.out.println("La palabra en la posición " + numero + " es: " + palabras[numero - 1]);
                        } else {
                            System.out.println("Número inválido. Intente nuevamente.");
                        }
                    }
                }
                case 6 -> {
                    if (oracion.isEmpty()) {
                        System.out.println("No hay ninguna oración creada.");
                    } else {
                        System.out.println("Ingresa la palabra que deseas buscar:");
                        String palabraBuscar = sc.nextLine();
                        String[] palabras = oracion.split("\\s+");
                        boolean encontrada = false;
                        for (int i = 0; i < palabras.length; i++) {
                            if (palabras[i].equalsIgnoreCase(palabraBuscar)) {
                                System.out.println("La palabra \"" + palabraBuscar + "\" fue encontrada en la posición " + (i + 1) + ".");
                                encontrada = true;
                                break;
                            }
                        }
                        if (!encontrada) {
                            System.out.println("La palabra "+ palabraBuscar + " no fue encontrada en la oración.");
                        }
                    }
                }
                case 9 -> {
                    salir = true;
                    System.out.println("Saliendo del programa...");
                }
                default -> System.out.println("Opción no válida, por favor elija una opción válida.");
            }
        }
    }
}
