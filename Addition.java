import java.util.Scanner; 
class Main {

  public static void main(String[] args) {
    
    
    int a,b,c,d,s1,s2,s3,s4;
    Scanner sc = new Scanner(System.in);  
    System.out.println("Enter 1st numbers: ");
    a=sc.nextInt();
    System.out.println("Enter 2nd numbers: ");
    b=sc,nextInt();
    System.out.println("Enter 3rd numbers: ");
    c=sc.nextInt();
    System.out.println("Enter 4th numbers: ");
    d=sc.nextInt();
    
    s1=a+b;
    s2=c+d;
    s3=s1+s2;
    s4=a+d;
    System.out.println("1st= "+s1);
    System.out.println("2st= "+s2);
    System.out.println("3st= "+s3);
    System.out.println("4st= "+s4);
  }
}
