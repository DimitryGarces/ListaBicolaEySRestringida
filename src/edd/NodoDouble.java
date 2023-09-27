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
public class NodoDouble
{
    private int num;
    private NodoDouble sig;
    private NodoDouble ant;

    /**
     * @return the num
     */
    public int getNum()
    {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num)
    {
        this.num = num;
    }

    /**
     * @return the sig
     */
    public NodoDouble getSig()
    {
        return sig;
    }

    /**
     * @param sig the sig to set
     */
    public void setSig(NodoDouble sig)
    {
        this.sig = sig;
    }

    /**
     * @return the ant
     */
    public NodoDouble getAnt()
    {
        return ant;
    }

    /**
     * @param ant the ant to set
     */
    public void setAnt(NodoDouble ant)
    {
        this.ant = ant;
    }
}
