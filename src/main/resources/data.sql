drop table if exists fabricantes;
create table fabricantes (
id INT AUTO_INCREMENT,
nombre VARCHAR(100),
PRIMARY KEY(id));

drop table if exists articulos;
create table articulos (
id INT AUTO_INCREMENT,
nombre VARCHAR(100),
precio INT,
fabricante INT NOT NULL REFERENCES fabricantes(id) ON DELETE CASCADE ON UPDATE CASCADE,
PRIMARY KEY(id));

insert into fabricantes (nombre) values ('Dickens-Runte');
insert into fabricantes (nombre) values ('Fadel-Paucek');
insert into fabricantes (nombre) values ('Barton Group');
insert into fabricantes (nombre) values ('Harvey, Corwin and Towne');
insert into fabricantes (nombre) values ('Zboncak-Hagenes');
insert into fabricantes (nombre) values ('Gerlach, Purdy and Morissette');
insert into fabricantes (nombre) values ('Herzog Inc');
insert into fabricantes (nombre) values ('O''Connell Group');
insert into fabricantes (nombre) values ('Marquardt, Collins and Schimmel');
insert into fabricantes (nombre) values ('Wuckert-Bahringer');

insert into articulos (nombre, precio, fabricante) values ('Juice - Cranberry 284ml', 99, 2);
insert into articulos (nombre, precio, fabricante) values ('Okra', 40, 2);
insert into articulos (nombre, precio, fabricante) values ('Wine - Rubyport', 27, 2);
insert into articulos (nombre, precio, fabricante) values ('Pop Shoppe Cream Soda', 59, 4);
insert into articulos (nombre, precio, fabricante) values ('Sauce - Apple, Unsweetened', 43, 5);
insert into articulos (nombre, precio, fabricante) values ('Pork - Tenderloin, Fresh', 51, 5);
insert into articulos (nombre, precio, fabricante) values ('Ice Cream Bar - Oreo Cone', 21, 7);
insert into articulos (nombre, precio, fabricante) values ('Hot Choc Vending', 25, 8);
insert into articulos (nombre, precio, fabricante) values ('Longos - Lasagna Veg', 70, 9);
insert into articulos (nombre, precio, fabricante) values ('Cheese - Colby', 20, 9);



