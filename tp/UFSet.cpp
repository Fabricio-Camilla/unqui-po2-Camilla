#include "UFSet.h"

/*
 * UFSet.cpp contiene la implementación de la interfaz para UFSet declarada en UFSet.h. 
 * Deben implementarse las operaciones de acuerdo a la representación elegida para el tipo UFSet.
 */

/* El tipo UFNode* representa:
 *  1. un elemento de un UFSet (o sea, un nodo del árbol que contiene a todos los elementos del conjunto)
 *  2. al conjunto en su totalidad, si el nodo es la raíz del arbol
 *
 *  El nodo tiene un puntero a su elemento asociado en el campo element. 
 *  Deberán agregarse los campos necesarios para completar la representación.
 */
struct UFNode {
   ELEM_TYPE element;
   UFNode* parent;
   int rank;
};
/*
   INV. REP
   * Los elementos son disjuntos entonces no pueden ser iguales.
   * El rank es diferente a la altura.
   * Si el UFSet tiene un solo elemento ese es su parent.
   * Todo UFSet tiene un elemento distinguido.
*/


/* 
 * Inicializa el UFSet ufset, cuyo valor asociado será value 
 */
UFSet createUFS(ELEM_TYPE value) {
   UFSet set = new UFNode;
   set -> element = value;
   set -> parent = set;
   set -> rank = 0;
   return set;
}

ELEM_TYPE elemUFS(UFSet ufset) {
   return(ufset -> element);
}

/*
 * Encuentra el elemento distinguido para el UFSet dado. 
 * Esta operación puede ser optimizada con la técnica de compresión de camino.
 */


UFSet findUFS(UFSet elem) {
   //  *sin optimizacion*
  /* while( elem != elem -> parent){
      elem = elem -> parent;
   }
   return elem;
*/
      
   UFSet current = elem;
   while( current != current -> parent){
      current = current -> parent;              // current es el elemnto distinguido
   } 
   while( current != elem -> parent){         // currrente no sea el distinguido
         UFSet prox = elem -> parent;
         elem -> parent = current;      //actualizo el parent del actual por el distinguido
         elem = prox;               // actualizo el actual para el siguiente        
      }
   return current;
}




/*
 * Calcula la unión entre los conjuntos ufset1 y ufset2. 
 * Esta operación puede ser optimizada con la técnica de unión por rango.
 */
void unionUFS(UFSet ufset1, UFSet ufset2) {
   /* 
   //*sin optimizacion*
   if(findUFS(ufset1)  < findUFS(ufset2)){
      ufset2-> parent = findUFS(ufset1);
   }else if(findUFS(ufset1) == findUFS(ufset2)){
      ufset2 -> parent = findUFS(ufset1);
   }
   */

   if (findUFS(ufset1) -> rank > findUFS(ufset2) -> rank){
      ufset2 -> parent = findUFS(ufset1);                      //el padre pasa a ser el elemento distinguido de mayor rank
   }else if( findUFS(ufset1) -> rank < findUFS(ufset2) -> rank ){
      ufset1 -> parent = findUFS(ufset2);                      //el padre pasa a ser el elemento distinguido de mayor rank
   }else{
      ufset1 -> parent = findUFS(ufset2);    // dado que no es menor ni mayor asumo que es el caso que es igual.
      ufset2 -> rank ++;                  //chekear cual le cambia lo que cuelga para aumentar rank?
   }
}




