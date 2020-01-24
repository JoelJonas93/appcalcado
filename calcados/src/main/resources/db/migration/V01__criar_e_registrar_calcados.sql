CREATE TABLE calcado(
	cld_id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    cld_tamanho NUMERIC(2,0) NOT NULL,
    cld_cor VARCHAR(20) NOT NULL,
    cld_modelo VARCHAR(30) NOT NULL,
    cld_tipo VARCHAR(20) NOT NULL,
    cld_sola VARCHAR(20),
    cld_altura NUMERIC(10,2)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO calcado (cld_tamanho,cld_cor,cld_modelo,cld_tipo,cld_sola,cld_altura)
VALUES (38,'AZUL','RASTEIRO','FEMININO','BORRACHA MACIA',7);

INSERT INTO calcado (cld_tamanho,cld_cor,cld_modelo,cld_tipo,cld_sola,cld_altura)
VALUES (42,'PRETO','SURF','MASCULINO','BORRACHA MACIA',7);

INSERT INTO calcado (cld_tamanho,cld_cor,cld_modelo,cld_tipo,cld_sola,cld_altura)
VALUES (36,'ROSA','RASTEIRO','FEMININO','BORRACHA MACIA',7);

INSERT INTO calcado (cld_tamanho,cld_cor,cld_modelo,cld_tipo,cld_sola,cld_altura)
VALUES (24,'AMARELO','RASTEIRO','MASCULINO','BORRACHA MACIA',7);

INSERT INTO calcado (cld_tamanho,cld_cor,cld_modelo,cld_tipo,cld_sola,cld_altura)
VALUES (39,'VERDE','RASTEIRO','FEMININO','BORRACHA MACIA',7);