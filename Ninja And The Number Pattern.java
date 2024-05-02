public class Solution {
    public static void getNumberPattern(int n) {
        int l=n;
        for(int i=0;i<n;i++)
        {int a = n;
            for(int j=0;j<=i;j++)
            {
                System.out.print(a);
                a=a-1;
            }
            for(int k=i;k<2*n-2-i;k++)
            {
                System.out.print(l);   
            }
            l=l-1;
            int o=l+2;
            for(int m=1;m<=i;m++)
            {
                System.out.print(o);
                o+=1;
            }
            System.out.print("\n");
        }
        int q=2;
        for(int i=1;i<n;i++)
        { int a=n;
            for(int j=i;j<n;j++)
            {
                System.out.print(a);
                a=a-1;
            }
            for(int k=0;k<2*i;k++)
            {
                System.out.print(q);
            }
            q=q+1;
            int c=q;
            for(int m=i;m<n-1;m++)
            {
                System.out.print(c);
                c+=1;
            }
            System.out.print("\n");
        }
        }
}