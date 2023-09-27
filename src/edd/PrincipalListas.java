/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd;

import java.util.Scanner;

/**
 *
 * @author DimitryGarces
 */
public class PrincipalListas
{

    public static void main(String[] args)
    {
        Scanner r = new Scanner(System.in);
        int opc = 0, mnu = 0;
        ListaDoubleER obList = new ListaDoubleER();
        ListaDoubleSR obList2 = new ListaDoubleSR();
        do
        {
            System.out.println("1.- List double with restricted entry");
            System.out.println("2.- List with restricted exit");
            System.out.println("3.- Exit");
            mnu = r.nextInt();
            switch (mnu)
            {
                case 1:
                    do
                    {
                        System.out.println("1.- Add first");
                        System.out.println("2.- Add last");
                        System.out.println("3.- Delete");
                        System.out.println("4.- Show");
                        System.out.println("5.- Exit");
                        opc = r.nextInt();
                        switch (opc)
                        {
                            case 1:
                                System.out.println("\n\n\n");
                                System.out.println("Insert num: ");
                                int num = r.nextInt();
                                NodoDouble obN = new NodoDouble();
                                obN.setNum(num);
                                obList.insertFrist(obN);
                                break;
                            case 2:
                                System.out.println("\n\n\n");
                                System.out.println("Insert num: ");
                                num = r.nextInt();
                                NodoDouble ob = new NodoDouble();
                                ob.setNum(num);
                                obList.insertLast(ob);
                                break;
                            case 3:
                                System.out.println("\n\n\n");
                                if (!obList.empty())
                                {
                                    NodoDouble delete = obList.deleteFirst();
                                    System.out.println("Date delete: " + delete);
                                } else
                                {
                                    System.out.println("List is clear");
                                }
                                break;
                            case 4:
                                System.out.println("\n\n\n");
                                if (!obList.empty())
                                {
                                    obList.show();
                                } else
                                {
                                    System.out.println("List is clear");
                                }
                                break;
                            case 5:
                                //exit
                                break;
                            default:
                                System.out.println("Error, try again.");
                        }
                    } while (opc != 5);
                    break;
                case 2:
                    do{
                        System.out.println("1.- Add first");
                        System.out.println("2.- Delete first");
                        System.out.println("3.- Delete last");
                        System.out.println("4.- Show");
                        System.out.println("5.- Exit");
                        opc = r.nextInt();
                        switch (opc)
                        {
                            case 1:
                                System.out.println("\n\n\n");
                                System.out.println("Insert num: ");
                                int num = r.nextInt();
                                NodoDouble obN = new NodoDouble();
                                obN.setNum(num);
                                obList2.insertFrist(obN);
                                break;
                            case 2:
                                System.out.println("\n\n\n");
                                if (!obList2.empty())
                                {
                                    NodoDouble delete = obList2.deleteFirst();
                                    System.out.println("Date delete: " + delete);
                                } else
                                {
                                    System.out.println("List is clear");
                                }
                                break;
                            case 3:
                                System.out.println("\n\n\n");
                                if (!obList2.empty())
                                {
                                    NodoDouble delete = obList2.deleteLast();
                                    System.out.println("Date delete: " + delete);
                                } else
                                {
                                    System.out.println("List is clear");
                                }
                                break;
                            case 4:
                                System.out.println("\n\n\n");
                                if (!obList2.empty())
                                {
                                    obList2.show();
                                } else
                                {
                                    System.out.println("List is clear");
                                }
                                break;
                            case 5:
                                //exit
                                break;
                            default:
                                System.out.println("Error, try again.");
                        }
                    }while(opc != 5);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Error, try again. ");
            }
        } while (mnu != 3);

    }

}
