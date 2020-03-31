package vector;

public class Vector
{

    public Vector()
    {

    }


    /**
     *
     * @param dim
     */
    public void setDimension(int dim)
    {

        vector = new int[dim];

    }


    /**
     *
     * @param index
     * @return
     */
    public int getElem(int index)
    {

        return vector[index];

    }

    /**
     *
     * @param index
     * @param value
     */
    public void setElem(int index,int value)
    {

        vector[index] = value;

    }

    /**
     *
     * @return
     */
    public int getLength()
    {

        return vector.length;

    }


    /**
     *
     * @param vector
     * @return
     */
    public Vector add(Vector vector)
    {

        if (vector.getLength() == this.vector.length)
        {

            Vector newvector = new Vector();

            newvector.setDimension(this.vector.length);

            for(int i = 0; i < this.vector.length; i++)
            {

                newvector.setElem(i,vector.getElem(i) + this.vector[i]);

            }

            return newvector;

        }
        else
        {

            System.out.println("Два вектора різного розміру, додавання неможливе!");

            Vector newvector = new Vector();

            newvector.setDimension(0);

            return newvector;

        }

    }


    /**
     *
     * @param vector
     * @return
     */
    public Vector multiply(Vector vector)
    {

        if (vector.getLength() == this.vector.length)
        {

            Vector newvector = new Vector();

            newvector.setDimension(this.vector.length);

            for(int i = 0; i < this.vector.length; i++)
            {

                newvector.setElem(i,vector.getElem(i) * this.vector[i]);

            }

            return newvector;

        }
        else
        {

            System.out.println("Два вектора різного розміру, множення неможливе!");

            Vector newvector = new Vector();

            newvector.setDimension(0);

            return newvector;

        }

    }


    /**
     *
     * @param vector
     * @return
     */
    public Vector divide(Vector vector)
    {

        if (vector.getLength() == this.vector.length)
        {

            Vector newvector = new Vector();

            newvector.setDimension(this.vector.length);

            for(int i = 0; i < this.vector.length; i++)
            {

                newvector.setElem(i,vector.getElem(i) / this.vector[i]);

            }

            return newvector;

        }
        else
        {

            System.out.println("Два вектора різного розміру, ділення неможливе!");

            Vector newvector = new Vector();

            newvector.setDimension(0);

            return newvector;

        }

    }


    /**
     *
     * @param vector
     * @return
     */
    public Vector deduct(Vector vector)
    {

        if (vector.getLength() == this.vector.length)
        {

            Vector newvector = new Vector();

            newvector.setDimension(this.vector.length);

            for(int i = 0; i < this.vector.length; i++)
            {

                newvector.setElem(i,vector.getElem(i) - this.vector[i]);

            }

            return newvector;

        }
        else
        {

            System.out.println("Два вектора різного розміру, віднімання неможливе!");

            Vector newvector = new Vector();

            newvector.setDimension(0);

            return newvector;

        }

    }


    public void print()
    {

        System.out.print("[");

        int count = 0;

        for (double value:vector)
        {

            count++;

            if(count == vector.length)
            {

                System.out.print(value);

            }
            else
            {

                System.out.print(value + ",");

            }

        }

        System.out.println("]");

    }

    private int vector[];

}
