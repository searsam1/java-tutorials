//save as B.java 
import pack.*;  //Importing the package named pack which contains class A.
  
package pack;  
public class A{  
  public void msg(){System.out.println("Hello");}  
}  


class B{  
  public static void main(String args[]){  
   A obj = new A();  
   obj.msg();  
  }  
} 
