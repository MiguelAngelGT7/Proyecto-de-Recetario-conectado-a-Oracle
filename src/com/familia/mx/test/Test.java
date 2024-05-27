package com.familia.mx.test;

import com.familia.mx.entity.Recetas;
import com.familia.mx.bo.RecetaBO;
import com.familia.mx.dao.RecetarioDAO;

/**
 *
 * @author luis_
 */
public class Test {
    RecetaBO recetariobo = new RecetaBO();
    Recetas recetario = new Recetas();
    String mensaje = "";
    
    public void insertar(){
        recetario.setNombre_receta("pay de queso");
        recetario.setDescripcion_receta("Un rico pay de queso especial para cualquier ocacion");
        recetario.setTiempo_en_cocina("1 día");
        recetario.setTiempo_coccion("2 horas");
        recetario.setUtencilios("Charola, 3 espatulas, licuadora, horno");
        recetario.setProcedimiento_recetas("1.-Se muele la galleta."
                + "2.-Se bate la masa"
                + "3.-Se licua las leches "
                + "4.-Se pone en el molde todo"
                + "5.-Se hornea y listo. ");
        recetario.setNotas("Tienes que revisar la concistencia de ");
        mensaje = recetariobo.agregarReceta(recetario);
        System.out.println(mensaje);
    }
    
    public void modificar(){
        recetario.setId_recetario(1);
        recetario.setNombre_receta("pay de queso");
        recetario.setDescripcion_receta("Un rico pay de queso especial para cualquier ocacion");
        recetario.setTiempo_en_cocina("1 día");
        recetario.setTiempo_coccion("2 horas");
        recetario.setUtencilios("Charola, 3 espatulas, licuadora, horno");
        recetario.setProcedimiento_recetas("1.-Se muele la galleta."
                + "2.-Se bate la masa"
                + "3.-Se licua las leches "
                + "4.-Se pone en el molde todo"
                + "5.-Se hornea y listo. ");
        recetario.setNotas("Tienes que revisar la concistencia de ");
        mensaje = recetariobo.modificarReceta(recetario);
        System.out.println(mensaje);
    }
    
    public void eliminar(){
        mensaje = recetariobo.eliminarReceta(1);
        System.out.println(mensaje);
    }
    
    public static void main(String[] args){
        Test test = new Test();
       // test.insertar();
       //test.modificar();
       test.eliminar();
    }
}
