
/**
 * Write a description of class Tarea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tarea
{
    // instance variables - replace the example below with your own
    private String tarea;
    private boolean tareaCompletada;
    /**
     * Constructor for objects of class Tarea
     */
    public Tarea(String nuevaTarea)
    {
        tarea = nuevaTarea;
        tareaCompletada = false;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String devolverTarea()
    {
        // put your code here
        return tarea;
    }
    
    public boolean tareaCompletada()
    {
        return tareaCompletada;
    }
}
