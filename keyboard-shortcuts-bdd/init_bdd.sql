create table programme (
    id_prog int not null auto_increment,
    categorie char(50) not null,
    nom char(50) unique not null,
    primary key (id_prog)
);

create table raccourci (
    id_racc int not null auto_increment,
    libelle char(50) not null,
    description char(50) not null,
    touche char(50) not null,
    id_prog int,
    primary key (id_racc),
    foreign key (id_prog) references programme(id_prog)
);

insert into programme (categorie, nom) value ('logiciel', 'firefox');
insert into raccourci (libelle, description, touche, id_prog) value ('onglet-ouvrir', 'Ouvrir un onglet', 'CTRL + T', 1);