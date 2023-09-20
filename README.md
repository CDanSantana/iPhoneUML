# iPhone UML
Desafio DIO: UML de um iPhone

## Para Executar

- Clonar este repositório:
  - `git clone https://github.com/CDanSantana/iPhoneUML.git`
  - `cd iPhoneUML/src`

- Utilizando um terminal de sua escolha, com o JDK previamente configurado e acessível pelo terminal (use `java -version` para verificar se está tudo configurado):
  - `javac br/org/cDanSantana/meuFone/Main.java br/org/cDanSantana/meuFone/navegador/*.java br/org/cDanSantana/meuFone/midia/*.java br/org/cDanSantana/meuFone/telefone/*.java br/org/cDanSantana/meuFone/versao/*.java`
  - `java br.org.cDanSantana.meuFone.Main`

Você também pode importar a pasta src para dentro de sua IDE de escolha, e seguir as especificações de cada uma para executar o projeto.

## Para Gerar o UML

- `java -jar java2plantuml.jar src/br`
- `java -jar plantuml.jar output.puml`

* edite de acordo com a localização dos arquivos .jar e das pastas *

![Diagrama gerado](/output.png)

## Ferramentas Utilizadas

![java2plantuml](https://github.com/mirajp1/java2plantuml): Para converter o código fonte em comandos para o Plant UML

![Plant UML](https://github.com/plantuml/plantuml): para converter os comandos para uma imagem