import java.util.ArrayList;
/**
 * Write a description of class Todoist here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Todoist
{
    // instance variables - replace the example below with your own
    private ArrayList<Tarea> tarea;

    /**
     * Constructor de la clase Todoist
     */
    public Todoist()
    {
        tarea = new ArrayList<Tarea>();
    }

    /**
     * añadimos nuevas tareas
     */
    public void añadirTarea(String nuevaTarea)
    {
        tarea.add(nuevaTarea);
    }
}
