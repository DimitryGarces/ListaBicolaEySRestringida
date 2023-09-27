/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd;

/**
 *
 * @author HPPERSONAL
 */
public class ListaDoubleSR
{

    private NodoDouble end = null;
    private NodoDouble front = null;

    public void insertFrist(NodoDouble nodo)
    {
        if (end == null || front == null)
        {
            front = end = nodo;
        } else
        {
            nodo.setAnt(front);
            front.setSig(nodo);
            front = nodo;
        }
    }

    public NodoDouble deleteFirst()
    {
        NodoDouble aux = front;
        if (front == end)
        {
            front = end = null;
            return aux;
        } else
        {
            front.getAnt().setSig(null);
            front = front.getAnt();
            return aux;
        }
    }
    public NodoDouble deleteLast()
    {
        NodoDouble aux = end;
        if (front == end)
        {
            front = end = null;
            return aux;
        } else
        {
            end.getSig().setAnt(null);
            end = end.getSig();
            return aux;
        }
    }

    public void show()
    {
        NodoDouble aux = end;
        int cont=1;
        while (aux != null)
        {
            System.out.println("Pos ["+cont+"] "+aux.getNum());
            cont++;
            aux = aux.getSig();
        }
    }

    public boolean empty()
    {
        return end == null;
    }

    public NodoDouble getEnd()
    {
        return end;
    }

    /**
     * @param end the end to set
     */
    public void setEnd(NodoDouble end)
    {
        this.end = end;
    }

    /**
     * @return the front
     */
    public NodoDouble getFront()
    {
        return front;
    }

    /**
     * @param front the front to set
     */
    public void setFront(NodoDouble front)
    {
        this.front = front;
    }

}
