
package digitorecu;


public class DigitoRECU {

    public static void main(String[] args) {
        
    System.out.print("ingresa un numero: ");
    int n= new java.util.Scanner(System.in).nextInt();
    System.out.println("la suma de los digitos es:"+sumar(n));
    }
    static int sumar(int a){
        if(a<10){
            return a;
        }
            return sumar(a/10)+(a%10);
            
            
        
    }
}
