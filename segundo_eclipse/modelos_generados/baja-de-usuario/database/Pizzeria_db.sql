
-- Creación de la base de datos
CREATE DATABASE IF NOT EXISTS Pizzeria_db;

-- Cambio al contexto de la base de datos
USE Pizzeria_db;

-- Creación de tablas
-- Definición de la tabla tabla_clientes
CREATE TABLE IF NOT EXISTS tabla_clientes (
	DNI INTEGER PRIMARY KEY AUTOINCREMENT, 
	nombre TEXT, 
	telefono INTEGER, 
	direccion TEXT, 
	email TEXT, 
	vive_en_caceres BOOLEAN
);


