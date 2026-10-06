public class Main {
    static void main(String[] args) {

        /*
        En el método main, instanciar un proyecto, simular el avance completo del ciclo de vida y mostrar la transición de fases por consola.
                */

        ProyectoSoftware proyecto1 = new ProyectoSoftware(
                "SISTEMA DE COBROS",
                "ATOMO SA"
        );

        proyecto1.mostrarEstado();
        System.out.println(" ");
        proyecto1.avanzarFase();
        System.out.println(" ");
        proyecto1.mostrarEstado();
        System.out.println(" ");
        proyecto1.avanzarFase();
        System.out.println(" ");
        proyecto1.mostrarEstado();
        System.out.println(" ");

        
        proyecto1.avanzarFase();
    }
}
