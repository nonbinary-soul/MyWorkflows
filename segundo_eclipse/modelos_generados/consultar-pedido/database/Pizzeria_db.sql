
-- Creación de la base de datos
CREATE DATABASE IF NOT EXISTS Pizzeria_db;

-- Cambio al contexto de la base de datos
USE Pizzeria_db;

-- Creación de tablas
-- Definición de la tabla tabla_pedidos
CREATE TABLE IF NOT EXISTS tabla_pedidos (
	dni_cliente INTEGER REFERENCES DNI, 
	pizza_seleccionada TEXT, 
	pizzas_disponibles TEXT, 
	precio_total REAL, 
	numero_pedido INTEGER PRIMARY KEY AUTOINCREMENT
);

-- Definición de la tabla tabla_clientes
CREATE TABLE IF NOT EXISTS tabla_clientes (
	DNI INTEGER PRIMARY KEY AUTOINCREMENT, 
	nombre TEXT, 
	direccion TEXT, 
	telefono INTEGER, 
	email TEXT, 
	vive_en_caceres BOOLEAN
);


