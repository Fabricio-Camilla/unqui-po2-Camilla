curry f x y = f (x,y) 
uncurry f (x,y) = f x y 
--Demostrar las siguientes propiedades:
{-
--para todo x 
    curry suma' x = suma x
-- sea n un numero
    curry suma' n = suma n
--para todo y 
    curry suma' y = suma y
--sea m un numero
    curry suma' m = suma m

--lado izq
    curry suma' n m
=                   def de curry
    suma' (n,m)
=                   def de suma
    n+m

--lado der
    suma n m 
=               def suma
    n+m
-}
{-
--para todo x 
    uncurry suma x = suma' x
--sea n un numero
    uncurry suma x = suma' x
-- para todo y
    uncurry suma y = suma' y
--sea m un numeor
    uncurry suma m = suma' m

-- lado izq
    uncurry suma (n,m)
=                       def uncurry
    suma n m
=                       def suma
    n+m
-- lado der
    suma' n m
=                       def suma
    n+m   
-}
--Demostrar las siguientes propiedades:
curry fst = const
{-
--para todo x
    curry fst x = const x
--sea n un numero
    curry fst n = const n
--para todo y
    curry fst x y = const x y
--sae m un numero
    curry fst n m = const n m

--lado Izq
    curry fst n m 
=                  por def de curry
    fst (n,m)
=                   def fst
    n

--lado der
    const n m
=               def const
    n
-}


uncurry (flip const) = snd
{-
--para todo x
    uncurry (flip const) x = snd x
--sea n un numero
    uncurry (flip const) n = snd n
--para todo y
    uncurry (flip const) (x, y) = snd (x, y)
--sae m un numero
    uncurry (flip const) (n ,m) = snd (n, m)

--parte izq
    uncurry (flip const) (n,m)
=                               def uncurry
    flip const n m
=                              def flip
    const m n
=                               def const
    m
--parte der
    snd (n,m)
=                           def snd
    m
-}
