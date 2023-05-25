public class Practice
{
    public static void main(String[] args)
    {
        String w1 = args[0];
        String w2 = args[1];

        int numberOfCrosses =0;
        int pos1 = 0;
        int pos2 = 0;


        for(int i=0; i < w1.length(); i++)
        {
            for(int j=0; j < w2.length(); j++)
            {
                if(w1.charAt(pos1) == w2.charAt(pos2))
                {
                    numberOfCrosses++;
                    System.out.println(w1 + " " + w2);
                }
            }
        }

        if(numberOfCrosses == 0)
        {
            System.out.print("Words do not cross");
        }
    }
    private static boolean crossesAt(String w1, int pos1, String w2, int pos2)
    {
        if(w1.charAt(pos1) == w2.charAt(pos2))
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    private static void printCross(String w1, int pos1, String w2, int pos2)
    {

        for(int i=0; i < w1.length(); i++)
        {
            for(int j = 0; j < w2.length(); j++)
            {


                    if(j== pos1)
                    {
                    char letter = w2.charAt(i);
                    System.out.print(letter);
                    }
                    if(i== pos2)
                    {
                    char letter1 = w1.charAt(j);
                    System.out.print(letter1);
                    }
                    else
                    {
                    System.out.print(' ');
                    }




            }

        }



    }



}


