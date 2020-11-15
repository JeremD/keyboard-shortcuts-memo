create table programme (
    id int not null auto_increment,
    categorie char(50) not null,
    nom char(50) unique not null,
    primary key (id_prog)
);

create table raccourci (
    id int not null auto_increment,
    libelle char(50) not null,
    description char(50) not null,
    touches char(50) not null,
    id_prog int,
    primary key (id),
    foreign key (id_prog) references programme(id)
);

insert into programme (categorie, nom) value ('logiciel', 'firefox');
insert into raccourci (libelle, description, touches, id_prog) value ('onglet-ouvrir', 'Ouvrir un onglet', 'CTRL + T', 1);