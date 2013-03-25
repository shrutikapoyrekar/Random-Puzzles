
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shrutika Poyrekar
 */
public class Cue 
{
    public static void main(String args[]) 
    {
        level1("FourscoreandsevenyearsagoourfaathersbroughtforthonthiscontainentanewnationconceivedinzLibertyanddedicatedtothepropositionthatallmenarecreatedequalNowweareengagedinagreahtcivilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth");
        level2(227000);
        int a[]= { 3, 4, 9, 14, 15, 19, 28, 37, 47, 50, 54, 56, 59, 61, 70,73, 78, 81, 92, 95, 97, 99 };
        level3(a);
    }

    public static void level1(String s)
    {
        System.out.println(s);
        int min=Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++)
        {
            //will run a loop with all chracters over here
            int l=i;
            int m=i;
            while(l>=0 && m<s.length() )
            {
                //System.out.println(s.charAt(l)+" "+s.charAt(m));
                
                if((s.charAt(l)==s.charAt(m)))
                {
                    //System.out.println("Inside if");
                    
                    if((m-l)>=max-min)
                    {
                        max=m;
                        min=l;
                    }
                    
                    m++;
                    l--;
                }
                else
                    break;
            }
        }
        
        //System.out.println(min);
        //System.out.println(max);
        for(int i=min;i<=max;i++)
        {
            System.out.print(s.charAt(i));
        }
       System.out.println();
    }
    
    private static void level2(int a) 
    {
        int n = Fibo(a);
        n++;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int sum = 0;
        int i = 2, temp = -1;
        while (n > 1) 
        {
            if (n % i == 0) 
            {
                if (temp != i) 
                    sum += i;
                temp = i;
                n = n/i;
            }
            else 
                if(i==2)
                    i+=1;
                else
                    i+=2;
            
                        
        }
        System.out.println(sum);
        
    }
    
    private static boolean isPrime(int n) 
    {
        for(int i=2;2*i<n;i++) 
            if(n%i==0)
                return false;
        return true;
    }
    
    public static int Fibo(int n)
    {
        int a = 1, b = 1;
        while (a < n || !isPrime(a)) 
        {
            int temp = a + b;
            b = a;
            a = temp;
        }
        return a;
    }

    private static void level3(int n[]) 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int c = 0;
        for (int i = 0; i < 1 << n.length; i++) 
        {
            boolean flag = false;
            int s = 0;
            int max = Integer.MIN_VALUE;
            
            for (int j = 0; j < n.length; j++) 
                if ((i & (1 << j)) != 0)
                    if (flag)
                        s += n[n.length-j-1];
                    else 
                    {
                        max = n[n.length-j-1];
                        flag = true;
                    }
            
            if (s == max)
                c++;
         }
        System.out.println(c);
    }
    
}