import java.util.Scanner;
class product 
{
    int pcode,price;
    String pname;
    product(int pcode,String pname,int price)
     {
    
       this.pcode=pcode;
       this.pname=pname;
       this.price=price;
       }
}



public class products 
{
      public static void main(String[]args)
     {
          Scanner sc=new Scanner (System.in);
          System.out.println("Enter the product code:");
          int pcode=sc.nextInt();
          System.out.println("Enter the product name:");
          String pname=sc.next();
          System.out.println("Enter the product price:");
          int price=sc.nextInt();

         product[]ps=new product[3];
         ps[0]=new product(pcode,pname,price);
         ps[1]=new product(001,"pen",10);
         ps[2]=new product(002,"book",50);

         int minprice=ps[0].price;
         System.out.println("Code \t Name \t Price");

         for(product p:ps)
        {
           System.out.println(p.pcode+"\t"+p.pname+"\t"+p.price);

                   if(minprice>p.price)
                  {
                    minprice=p.price;
                  }
     }

             System.out.println("lowest cost product");


               for(product p:ps)
              {
                  if(minprice==p.price)
               {
                     System.out.println("----------------------------------------");
                     System.out.println("product code :"+p.pcode);
                     System.out.println("product name :"+p.pname);
                     System.out.println("product price :"+p.price);
                     System.out.println("----------------------------------------");
               }
            }
}
}


