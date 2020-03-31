package main;

import vector.Vector;

public class Main
{

    public static void main(String[] args)
    {

        try {

            Vector first = new Vector();

            Vector second = new Vector();

            first.setDimension(Integer.parseInt(args[0]));

            for (int i = 1; i <= first.getLength(); i++) {

                first.setElem(i - 1, Integer.parseInt(args[i]));

            }

            second.setDimension(Integer.parseInt(args[first.getLength() + 1]));

            int count = 0;

            for (int i = first.getLength() + 2; i < args.length; i++) {

                second.setElem(count, Integer.parseInt(args[i]));

                count++;

            }

            System.out.print("Первий вектор: ");

            first.print();

            System.out.print("Другий вектор: ");

            second.print();

            Vector add = first.add(second);

            System.out.println("Додавання векторів:");

            add.print();

            Vector multiply = first.multiply(second);

            System.out.println("Множення векторів:");

            multiply.print();

            Vector divide = first.divide(second);

            System.out.println("Ділення векторів:");

            divide.print();

            Vector deduct = first.deduct(second);

            System.out.println("Віднімання векторів:");

            deduct.print();
        }
        catch (Exception message)
        {

            message.printStackTrace();

        }
    }
}
