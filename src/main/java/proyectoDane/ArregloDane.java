package proyectoDane;
import java.util.Scanner;
/**
 *
 * @author SEvguzman
 */

public class ArregloDane {

    private departamentos Departamentos[];
    private int tamanio;

    public int getTamanio() {
        return tamanio;
    }

    public static int ingresoInt() {
        int entero = 0;
        boolean bandera = true;

        do {
            Scanner entradaDepartamentos = new Scanner(System.in);
            try {
                entero = entradaDepartamentos.nextInt();
                bandera = false;

            } catch (java.util.InputMismatchException ex) {
                System.out.println("Error");
            }

        } while (bandera);

        return entero;
    }

    public ArregloDane() {

        System.out.println("Ingrese el numero de departamentos: ");
        tamanio = ArregloDane.ingresoInt();

        if (tamanio < 0) {
            System.out.println("Error");
        } else if (tamanio == 1) {

            departamentos Departementos[] = new departamentos[tamanio];
           
            System.out.println("ingrese el departamento: ");
            Scanner entrada = new Scanner(System.in);
            String departamento = entrada.nextLine();
            
            System.out.println("ingrese el municipio");
            int municipios = ArregloDane.ingresoInt();
            
            System.out.println("ingrese los metros cuadrados de tierra: ");
            int tierras = ArregloDane.ingresoInt();
            
            System.out.println("ingrese el numero de habitantes: ");
            int habitantes = ArregloDane.ingresoInt();
            
            System.out.println("ingrese la temperatura: ");
            int temperatura = ArregloDane.ingresoInt();
            
            System.out.println("Ingrese indicativo telefonico");
            int indicativoTel = ArregloDane.ingresoInt();
            

            departamentos d = new departamentos(departamento, municipios, tierras, habitantes, temperatura, indicativoTel);

            Departamentos[0] = d;
            this.Departamentos = Departamentos;

        } else {
            departamentos Departamentos[] = new departamentos[tamanio];

            for (int i = 0; i < Departamentos.length; i++) {
                System.out.println("Datos departamento " + (i + 1));

                System.out.println("ingrese el departamento: ");
                Scanner entrada = new Scanner(System.in);
                String departamento = entrada.nextLine();
                
                System.out.println("ingrese el municipio: ");
                int municipios = ArregloDane.ingresoInt();
                
                System.out.println("ingrese los metros cuadrados de tierra: ");
                int tierras = ArregloDane.ingresoInt();

                System.out.println("ingrese el numero de habitantes: ");
                int habitantes = ArregloDane.ingresoInt();

                System.out.println("ingrese la temperatura: ");
                int temperatura = ArregloDane.ingresoInt();

                System.out.println("Ingrese indicativo telefonico");
                int indicativoTel = ArregloDane.ingresoInt();

                departamentos d = new departamentos(departamento, municipios, tierras, habitantes, temperatura, indicativoTel);

            Departamentos[i] = d;
            this.Departamentos = Departamentos;

            }

        }
    }
    
    public String consultaDepartamentos(int indice) {
        String departamento = Departamentos[indice].getDepartamento();
        return departamento;
    }
    
    public int consultaMunicipios(int indice) {
        int municipios = Departamentos[indice].getMunicipios();
        return municipios;
    }
    

    public int consultaTierras(int indice) {
        int tierras = Departamentos[indice].getTierras();
        return tierras;
    }

    public int consultaHabitantes(int indice) {
        int habitantes = Departamentos[indice].getHabitantes();
        return habitantes;
    }

    public int consultaTemperatura(int indice) {
        int temperatura = Departamentos[indice].getTemperatura();
        return temperatura;
    }

    public int consultaIndicativoTel(int indice) {
        int indicativoTel = Departamentos[indice].getIndicativoTel();
        return indicativoTel;
    }

    public departamentos consultaAtributos(int indice) {
        
        String departamento = Departamentos[indice].getDepartamento();
        int municipios = Departamentos[indice].getMunicipios();
        int tierras = Departamentos[indice].getTierras();
        int habitantes = Departamentos[indice].getHabitantes();
        int temperatura = Departamentos[indice].getTemperatura();
        int indicativoTel = Departamentos[indice].getIndicativoTel();
        return new departamentos(departamento, municipios, tierras, habitantes, temperatura, indicativoTel);
    }

    public String mayorTierras() {
        int mayor = -2147483647;
        int indice = 0;
        for (int i = 0; i < Departamentos.length; i++) {
            int tierras = Departamentos[i].getTierras();
            if (tierras > mayor) {
                mayor = tierras;
                indice = i;
            }

        }
        String Mayor = "El departamrnto con mayor numero de tierras es: " + Departamentos[indice].getDepartamento();
        return Mayor;
    }

    public String menorTierras() {
        int menor = 2147483647;
        int indice = 0;
        for (int i = 0; i < Departamentos.length; i++) {
            int tierras = Departamentos[i].getTierras();
            if (tierras < menor) {
                menor = tierras;
                indice = i;
            }

        }
        String Menor = "El departamento con menor temperatura es: " + Departamentos[indice].getDepartamento();
        return Menor;
    }
    
    public String menorTemperatura() {
        int menor = 2147483647;
        int indice = 0;
        for (int i = 0; i < Departamentos.length; i++) {
            int temperatura = Departamentos[i].getTemperatura();
            if (temperatura < menor) {
                menor = temperatura;
                indice = i;
            }

        }
        String Menor = "El departamento con menor temperatura es: " + Departamentos[indice].getDepartamento();
        return Menor;
    }
    
    
    public String mayorNumeroHabitantes() {
        int mayor = -2147483647;
        int indice = 0;
        for (int i = 0; i < Departamentos.length; i++) {
            int habitantes = Departamentos[i].getHabitantes();
            if (habitantes > mayor) {
                mayor = habitantes;
                indice = i;
            }

        }
        String Mayor = "El departamento con mayor numero de habitantes es: " + Departamentos[indice].getDepartamento();
        return Mayor;
    }

}
