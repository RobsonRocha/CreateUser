## CreateUser

## Motivação

Projeto criado para dar suporte a aplicação principal [OLX_SAC](https://github.com/RobsonRocha/OLX_SAC).
Constitui uma aplicação para cadastrar usuários que podem acessar o sistema acima mencionado.
Os usuários podem ser administradores do sistema ou não.
Os administradores têm acesso total, vendo tudo o que foi cadastrado por todos outros usuários e os não-administradores vêem somente o que eles próprios cadastraram.

## Linguagem

A linguagem utilizada é Java e o executável está em um arquivo .jar, este já contém todas as bibliotecas necessárias.

## Banco de dados

O banco de dados usado foi o PostgreSQL.
A criação do banco está no arquivo CREATEDB.

## Compilação

Para facilitar a importação de bibliotecas e a compilação dos arquivos em um único pacote, foi utilizado [Maven](https://maven.apache.org/).
Para compilar gerando o pacote completo basta executar o comando abaixo na linha e comando.

```mvn assembly:assembly```

Na pasta target serão gerados vários arquivos, mas o arquivo completo sempre é gerado com o nome `CreateUserOLX_SAC-1.0.0-SNAPSHOT-jar-with-dependencies.jar`


## Execução

Para executar o programa basta digitar na linha de comando 

```java -cp caminhoOndeEstahOArquivo/CreateUserOLX_SAC-1.0.0-SNAPSHOT-jar-with-dependencies.jar main.CreateUser [login] ```

Onde login é o login do usuário a ser inserido no banco.
Depois disso será perguntada a senha e se o usuário é administrador ou não.
