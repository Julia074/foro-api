create table topicos(

     id bigint not null auto_increment,
     titulo varchar (100)not null,
     mensaje varchar (250)not null,
     fechaCreacion DATE not null,
     status varchar (100)not null,
     autor bigint not null,
     curso bigint not null,
     respuestas varchar (250),

     primary key (id),
      FOREIGN KEY(autor) REFERENCES usuarios(id),
      FOREIGN KEY (curso) REFERENCES curso(id)
     )