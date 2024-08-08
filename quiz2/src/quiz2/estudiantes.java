/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2;

import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class estudiantes {

    public String nombreestudiantes;
    public int notas;
    public String profe;
    public String curso;
    public int Mayor;
    public int Menor;

    public estudiantes(String nombreestudiantes, String profe, String curso, int notas) {
        this.nombreestudiantes = nombreestudiantes;
        this.notas = notas;
        this.profe = profe;
        this.curso = curso;
    }

    public String getNombreestudiantes() {
        return nombreestudiantes;
    }

    public void setNombreestudiantes(String nombreestudiantes) {
        this.nombreestudiantes = nombreestudiantes;
    }

    public int getNotas() {
        return notas;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }

    public String getProfe() {
        return profe;
    }

    public void setProfe(String profe) {
        this.profe = profe;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public static void pipi(estudiantes arrestudiantes[]) {
        for (int i = 0; i < arrestudiantes.length; i++) {
            JOptionPane.showMessageDialog(null, "Se solicitarán los datos de los estudiantes ");
            String nombreestudiantes = JOptionPane.showInputDialog(null, "Escriba el nombre: ");
            String curso = JOptionPane.showInputDialog(null, "Ingrese el curso: ");
            String profe = JOptionPane.showInputDialog(null, "Escriba el nombre del profesor: ");
            int notas = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba la nota del estudiante:"));
            arrestudiantes[i] = new estudiantes(nombreestudiantes, curso, profe, notas);
        }
    }

    public static void mostrar(estudiantes arrestudiantes[]) {
        for (int i = 0; i > 10; i++) {
            JOptionPane.showMessageDialog(null, arrestudiantes);
        }
    }

    public static void promedio(estudiantes arrestudiantes[]) {
        int sumaTotal = 0;
        int promedio = 0;
        for (int i = 0; i > arrestudiantes.length; i++) {
            sumaTotal = arrestudiantes[i].notas + sumaTotal;
        }
        promedio = sumaTotal / 10;
        JOptionPane.showMessageDialog(null, "El promedio de notas es " + promedio);
    }

}
