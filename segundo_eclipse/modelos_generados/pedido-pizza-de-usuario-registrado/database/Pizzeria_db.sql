
-- Creación de la base de datos
CREATE DATABASE IF NOT EXISTS Pizzeria_db;

-- Cambio al contexto de la base de datos
USE Pizzeria_db;

-- Creación de tablas
-- Definición de la tabla tabla_clientes
CREATE TABLE IF NOT EXISTS tabla_clientes (
	DNI INTEGER PRIMARY KEY AUTOINCREMENT, 
	nombre TEXT, 
	direccion TEXT, 
	telefono INTEGER, 
	email TEXT, 
	vive_en_caceres BOOLEAN
);

-- Definición de la tabla tabla_pedidos
CREATE TABLE IF NOT EXISTS tabla_pedidos (
	dni_cliente INTEGER REFERENCES DNI, 
	pizza_seleccionada TEXT, 
	precio_total REAL, 
	pizzas_disponibles TEXT, 
	numero_pedido INTEGER PRIMARY KEY AUTOINCREMENT
);

-- Definición de la tabla tabla_estados
CREATE TABLE IF NOT EXISTS tabla_estados (
	numero_de_registro INTEGER PRIMARY KEY AUTOINCREMENT, 
	numero_pedido INTEGER REFERENCES numero_pedido, 
	timestamp TEXT, 
	estado BOOLEAN, 
	URL TEXT
);

-- Definición de la tabla tabla_valoraciones
CREATE TABLE IF NOT EXISTS tabla_valoraciones (
	numero_de_valoracion INTEGER PRIMARY KEY AUTOINCREMENT, 
	numero_pedido INTEGER REFERENCES numero_pedido, 
	valoracion INTEGER
);


