package veterinaria;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) throws SQLException, IOException{
        Scanner entrada = new Scanner(System.in);
        int opcionMenu;
        do{
            System.out.println("1 - Guardar un perro");
            System.out.println("2 - Listar perros");
            System.out.println("3 - Listar perros ordenados por raza");
            System.out.println("4 - Salir");
            System.out.print("Ingrese la opcion deseada: ");
            opcionMenu = entrada.nextInt();
            switch(opcionMenu){
                case 1:
                    pedirDatos();
                    break;
                case 2:
                    mostrarPerros();
                    break;
                case 3:
                    // Completar para listar los perros ordenados por raza
                    break;
                default:
                    break;
            }
        }while(opcionMenu != 4);
    }
    
    private static void pedirDatos() throws SQLException{
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de chip");
        int unChip = entrada.nextInt();
        System.out.println("Ingrese el nombre");
        String unNombre = entrada.next();
        System.out.println("Ingrese la raza");
        String unaRaza = entrada.next();
        Perro unPerro = new Perro(unChip, unNombre, unaRaza);
        Conexion unaConexion = new Conexion("./miBaseDeDatos.db");
        unaConexion.guardarPerro(unPerro);
    }
    
    private static void mostrarPerros() throws SQLException{
        Conexion unaConexion = new Conexion("./miBaseDeDatos.db");
        ArrayList<Perro> perros = unaConexion.obtenerPerros();
        Iterator<Perro> iteradorPerros = perros.iterator();
        while(iteradorPerros.hasNext()){
            Perro unPerro = iteradorPerros.next();
            System.out.println(unPerro);
        }
    }
}
