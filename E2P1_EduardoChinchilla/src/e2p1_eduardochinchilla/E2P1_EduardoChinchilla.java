package e2p1_eduardochinchilla;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.*;
import java.util.*;
import javax.swing.JOptionPane;

public class E2P1_EduardoChinchilla {

    static ArrayList<Integer> num = new ArrayList<>();
    static Scanner read = new Scanner(System.in);
    private static int numCadena;

    public static void main(String[] args) {
        int x = 0;
        botones();
        menu(x);

    }

    public static void botones() {

        JFrame frame = new JFrame();
        JButton boton1 = new JButton();
        JButton boton2 = new JButton();
        JButton boton3 = new JButton();
        JLabel label = new JLabel();

        label.setText("Examen 2");
        label.setBounds(150, 0, 200, 150);
        label.setVisible(true);
        label.setLayout(null);

        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(500, 500);
        frame.getContentPane().setBackground(Color.gray);

        frame.add(boton1);
        boton1.setText("Numeros");
        boton1.setBounds(150, 100, 200, 100);

        frame.add(boton2);
        boton2.setText("Operaciones");
        boton2.setBounds(150, 225, 200, 100);

        frame.add(boton3);
        boton3.setText("Salir");
        boton3.setBounds(150, 350, 200, 100);

        frame.add(label);
        frame.setVisible(true);

        boton1.addActionListener(e -> {
            menu(1);
        });

        boton2.addActionListener(e -> {
            menu(2);
        });
        boton3.addActionListener(e -> {
            menu(3);
            System.exit(0);
        });
    }

    public static void menu(int x) {

        switch (x) {
            case 1: {

                JOptionPane.showMessageDialog(null, "Ha entrado a numeros");
                int op = 0;
                while (op != 3) {
                    System.out.println("1. Agregar Numero");
                    System.out.println("2. Eliminar Numero");
                    System.out.println("3. Menu Principal");

                    op = read.nextInt();

                    switch (op) {
                        case 1: {

                            System.out.println("Ingrese la base ");
                            int base = read.nextInt();
                            System.out.println("Ingrese el valor del numero decimal: ");
                            int numDecimal = read.nextInt();

                            while (base < 2 || base > 35 && numDecimal < 1) {
                                System.out.println("Error, ingrese de nuevo");
                                System.out.println("Ingrese la base ");
                                base = read.nextInt();
                                System.out.println("Ingrese el valor del numero decimal: ");
                                numDecimal = read.nextInt();
                            }

                            Numero n = new Numero(base, numDecimal);
                            System.out.println(n.decToBase(numDecimal));
                            //int z = Integer.parseInt(numDecimal);
                            num.add(numDecimal);

                            System.out.println(num);
                            break;
                        }
                        case 2: {
                            System.out.println("Eliminar ");
                            System.out.println(num);
                            System.out.println("Ingrese el indice a remover");
                            int opcion = read.nextInt();
                            num.remove(opcion);
                            break;
                        }
                        case 3: {
                            System.out.println("Salir al Menu");
                            break;
                        }
                    }
                }

                break;
            }
            case 2: {
                JOptionPane.showMessageDialog(null, "Ha entrado a operaciones");
                int opcion = 0;
                while (opcion != 4) {
                    System.out.println("1. Sumar Numeros");
                    System.out.println("2. Restar Numeros");
                    System.out.println("3. Multiplicar Numeros");
                    System.out.println("4. Menu principal");

                    opcion = read.nextInt();

                    switch (opcion) {
                        case 1: {

                            break;
                        }
                        case 2: {
                            break;
                        }
                        case 3: {
                            break;
                        }
                        case 4: {
                            System.out.println("Salir");
                            break;
                        }
                    }
                }
                break;
            }
            case 3: {
                System.out.println("Salio");
                break;
            }
        }

    }
}
