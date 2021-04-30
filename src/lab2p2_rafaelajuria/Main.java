/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_rafaelajuria;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rajur
 */
public class Main {
    static ArrayList<ArrayList<Object>> Inventario = new ArrayList<>(11);//Crea Arreglo de 2 Dimensiones para mantener el Inventario.
    static Scanner read = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IniciarArreglo();
        Menu();
    }
    public static void Menu()
    {
        System.out.println("1.Agregar Computadoras");
        System.out.println("2.Ver Numeros de Serie de las Computadoras");
        System.out.println("3.Ver detalle de Computadoras");
        System.out.println("4.Actualizar Info de Computadoras");
        System.out.println("5.Borrar computadoras");
        int opcion =read.nextInt();
        switch(opcion)
        {
            case 0:
            {
                System.exit(0);
            }
            case 1:
            {
               AgregarInfoDeComputadora(); 
               Menu();
            }
            case 2:
            {
                ListarSN();
                Menu();
            }
            case 3:
            {
               InfoCompleta();
               Menu();
            }
            case 4:
            {
                ActualizarInfo();
                Menu();
            }
            case 5:
            {
              BorrarInfo();
              Menu();
            }
            case 6:
            {
                Informes();
                Menu();
            }
        }
    }
    public static void IniciarArreglo()
    {
       
        /*
        0=Modelo - String
        1=Num. Serie - String
        2=Capacidad Disco Duro(GB) - Integer
        3=Tamaño de Pantalla - Integer
        4=Teclado Numerico - Boolean
        5=Tipo de Procesador - String
        6=Tarjeta Grafica - String
        7=SistemaOperativo - String
        8=Tiempo en Fabrica - Integer
        9=Capacidad de Bateria - Integer
        10=Duracion de Bateria - Integer
        */
        for(int i=0; i<11; i++) 
        {
        Inventario.add(new ArrayList());
        }
        Inventario.get(0).add("M15");
        Inventario.get(1).add("5NFHN42");
        Inventario.get(2).add(1000);
        Inventario.get(3).add(15);
        Inventario.get(4).add(true);
        Inventario.get(5).add("Intel Core i7");
        Inventario.get(6).add("Gamer");
        Inventario.get(7).add("Windows");
        Inventario.get(8).add(8);
        Inventario.get(9).add(17000);
        Inventario.get(10).add(3);
    }
    public static void IngresarComputadoraAlArray(String Model,String SN, int HDD, int Size, Boolean NumPad,String Processor, String Graphics, String SO, int TimeFact, int mAH, int Duration)
    {
        Inventario.get(0).add(Model);
        Inventario.get(1).add(SN);
        Inventario.get(2).add(HDD);
        Inventario.get(3).add(Size);
        Inventario.get(4).add(NumPad);
        Inventario.get(5).add(Processor);
        Inventario.get(6).add(Graphics);
        Inventario.get(7).add(SO);
        Inventario.get(8).add(TimeFact);
        Inventario.get(9).add(mAH);
        Inventario.get(10).add(Duration);
        
    }
    public static void AgregarInfoDeComputadora()
    {
        System.out.print("Ingrese el modelo:");
        String Model = read.next();
        System.out.print("Ingrese el numero de serie:");
        String SN = read.next();
        System.out.print("Ingrese la capacidad del Disco Duro en GB:");
        int HDD = read.nextInt();
        System.out.print("Ingrese el tamaño de la pantalla:");
        int Size = read.nextInt();
        System.out.print("Tiene teclado numerico?(true/false):");
        Boolean NumPad = read.nextBoolean();
        System.out.print("Ingrese el Procesador:");
        String Processor = read.next();
        System.out.print("Ingrese si es una computadora con tarjeta grafica Normal o Gamer:");
        String Graphics = read.next();
        System.out.print("Ingrese el Sistema Operativo:");
        String SO = read.next();
        System.out.print("Ingrese el Tiempo de Fabrica:");
        int TimeFact = read.nextInt();
        System.out.print("Ingrese la capacidad de la bateria en mAH:");
        int mAH = read.nextInt();
        System.out.print("Ingrese la duracion de la bateria en Horas:");
        int Duracion = read.nextInt();
        IngresarComputadoraAlArray(Model,SN,HDD,Size,NumPad,Processor,Graphics,SO,TimeFact,mAH,Duracion);
    }
    public static void ActualizarInfo()
    {
        System.out.print("Ingrese el Numero de Serie de la computadora que quiere actualizar: ");
        String SN = read.next();
        int PosicionDelElemento=-1;
        for(int i=0;i<Inventario.get(1).size();i++)
        {
            if(Inventario.get(1).get(i).equals(SN))
            {
               PosicionDelElemento=i;
               break;
            }
        }
        if(PosicionDelElemento==-1)
        {
            System.out.println("Computadora no encontrada. Intente de Nuevo.");
            ActualizarInfo();
        }
        else
        {
        System.out.print("Ingrese el modelo:");
        String Model = read.next();
        System.out.print("Ingrese la capacidad del Disco Duro en GB:");
        int HDD = read.nextInt();
        System.out.print("Ingrese el tamaño de la pantalla:");
        int Size = read.nextInt();
        System.out.print("Tiene teclado numerico?(true/false:");
        Boolean NumPad = read.nextBoolean();
        System.out.print("Ingrese el Procesador:");
        String Processor = read.next();
        System.out.print("Ingrese si es una computadora con tarjeta grafica Normal o Gamer:");
        String Graphics = read.next();
        System.out.print("Ingrese el Sistema Operativo:");
        String SO = read.next();
        System.out.print("Ingrese el Tiempo de Fabrica:");
        int TimeFact = read.nextInt();
        System.out.print("Ingrese la capacidad de la bateria en mAH:");
        int mAH = read.nextInt();
        System.out.print("Ingrese la duracion de la bateria en Horas:");
        int Duracion = read.nextInt();  
        
        Inventario.get(0).set(PosicionDelElemento, Model);
        Inventario.get(2).set(PosicionDelElemento, HDD);
        Inventario.get(3).set(PosicionDelElemento, Size);
        Inventario.get(4).set(PosicionDelElemento, NumPad);
        Inventario.get(5).set(PosicionDelElemento, Processor);
        Inventario.get(6).set(PosicionDelElemento, Graphics);
        Inventario.get(7).set(PosicionDelElemento, SO);
        Inventario.get(8).set(PosicionDelElemento, TimeFact);
        Inventario.get(9).set(PosicionDelElemento, mAH);
        Inventario.get(10).set(PosicionDelElemento, Duracion);
            System.out.println("Computadora Actualizada...");
        }
    }
    public static void BorrarInfo()
    {
        System.out.print("Ingrese el Numero de Serie de la computadora que quiere borrar: ");
        String SN = read.next();
        int PosicionDelElemento=-1;
        for(int i=0;i<Inventario.get(1).size();i++)
        {
            if(Inventario.get(1).get(i).equals(SN))
            {
               PosicionDelElemento=i;
               break;
            }
        }
        if(PosicionDelElemento==-1)
        {
            System.out.println("Computadora no encontrada. Intente de Nuevo.");
            ActualizarInfo();
        }
        else
        {
        Inventario.get(0).remove(PosicionDelElemento);
        Inventario.get(2).remove(PosicionDelElemento);
        Inventario.get(3).remove(PosicionDelElemento);
        Inventario.get(4).remove(PosicionDelElemento);
        Inventario.get(5).remove(PosicionDelElemento);
        Inventario.get(6).remove(PosicionDelElemento);
        Inventario.get(7).remove(PosicionDelElemento);
        Inventario.get(8).remove(PosicionDelElemento);
        Inventario.get(9).remove(PosicionDelElemento);
        Inventario.get(10).remove(PosicionDelElemento);
            System.out.println("Computadora Removida...");
        }
    }
    public static void ListarSN()
    {
       for(int i=0;i<Inventario.get(1).size();i++)
        {
            System.out.println(Inventario.get(1).get(i)); 
        } 
    }
    public static void InfoCompleta()
    {
        System.out.print("Ingrese el SN de la computadora que desea ver:");
        String SN = read.next();
        int PosicionDelElemento=-1;
        for(int i=0;i<Inventario.get(1).size();i++)
        {
            if(Inventario.get(1).get(i).equals(SN))
            {
               PosicionDelElemento=i;
               break;
            }
        }
        if(PosicionDelElemento==-1)
        {
            System.out.println("Computadora no encontrada. Intente de Nuevo.");
            InfoCompleta();
        }
        else
        {
        System.out.println("Modelo: "+Inventario.get(0).get(PosicionDelElemento));
        System.out.println("Capacidad: "+Inventario.get(2).get(PosicionDelElemento));
        System.out.println("Pantalla: "+Inventario.get(3).get(PosicionDelElemento));
        System.out.println("Teclado Numerico: "+Inventario.get(4).get(PosicionDelElemento));
        System.out.println("Procesador: "+Inventario.get(5).get(PosicionDelElemento));
        System.out.println("Tarjeta Grafica: "+Inventario.get(6).get(PosicionDelElemento));
        System.out.println("Sistema Operativo: "+Inventario.get(7).get(PosicionDelElemento));
        System.out.println("Tiempo en Fabrica: "+Inventario.get(8).get(PosicionDelElemento));
        System.out.println("Capacidad de la bateria: "+Inventario.get(9).get(PosicionDelElemento));
        System.out.println("Duracion de la bateria: "+Inventario.get(10).get(PosicionDelElemento));
        }
    }
    public static void Informes()
    {
        //1
        ArrayList<Object> ModelosGamer = new ArrayList();
        for(int i=0;i<Inventario.get(0).size();i++)
        {
            if(17<=(Integer)Inventario.get(3).get(i) && Inventario.get(6).get(i).equals("Gamer"))
            {
                ModelosGamer.add(Inventario.get(0).get(i));
            }
        }
        System.out.println("1.Computadoras Gamer: "+ModelosGamer);
        //2
        ArrayList<Object> ModelosEducativos = new ArrayList();
        for(int i=0;i<Inventario.get(0).size();i++)
        {
            if(300<=(Integer)Inventario.get(2).get(i) && 13<=(Integer)Inventario.get(3).get(i) && Inventario.get(7).get(i).equals("ChromeOS"))
            {
                ModelosEducativos.add(Inventario.get(0).get(i));
            }
        }
        System.out.println("2.Computadoras Educativas: "+ModelosEducativos);
        //3
        ArrayList<Object> ModelosPocoUso = new ArrayList();
        for(int i=0;i<Inventario.get(0).size();i++)
        {
            if(2<=(Integer)Inventario.get(8).get(i) && 1<=(Integer)Inventario.get(10).get(i) && Inventario.get(7).get(i).equals("Windows"))
            {
                ModelosPocoUso.add(Inventario.get(0).get(i));
            }
        }
        System.out.println("3.Computadoras de Poco Uso: "+ModelosPocoUso);
    }
    
}
