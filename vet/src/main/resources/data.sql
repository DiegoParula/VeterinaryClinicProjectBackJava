-- Insertar datos de dueños
INSERT INTO DUENIO (dni, nombre, apellido, celular) VALUES
('12345678', 'Juan', 'Pérez', 1122334455),
('87654321', 'Ana', 'Gómez', 2211223344),
('11223344', 'Carlos', 'Fernández', 3344556677),
('44332211', 'María', 'López', 6677889900),
('55667788', 'Laura', 'Martínez', 9988776655);

-- Insertar datos de mascotas
INSERT INTO MASCOTA (nombre, especie, raza, color, id_duenio) VALUES
('Fido', 'perro', 'caniche', 'blanco', 1),
('Luna', 'gato', 'siamés', 'gris', 2),
('Rocky', 'perro', 'labrador', 'negro', 3),
('Max', 'perro', 'caniche', 'marrón', 4),
('Bella', 'gato', 'persa', 'blanco', 5);

