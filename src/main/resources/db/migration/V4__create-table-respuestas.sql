create table respuestas(

     id bigint not null auto_increment,
    mensaje varchar (250)not null,
    topico BIGINT NOT NULL,
    fechaCreacion  DATE not null,
    autor bigint not null,
    respuestas  BOOLEAN NOT NULL,

    PRIMARY KEY (id),
    FOREIGN KEY (topico) REFERENCES topicos(id),
    FOREIGN KEY (autor) REFERENCES usuarios(id)
    )