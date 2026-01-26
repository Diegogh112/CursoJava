USE ventas;

-- INSERTAR CLIENTE
DELIMITER //
CREATE PROCEDURE sp_insertar_cliente(
    IN p_nombre VARCHAR(50),
    IN p_apellido VARCHAR(50),
    IN p_email VARCHAR(100),
    IN p_telefono VARCHAR(20)
)
BEGIN
INSERT INTO clientes(nombre, apellido, email, telefono)
VALUES (p_nombre, p_apellido, p_email, p_telefono);
END //
DELIMITER ;

-- ACTUALIZAR CLIENTE
DELIMITER //
CREATE PROCEDURE sp_actualizar_cliente(
    IN p_codigo INT,
    IN p_nombre VARCHAR(50),
    IN p_apellido VARCHAR(50),
    IN p_email VARCHAR(100),
    IN p_telefono VARCHAR(20)
)
BEGIN
UPDATE clientes
SET nombre = p_nombre,
    apellido = p_apellido,
    email = p_email,
    telefono = p_telefono
WHERE codigo = p_codigo;
END //
DELIMITER ;

-- ELIMINAR CLIENTE
DELIMITER //
CREATE PROCEDURE sp_eliminar_cliente(
    IN p_codigo INT
)
BEGIN
DELETE FROM clientes WHERE codigo = p_codigo;
END //
DELIMITER ;
