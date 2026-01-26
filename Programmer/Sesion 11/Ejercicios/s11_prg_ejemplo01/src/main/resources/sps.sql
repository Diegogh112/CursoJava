CREATE PROCEDURE ins_curso(in cod CHAR(3),in nom VARCHAR(50), in cre int)
   insert into curso values(cod,nom,cre);

CREATE PROCEDURE upd_curso(in cod CHAR(3),in nom VARCHAR(50), in cre int)
update curso set vchCurNombre=nom, intCurCreditos=cre where chrCurCodigo=cod;

CREATE PROCEDURE del_curso(in cod CHAR(3))
delete from curso where chrCurCodigo=cod;

CREATE PROCEDURE findAll_cursos()
select * from curso;

CREATE PROCEDURE find_curso(in cod CHAR(3))
select * from curso where chrCurCodigo=cod;
