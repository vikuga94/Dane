package proyectoDane;
/**
 *
 * @author SEvguzman
 */
public class main {
    public static void main(String[] args) {
        
        ArregloDane lista = new ArregloDane();

        for (int i = 0; i < lista.getTamanio(); i++) {

            System.out.println("Departamentos " + (i + 1));
            System.out.println("\ndepartamento: " + lista.consultaDepartamentos(i));
            System.out.println("Numero de municipios: " + lista.consultaMunicipios(i));
            System.out.println("Tierras K2: " + lista.consultaTierras(i));
            System.out.println("Numero de habitantes: " + lista.consultaHabitantes(i));
            System.out.println("Temperatura: " + lista.consultaTemperatura(i));
            System.out.println("Indicativo Tlefonico: " + lista.consultaIndicativoTel(i));
        }

        System.out.println("");
        System.out.println(lista.mayorTierras());
        System.out.println("");
        System.out.println(lista.menorTierras());
        System.out.println("");
        System.out.println(lista.menorTemperatura());
        System.out.println("");
        System.out.println(lista.mayorNumeroHabitantes());
        
    }
}

