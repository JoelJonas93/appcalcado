CREATE TABLE kitcalcado(
	kcd_id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    Kcd_quantidade NUMERIC(10),
    Kcd_valor NUMERIC(12,2),
    kcd_valorcomissao NUMERIC(12,2)
)ENGINE=InnoDb DEFAULT CHARSET=utf8;

INSERT INTO kitcalcado(kcd_quantidade,kcd_valor,kcd_valorcomissao)
VALUES (5,55,15);

