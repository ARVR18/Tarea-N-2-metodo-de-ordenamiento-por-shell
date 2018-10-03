

package metshell;

/**
 *
 * @author Alex
 */
public class Algoritmoclaseordenado {
 int i,j;
    public Algoritmoclaseordenado(){
    this.i=0;
    this.j=0;
   
    }
 public void shell(int[] arreglo){
    int slt,i,j,a,auxiliar;
    slt=arreglo.length/2;
    while
            (slt>0){
    for(i=slt;i<arreglo.length;i++){
    j=i-slt;
    while(j>=0){
        a=j+slt;
        if(arreglo[j]<=arreglo[a]){
            j=-1;
       
        }
        else{
            auxiliar=arreglo[j];
            arreglo[j]=arreglo[a];
            arreglo[a]=auxiliar;
            j-=slt;
            
        }
        
    }   
    }
    slt=slt/2;
      
    }

    mostrarArreglo(arreglo);
 }

   public void mostrarArreglo(int[] arreglo){
   int l;
   for(l=0; l<arreglo.length;l++){
  //impresion del arreglo
       System.out.print("[" + arreglo[l] + "]");
 
   }
     System.out.println();
   }
}
   

