package proyectoDane;

package com.mycompany.actividadpersonas2;
/**
 *
 * @author SEvguzman
 */
public class departamentos {

    private String departamento;
    private int municipios;
    private int tierras;
    private int habitantes;
    private int temperatura;
    private int indicativoTel;

    public departamentos(String departamento, int municipios, int tierras, int habitantes, int temperatura, int indicativoTel) {
        this.departamento = departamento;
        this.municipios = municipios;
        this.tierras = tierras;
        this.habitantes = habitantes;
        this.temperatura = temperatura;
        this.indicativoTel = indicativoTel;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getMunicipios() {
        return municipios;
    }

    public void setMunicipios(int municipios) {
        this.municipios = municipios;
    }

    public int getTierras() {
        return tierras;
    }

    public void setTierras(int tierras) {
        this.tierras = tierras;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getIndicativoTel() {
        return indicativoTel;
    }

    public void setIndicativoTel(int indicativoTel) {
        this.indicativoTel = indicativoTel;
    }

    
    
    @Override
    public String toString(){
        String texto = "Departamento: " + departamento + "\n"
            + "Numero de municipios: " + municipios + "\n"
            + "Tierras K2: " + tierras + "\n"
            + "Numero de habitantes: " + habitantes + "\n"
            + "Temperatura: " +temperatura + "\n"
            + "Indicativo Telefonico: " + indicativoTel ;
        return texto;
    }
}



