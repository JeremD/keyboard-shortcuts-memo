create table programme (
    id int not null auto_increment,
    categorie char(50) not null,
    nom char(50) unique not null,
    primary key (id)
);

create table raccourci (
    id int not null auto_increment,
    libelle char(50) not null,
    description char(50) not null,
    touches char(50) not null,
    programme char(50),
    primary key (id),
    foreign key (programme) references programme(nom)
);

insert into programme (categorie, nom) value ('logiciel', 'firefox');
insert into programme (categorie, nom) value ('jeux', 'AoE');
insert into raccourci (libelle, description, touches, programme) value ('onglet-ouvrir', 'Ouvrir un onglet', 'CTRL + T', 'firefox');