CREATE TABLE trabajador
(legajo int primary key,
	nombre varchar(12),
	tarifa int,
	oficio varchar(12)
);


alter table trabajador
add legajo_supv INT NULL REFERENCES trabajador;

ALTER TABLE trabajador ADD COLUMN edad int;

DELETE 
FROM trabajador
WHERE oficio = 'Plomero';

SELECT t.legajo
FROM trabajador t
WHERE t.tarifa BETWEEN 10 AND 12;

INSERT INTO trabajador
(legajo, nombre, tarifa, oficio, legajo_supv)
VALUES
(1235, 'M. Fernandez', 12.5, 'electricista', 1311),
(1311, 'C. Garcia', 15.5, 'electricista', 1311),
(1412, 'C. Gonzalez', 13.75, 'plomero', 1520),
(1520, 'H. Caballero', 11.75, 'plomero', 1520),
(2920, 'R. Perez', 10.0, 'albanhil', 2920),
(3001, 'J. Gutierrez', 8.2, 'carpintero', 3231),
(3231, 'P. Alvarez', 17.4, 'carpintero', 3231)
;

CREATE TABLE edificio(
	id_e int primary key,
	dir varchar(20),
	tipo varchar(10),
	nivel_calidad int,
	categoria int)
;

ALTER TABLE edificio ADD COLUMN ciudad varchar(20);

UPDATE edificio
SET nivel_calidad = 5
WHERE nivel_calidad = 4;

UPDATE edificio
SET categoria = 1
WHERE categoria = 4;

DELETE 
FROM edificio
WHERE categoria = 'residencia'



CREATE TABLE asignacion(
	legajo int,
	id_e int,
	fecha_inicio timestamp,
	num_dias int,
	constraint fk_legajo foreign key (legajo) references trabajador(legajo),
	constraint fk_id_e foreign key (id_e) references edificio(id_e)
);

UPDATE asignacion
SET num_dias = num_dias + 4
--b
SELECT t.oficio
FROM asignacion a JOIN trabajador t ON t.legajo = a.legajo
WHERE a.id_e = 435
--c
SELECT t.nombre, t2.nombre
FROM trabajador t JOIN trabajador t2 ON t.legajo_supv = t.legajo;

--d
SELECT t.nombre
FROM asignacion a JOIN trabajador t ON a.legajo = t.legajo 
				  JOIN edificio e ON a.id_e = e.id_e
WHERE tipo = 'oficina';

--e
SELECT t.tarifa
FROM trabajador t JOIN trabajador t2 ON t.legajo_supv = t2.legajo
WHERE t.tarifa > t2.tarifa;

--f
SELECT t.oficio, sum(a.num_dias)
FROM trabajador t JOIN asignacion a ON a.legajo = t.legajo 
where a.id_e = 312 and t.oficio = 'plomero'
group by t.oficio;

--g
SELECT t.oficio, count(t.oficio) as cantidad_Oficios
FROM trabajador t 
GROUP BY t.oficio;

--h
-- Para cada supervisor, cuál es la tarifa por hora más alta que se paga a un trabajador que informa a ese supervisor?
SELECT t.legajo, max(t.tarifa) as tarifa_Maxima
FROM trabajador t JOIN trabajador t2 ON t.legajo_supv = t2.legajo
GROUP BY t.legajo;

--i) Para cada supervisor que supervisa a más de un trabajador, cuál es la tarifa más alta
--que se paga a un trabajador que informa a ese supervisor?
SELECT t2.legajo, max(t.tarifa)
FROM trabajador t JOIN trabajador t2 ON t.legajo_supv = t2.legajo
group by t2.legajo
having  count(t.legajo) > 1


--j) 
--a cada tipo de edificio, cuál es el nivel de calidad medio 
--de los edificios con categoría 1? 
--Considérense sólo aquellos tipos de edificios que
-- tienen un nivel de calidad
--máximo no mayor que 3.
SELECT e.tipo, avg(e.nivel_calidad)
FROM edificio e 
WHERE e.categoria = 1
GROUP BY e.tipo, e.nivel_calidad
HAVING max(e.nivel_calidad) > 3

--k) Qué trabajadores reciben una tarifa por hora menor 
--que la del promedio?
SELECT t.legajo,  t.tarifa
FROM trabajador t 
GROUP BY t.legajo 
HAVING t.tarifa < avg(t.tarifa)

--l) Qué trabajadores reciben una tarifa por hora menor que la del promedio 
--de los trabajadores que tienen su mismo oficio?
SELECT t.legajo,  t.tarifa
FROM trabajador t 
WHERE t.tarifa < (
	SELECT avg(t.tarifa)
	FROM trabajador t JOIN trabajador t2 ON t.oficio = t2.oficio
	);

--m) Qué trabajadores reciben una tarifa por hora menor que la del promedio 
--de los trabajadores que dependen del mismo supervisor que él?
SELECT t.legajo,  t.tarifa
FROM trabajador t 
WHERE t.tarifa < (
	SELECT avg(t.tarifa)
	FROM trabajador t JOIN trabajador t2 ON t.oficio = t2.oficio 
	WHERE t.legajo_supv = t2.legajo
	);


--n) Seleccione el nombre de los electricistas asignados al edificio 435 y la fecha en la que
--empezaron a trabajar en él.
SELECT t.nombre
FROM trabajador t JOIN asignacion a ON t.legajo = a.legajo JOIN edificio e ON a.id_e = e.id_e
WHERE e.id_e = 435 and t.oficio = 'electricista';


--ñ) Qué supervisores tienen trabajadores que tienen una tarifa por hora por encima de los
--12 euros?
SELECT t2.nombre
FROM trabajador t JOIN trabajador t2 ON t.legajo_supv = t2.legajo
WHERE t.tarifa >= 12;














INSERT INTO edificio(id_e, dir, tipo, nivel_calidad, categoria)
VALUES
	(111, 'Av. Paseo Colon 1213', 'oficina', 4, 1),
	(210, 'Rivadavia 1011', 'oficina', 3, 1),
	(312, 'Tucuman 123', 'oficina', 2, 2),
	(435, 'Cabildo 456', 'comercio', 1, 1),
	(460, 'Santa Fe 1415', 'almacen', 3, 3),
	(515, 'Chile 789', 'residencia', 3, 2)
;
INSERT INTO asignacion (legajo, id_e, fecha_inicio, num_dias)
VALUES
	(1235, 312, '2014-10-10 00:00:00', 5),
	(1235, 515, '2014-10-17 00:00:00', 22),
	(1311, 435, '2014-10-08 00:00:00', 12),
	(1311, 460, '2014-10-23 00:00:00', 24),
	(1412, 111, '2014-12-01 00:00:00', 4),
	(1412, 210, '2014-11-15 00:00:00', 12),
	(1412, 312, '2014-10-01 00:00:00', 10),
	(1412, 435, '2014-10-15 00:00:00', 15),
	(1412, 460, '2014-10-08 00:00:00', 18),
	(1412, 515, '2014-11-05 00:00:00', 8),
	(1520, 312, '2014-10-30 00:00:00', 17),
	(1520, 515, '2014-10-09 00:00:00', 14),
	(2920, 210, '2014-11-10 00:00:00', 15),
	(2920, 460, '2014-05-20 00:00:00', 18),
	(3001, 111, '2014-10-08 00:00:00', 14),
	(3001, 210, '2014-10-27 00:00:00', 14),
	(3231, 111, '2014-10-10 00:00:00', 8),
	(3231, 312, '2014-10-24 00:00:00', 20)
;

----------------------------------------------------------------------



