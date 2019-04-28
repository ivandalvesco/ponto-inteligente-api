CREATE TABLE empresa (
 id bigint(20) not null,
 cnpj varchar(255) not null,
 data_atualizacao datetime not null,
 data_criacao datetime not null,
 razao_social varchar(255) not null
);

CREATE TABLE funcionario (
id bigint(20) not null,
cpf varchar(255) not null,
data_atualizacao datetime not null,
data_criacao datetime not null,
email varchar(255) not null,
nome varchar(255) not null,
perfil varchar(255) not null,
qtd_horas_almoco float default null,
qtd_horas_trabalho_dia float default null,
senha varchar(255) not null,
valor_hora decimal(19,2) default null,
empresa_id bigint(20) default null
);

create table lancamento(
id bigint(20) not null,
data datetime not null,
data_atualziacao datetime not null,
data_criacao datetime not null,
descricao varchar(255) not null,
localizacao varchar(255) default null,
tipo varchar(255) not null,
funcionario_id bigint(20) not null
);

alter table empresa add primary key (id);
alter table empresa modify id bigint(20) not null AUTO_INCREMENT;

alter table funcionario add primary key (id);
alter table funcionario modify id bigint(20) not null AUTO_INCREMENT;
alter table funcionario add foreign key (empresa_id) references empresa(id);

alter table lancamento add primary key (id);
alter table lancamento modify id bigint(20) not null auto_increment;
alter table lancamento add foreign key (funcionario_id) references funcionario(id);
