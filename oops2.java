class computer
{
    
    
    public void playMusic()
    {
        System.out.println("Music Playing...");
    }

    public String getMeAPen(int m){
        

        if(m>10)
            return "Goood Money";
        return "Sooooorryyyyyy....😜";
    }
}

public class oops2
{

    public static void main (String args[])
    {

        computer c=new computer();
        c.playMusic();
        System.out.println(c.getMeAPen(1));
    }
}