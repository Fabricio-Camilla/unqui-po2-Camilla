CREATE TABLE restaurante(
  razon_social varchar(40) PRIMARY KEY,
  fundacion date,
  cant_estrellas int
 );
CREATE TABLE maestro(
  nombre varchar(30),
  restaurante varchar(20),
  fecha_nac	date,
  tiempo_profesional int,
  
  PRIMARY KEY(nombre, restaurante),
  CONSTRAINT maestroFK FOREIGN KEY (restaurante) REFERENCES restaurante(razon_social)
);

CREATE TABLE participante(
  apodo varchar(30),
  edad int,
  ciudad varchar(30),
  maestro varchar(30),
  
  PRIMARY KEY (apodo, maestro),
  CONSTRAINT participanteFK FOREIGN KEY (maestro) REFERENCES maestro (nombre)
);

--------------------------------------------------------------------------------------------

CREATE TABLE protector(
  pasaporte varchar(30) PRIMARY KEY,
  altura int,
  peso int
);

CREATE TABLE herramienta(
  nombre varchar(30) PRIMARY KEY,
  poder	int,
  origen varchar(40),
  pasaporte varchar(30),
  
 FOREIGN KEY (pasaporte) REFERENCES protector(pasporte)
);

CREATE TABLE ciudad(
  nombre varchar(30) PRIMARY KEY,
  ubicacion varchar(30),
  poblacion int
);
 
CREATE TABLE protege(
  nombre varchar(30),
  pasaporte varchar(30),
  fecha date,
  fue_exitoso boolean,
  
  PRIMARY KEY (nombre, pasaporte, fecha)
  CONSTRAINT protegeFK FOREIGN KEY (nombre) REFERENCES nombre(ciudad)
  CONSTRAINT protege2FK FOREIGN KEY (pasaporte) REFERENCES pasaporte(protector)
);

-----------------------------------------------------------------------------------------

CREATE TABLE comiqueria(
  nombre_comiqueria varchar(30) PRIMARY KEY,
  forma_contributiva varchar(50),
  ciudad varchar(10) UNIQUE,
  direccion varchar(20) UNIQUE,
  piso int UNIQUE,
  local varchar(10) UNIQUE,
  
  CONSTRAINT comicheck CHECK (forma_contributiva IN('esquema priamidal', 'monotributo', 'cooperativa', 'empresa'))
 );
 
 CREATE TABLE editorial(
   nombre varchar(20) PRIMARY KEY,
   jefe varchar(20),
   #empleados int,
   al_dia_con_afip boolean
);

CREATE TABLE comic(
  nombre varchar(20),
  tomo varchar(20),
  demografia varchar(20),
  origen varchar(20),
  edicion varchar(20)
  
  PRIMARY KEY(nombre, tomo)
  FOREIGN KEY (edicion) REFERENCES editorial(nombre)
  
  CONSTRAINT demografiaChekc CHECK(demografia IN('shonen','shouje','josei'))
  CONSTRAINT origencheck CHECK(origen IN('Japon', 'Corea', 'Francia', 'USA'))
 );

 ALTER TABLE comic ADD COLUM usamp boolean;






Listar <nombrePok, gimnasio, fHallazgo> de los pokemones evolucionables que solo han atacado 
gimnasios con su mismo tipo pero no han atacado ningún gimnasio con medalla Arcoíris.



proyeccion<nombrePok, gimnasio, fHallazgo> (
  seleccion<forma_Interaccion = 'ataca'> (
    seleccion< evolucionables> (pokemon * interactua)
  )
)

-


proyeccion<nombrePok, gimnasio, fHallazgo> (
  seleccion<forma_Interaccion = 'ataca' ^ tipoGym = tipoPok> (
    gimansio |X|<gimnasio = nombreGym> (pokemon * interactua)
  )
)

-

proyeccion<nombrePok, gimnasio, fHallazgo> (
  seleccion<medalla = 'Arcoiris'> gimansio|X|<gimnasio = nombreGym> (pokemon * interactua)
  )
)





listar <usuario, estatura, medalla> de los entrenadores que hayan atacado todos los gimnasios de tipo
Fuego y que posean al menos un Pokemon de tipo Agua, o bien, los entrenadores que han defendido al
menos un gimnasio luego del 29-10-2022.

proyeccion <usuario, estatura, medalla>
{
proyeccion<nombreGym>
[proyeccion<usuario, nombreGym>(seleccion<forma_interaccion = 'ataca'
          ^ tipoGym = 'Fuego'
          ^ tipoPok = 'Agua'>entrenador |X| <entrenador = usuario > pokemon * interactua)

%

proyeccion <nombreGym> gimnasio 
]*pokemon |X| <usuario = entrenador> gimnasio

U

proyeccion<nombreGym>(seleccion<forma_interaccion = 'defensa' 
                            ^ fecha >= 29-10-2022>(gimansio |X| <nombreGym = gimnasio> interactua))

}*pokemon |X| <usuario = entrenador> gimnasio

















