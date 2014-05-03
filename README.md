Rede Social SisNet
==================

![image logo SisNet](https://imagizer.imageshack.us/v2/300x150q90/841/b49d.png)


* [Website] (#)
* [GitHub] (#)
* [Grupo] (#)


Projeto da Disciplina de Sites Dinâmicos
----------------------------------------
Curso: [Análise e Desenvolvimento de Sistema] (http://www.ifpb.edu.br/cajazeiras-3/cursos/cursos-superiores-de-tecnologia/analise-e-desenvolvimento-de-sistemas)

Instituição: [IFPB, campus Cajazeiras] (http://portal.ifpb.edu.br/campi/campi/cajazeiras)

Professor: **Dr. Fábio Gomes de Andrade**

Alunos:
* **Fátima de Sousa**
* **[Sérgio Diniz] (http://buscatextual.cnpq.br/buscatextual/visualizacv.do?metodo=apresentar&id=K8153626U7)**



Apresentação do Projeto
=======================

* Você deve desenvolver uma aplicação referente
a uma nova rede social, chamada SisNet;
* O sistema deve gerenciar o relacionamento entre
as diversas pessoas cadastradas na rede;
* O sistema pode ser usado pelos
usuários cadastrados na rede:
* Todos os usuários do sistema terão um
login (único) e uma senha no sistema;
* Para entrar no sistema, o usuário
deverá informar o seu login e a sua
senha;
* O usuário só deverá fazer login uma vez
durante uma sessão;


Atributos das Entidades
=======================

* **O usuário:**
	* Nome Completo, Apelido, Data de Nascimento,
    Cidade, E-mail, Profissão, Locais onde já
    trabalhou, Locais onde já estudou, Status, Foto;
	
* **O grupo:**
	* Nome, descrição, fundador;

Regras de Negócio
=================

* Usuários podem ter relações de amizade com outros usuários;
* Usuários podem enviar mensagens para os seus amigos;
* Usuários podem criar grupos;
* Usuários podem participar de um ou mais grupos;
* Usuários podem ter relacionamentos especiais com outros usuários;
	* Namorando, casado, mãe, primo, etc;
* Usuários podem publicar fotos no seu perfil;
* Em cada grupo podem ser criados um ou mais tópicos;
* Cada tópico pode ser comentado por um ou mais membros do grupo;


Funcionalidades Oferecidas
==========================

* Fazer o cadastro no sistema;
* Atualizar o seu cadastro no sistema;
* Excluir o seu cadastro no sistema;
* Enviar uma solicitação de amizade;
* Verificar as suas solicitações de amizade;
* Aceitar/rejeitar solicitações de amizade;
* Enviar mensagem para os seus amigos;
* Verificar suas mensagens; 
* Criar um novo grupo;
* Participar de um novo grupo;
* Pesquisar e visualizar o perfil de uma ou mais pessoas;
* Pesquisar e visualizar grupos;
* Publicar mensagens próprias;
* Criar um tópico em um grupo;
* Responder um tópico em um grupo;


Operacionalização
=================

* Os alunos devem usar o SGBD Postgre SQL;
* O Apache Tomcat deve ser usado como container para a aplicação;


Artefatos das Entregas por Etapa
================================
* **1ª Etapa: (29/05/2014)**
	* Gerenciamento de usuários;
		* Cadastro, atualização e exclusão de usuários;
	* Fazer login/logout no sistema;
