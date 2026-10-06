public class ProyectoSoftware {
    /*
    10 — Proyecto de Despliegue de Software

Contexto

En la consultoría IT, los proyectos de software atraviesan diferentes fases
(análisis, desarrollo, pruebas, despliegue) que deben ser actualizadas en los sistemas de gestión.

Consigna

Modelar una clase en Java que represente un proyecto corporativo de software y permita avanzar su ciclo de vida.

Desarrollo requerido

Definir la clase ProyectoSoftware con atributos nombreProyecto (String),
clienteEmpresa (String) y faseActual (int, donde 1=Análisis, 2=Desarrollo, 3=Despliegue).

Incorporar un constructor que inicie siempre la faseActual en 1.

Implementar un método avanzarFase() que incremente la fase en 1 (hasta un máximo de 3) y
un método obtenerEstado() que devuelva el nombre de la fase en formato texto.

En el método main, instanciar un proyecto, simular el avance completo del ciclo de vida y mostrar la transición de fases por consola.
     */

    String nombreProyecto;
    String clienteEmpresa;
    int faseActual;

    public ProyectoSoftware (String nombreProyecto, String clienteEmpresa) {

        this.nombreProyecto = nombreProyecto;
        this.clienteEmpresa = clienteEmpresa;

        this.faseActual = 1;
    }

    void avanzarFase () {

        if (this.faseActual >= 3) {
            System.out.println("NO HAY AVANCE DISPONIBLE. EL PROYECTO YA ESTA EN DESPLIEGUE.");
        }
        else {
            this.faseActual += 1;
        }
    }

    void mostrarEstado () {

        System.out.println("PROYECTO: " + nombreProyecto);
        System.out.println("CLIENTE / EMPRESA: " + clienteEmpresa);

        if (this.faseActual == 1) {
            System.out.println("PROYECTO: EN ANALISIS.");
        } else if (this.faseActual == 2) {
            System.out.println("PROYECTO: EN DESARROLLO.");
        }
        else {
            System.out.println("PROYECTO: EN DESPLIEGUE.");
        }
    }
}
