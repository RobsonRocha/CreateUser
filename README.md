## CreateUser

## Motiva��o

Projeto criado para dar suporte a aplica��o principal OLX_SAC.
Constitui uma aplica��o para cadastrar usu�rios que podem acessar o sistema acima mencionado.
Os usu�rios podem ser administradores do sistema ou n�o.
Os administradores t�m acesso total, vendo tudo o que foi cadastrado por todos outros usu�rios e os n�o-administradores v�em somente o que eles pr�prios cadastraram.

## Linguagem

A linguagem utilizada � Java e o execut�vel est� em um arquivo .jar, este j� cont�m todas as bibliotecas necess�rias.

## Compila��o

Para facilitar a importa��o de bibliotecas e a compila��o dos arquivos em um �nico pacote, foi utilizado Maven.
Para compilar gerando o pacote completo basta executar o comando mvn assembly:assembly na linha de comando.
Na pasta target ser�o gerados v�rios arquivos, mas o arquivo completo sempre � gerado com o nome CreateUserOLX_SAC-1.0.0-SNAPSHOT-jar-with-dependencies.jar


## Execu��o

Para executar o programa basta digitar na linha de comando java -cp caminhoOndeEstaOArquivo/CreateUserOLX_SAC-1.0.0-SNAPSHOT-jar-with-dependencies.jar main.CreateUser login.
Onde login � o login do usu�rio a ser inserido no banco.
Depois disso ser� perguntada a senha e se o usu�rio � administrador ou n�o.


## Banco de dados

A cria��o do banco est� no arquivo CREATEDB.
