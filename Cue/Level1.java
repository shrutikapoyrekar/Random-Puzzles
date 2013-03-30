/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shrutika
 */

/**
 * #include <stdio.h>
#include <math.h>
 
int VAXrand(unsigned int seed)
{
    unsigned int s = ((69069 * seed + 1) % (unsigned int)pow(2,32));
    return s;
}
 
int main()
{
    unsigned int tempseed = 0; //starting seed
    unsigned int res = 0; //store result
    unsigned int n = 0;
 
    tempseed = 6;
for (n = 0; n < 10; n++)
    {
        res = VAXrand(tempseed);
        printf("Starting seed: %u, seed mod 36: %u, result: %u, result mod 36: %u\n",                  tempseed, tempseed%36, res, res%36);
        tempseed = res;
    }
 
return 0;
}
 * @author Owner
 */
public class Level1 
{
    static double VaxRandom( double s)
    {
        return (69069 * s + 1) % Math.pow(2, 32);
    }
    public static void main(String args[])
    {
        double s=6;
        //double ans =0;
        for(int i=0;i<10;i++)
        {
            double ans = VaxRandom(s);
            System.out.println((int)(ans%36));
            s=ans;
        }
    }
}
