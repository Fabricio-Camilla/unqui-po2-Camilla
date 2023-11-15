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
   UFSet parent;
   int rank;
};

/* 
 * Inicializa el UFSet ufset, cuyo valor asociado será value 
 */
UFSet createUFS(ELEM_TYPE value) {
   UFSet set = new UFNode;
   set -> element = value;
   set -> parent = .....;
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
   UFSet padre = elem;
   while( elem -> element != elem -> parent){
      padre = elem -> parent;
   }
   return padre;
}

/*
 * Calcula la unión entre los conjuntos ufset1 y ufset2. 
 * Esta operación puede ser optimizada con la técnica de unión por rango.
 */
void unionUFS(UFSet ufset1, UFSet ufset2) {
   if(ufset1 -> parent < ufset2 -> parent){
      ufset2-> parent = ufset1 -> parent;
   }else if(ufset1 -> parent == ufset2 -> parent){
      ufset2 -> parent = ufset1 -> parent;
   }
}
