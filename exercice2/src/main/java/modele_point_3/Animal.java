package modele_point_3;

public class Animal implements Cloneable
{//implements Cloneable por pouvoir faire le cloning
    @Override
    public Animal clone()
    {
        try
        {  // créer la copie en dupliquant les objets contenus
            Animal copy = (Animal)super.clone();
            return copy;
        }
        catch (CloneNotSupportedException e)
        {
            return null;
        }
    }
}