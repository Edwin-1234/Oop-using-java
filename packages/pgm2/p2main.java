import animalpackage.herbivorous.cow;
import animalpackage.herbivorous.elephant;
import animalpackage.carnivorous.lion;
import animalpackage.carnivorous.bear;
public class p2main
{
    public static void main(String[] args)
    {
        cow c=new cow();
        c.get_cries();
        c.getetype();
        elephant e=new elephant();
        e.get_cries();
        e.getetype();
        lion l=new lion();
        l.get_cries();
        l.getetype();
        bear b=new bear();
        b.get_cries();
        b.getetype();
    }
}