curry :: ((a,b) -> c) -> a -> b -> c
curry f x y =  f (x, y)

uncurry :: (a -> b -> c) -> (a,b) -> c
uncurry f (x , y)=  f x y 
-----------------------------------------------------------
swap (x,y) = (y,x)
{-
apply f = g
    where g x = f x

apply f = \x -> f x

apply = \f -> \x -> f x 

((apply f) x) = f x

-}
apply :: (a -> b) -> a -> b 
apply f x = f x


{-
twice f = g
    where g x = f (f x)

twice f = \x -> f (f x)

twice = \f -> \x -> f (f x)

((twice f) x) = f (f x)

-}

twice :: (a -> a) -> a -> a
twice f x = f (f x)


{-
id = \x -> x
-}

id x = x


{-flip f = g
    where g x = h
             h y = (f y) x

flip f = g
    where g x = \y -> (f y) x

flip f = \x -> \y -> (f y) x

(((flip f) x) y) = (f y) x
-}
flip :: (a -> b -> c) -> b -> a -> c
flip f x y = f y x

{-
uflip f = g
    where g p = f (swap p)

uflip f = \p -> f (swap p)

uflip = \f -> \p -> f (swap p)

((uflip f) p) = f (swap p)
-}
uflip :: ((a,b) -> c) -> (b,a) -> c
uflip f p = f (swap p)

{-
const = \x -> (\y -> x)
-}
{-
compose = \f -> (\g -> (\x -> f (g x)))

compose f = (\g -> (\x -> f (g x)))

compose f g =  (\x -> f (g x))
-}
compose :: (a->b) -> (c->d) -> b -> c
compose f g x = f (g x)
-----------------------------------------------------------------------




