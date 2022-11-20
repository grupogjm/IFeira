
CREATE TABLE usuario (
    email varchar(254),
    senha varchar(30),
    cpf_cnpj varchar(25) PRIMARY KEY,
    cep numeric(8),
    numero numeric(10),
    rua varchar(50),
    bairro varchar(30),
    data_nasc varchar(10)
);

CREATE TABLE produto (
    id int PRIMARY KEY,
    nome varchar(50),
    descricao varchar(300),
    preco varchar(9),
    fk_fotos_fotos_PK int,
    fk_categorias_categoria varchar(20),
    fk_usuario_cpf_cnpj varchar(25)
);

CREATE TABLE fotos (
    fotos_PK int NOT NULL PRIMARY KEY,
    fotos varbinary(150000)
);

CREATE TABLE categorias (
    categoria varchar(20) PRIMARY KEY
);

CREATE TABLE compra (
    fk_usuario_cpf_cnpj varchar(25),
    fk_usuario_cpf_cnpj_ varchar(25),
    id_compra int PRIMARY KEY,
    id_produto int,
    cpf_cnpj_comprador varchar(25),
    cpf_cnpj_vendedor varchar(25)
);

CREATE TABLE conversa (
    fk_usuario_cpf_cnpj varchar(25),
    fk_usuario_cpf_cnpj_ varchar(25),
    fk_mensagem_mensagem_PK int
);

CREATE TABLE mensagem (
    mensagem_PK int NOT NULL PRIMARY KEY,
    dado varchar(100),
    usuario varchar(18)
);
 
ALTER TABLE produto ADD CONSTRAINT FK_produto_2
    FOREIGN KEY (fk_fotos_fotos_PK)
    REFERENCES fotos (fotos_PK)
    ON DELETE NO ACTION;
 
ALTER TABLE produto ADD CONSTRAINT FK_produto_3
    FOREIGN KEY (fk_categorias_categoria)
    REFERENCES categorias (categoria)
    ON DELETE NO ACTION;
 
ALTER TABLE produto ADD CONSTRAINT FK_produto_4
    FOREIGN KEY (fk_usuario_cpf_cnpj)
    REFERENCES usuario (cpf_cnpj)
    ON DELETE CASCADE;
 
ALTER TABLE compra ADD CONSTRAINT FK_compra_2
    FOREIGN KEY (fk_usuario_cpf_cnpj)
    REFERENCES usuario (cpf_cnpj)
    ON DELETE CASCADE;
 
ALTER TABLE compra ADD CONSTRAINT FK_compra_3
    FOREIGN KEY (fk_usuario_cpf_cnpj_)
    REFERENCES usuario (cpf_cnpj)
    ON DELETE CASCADE;
 
ALTER TABLE conversa ADD CONSTRAINT FK_conversa_1
    FOREIGN KEY (fk_usuario_cpf_cnpj)
    REFERENCES usuario (cpf_cnpj)
    ON DELETE CASCADE;
 
ALTER TABLE conversa ADD CONSTRAINT FK_conversa_2
    FOREIGN KEY (fk_mensagem_mensagem_PK)
    REFERENCES mensagem (mensagem_PK)
    ON DELETE NO ACTION;
 
ALTER TABLE conversa ADD CONSTRAINT FK_conversa_3
    FOREIGN KEY (fk_usuario_cpf_cnpj_)
    REFERENCES usuario (cpf_cnpj)
    ON DELETE CASCADE;