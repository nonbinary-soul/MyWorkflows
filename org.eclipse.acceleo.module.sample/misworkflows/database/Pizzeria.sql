
-- Creación de la base de datos
CREATE DATABASE IF NOT EXISTS Pizzeria;

-- Cambio al contexto de la base de datos
USE Pizzeria;

-- Creación de tablas
-- Definición de la tabla tabla_clientes
CREATE TABLE IF NOT EXISTS tabla_clientes (
	dni INTEGER PRIMARY KEY AUTOINCREMENT, 
	nombre TEXT, 
	direccion TEXT, 
	jaja BOOLEAN, 
	dafafds REAL, 
	asdffdsfds TEXT, 
	telefono TEXT, 
	opciones TEXT, 
	correo_electronico TEXT
);


