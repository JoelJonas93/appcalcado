CREATE TABLE calcadokitcalcados(
	cld_id BIGINT,
    kcd_id BIGINT,
    FOREIGN KEY (cld_id) REFERENCES Calcado(cld_id),
    FOREIGN KEY (kcd_id) REFERENCES kitCalcado(kcd_id)
) ENGINE=InnoDb DEFAULT CHARSET=utf8;

INSERT INTO calcadokitcalcados(cld_id,kcd_id)
VALUES(1,1); 

INSERT INTO calcadokitcalcados(cld_id,kcd_id)
VALUES(1,2);

INSERT INTO calcadokitcalcados(cld_id,kcd_id)
VALUES(1,3);

INSERT INTO calcadokitcalcados(cld_id,kcd_id)
VALUES(1,4);

INSERT INTO calcadokitcalcados(cld_id,kcd_id)
VALUES(1,5);