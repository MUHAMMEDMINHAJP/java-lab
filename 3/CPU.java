class Cpu {
   int price=3000;
class processor{
int noofcores=4;
String manufacturer="MAC OS";
void display()
{
System.out.println("           -------------------PROCESSOR------------------");
System.out.println();
System.out.println("          no of cores :"+noofcores);
System.out.println("          manufacturer :"+manufacturer);

}}
void display()
{
processor p=new processor();
p.display();
System.out.println("          price:"+price);
System.out.println();
}

static class RAM{
int memmory=8;
String manufacturer="rayzen";
void display()
{
System.out.println("          -------------------RAM------------------");
System.out.println();
System.out.println("          memmory:"+memmory);
System.out.println("          manufacturer:"+manufacturer);
System.out.println();
System.out.println("          ---------------------------------------------         ");

}
}
}
class CPU{
public static void main(String[]args)
{
Cpu c1=new Cpu();
c1.display();
Cpu.RAM r1=new Cpu.RAM();
r1.display();
}
}
