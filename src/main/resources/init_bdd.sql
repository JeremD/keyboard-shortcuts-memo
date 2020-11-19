create table programme (
    libelle char(50) not null,
    nom char(50) unique not null,
    categorie char(50) not null,
    primary key (libelle)
);

create table raccourci (
    id int not null auto_increment,
    libelle char(50) not null,
    description char(50) not null,
    touches char(50) not null,
    programme char(50),
    primary key (id),
    foreign key (programme) references programme(libelle)
);

insert into programme (libelle, nom, categorie) value ('firefox', 'Mozilla Firefox', 'logiciel');
insert into programme (libelle, nom, categorie) value ('aoe2', 'Age of Empires II', 'jeu');
insert into raccourci (libelle, description, touches, programme) value ('onglet-ouvrir', 'Ouvrir un onglet', 'CTRL + T', 'firefox');