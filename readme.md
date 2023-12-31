# Trabalho faculdade A3 - Sistema de Gerenciamento de cadastro de CNH

## Descrição:
Desenvolvimento do sistema de controle da Carteira Nacional de Habilitação (CNH) para o DETRAN, conforme cenário descrito a seguir.

## Objetivos:
O objetivo do trabalho é oferecer a oportunidade dos alunos da UC de Programação e Soluções Computacionais para desenvolverem um sistema para o Detran.

## Cenário:
* Você foi contratado pelo Detran para desenvolver um sistema para controle das Carteiras Nacional de Habilitação (CNH) incluindo emissão de novas carteiras, segunda via de carteira e renovação. O sistema deverá funcionar conforme descrito a seguir.

* Todo cidadão maior de 18 anos tem direito a tirar a CNH. Para isso primeiramente ele emite um boleto de pagamento e paga esse boleto para então dar início ao processo de realização de exames. O cidadão deve realizar exame psicológico, exame médico, exame teórico e exame prático. Para que o cidadão receba sua carteira ele deve ser aprovado nestes três exames. Desta forma, após pagar o boleto o cidadão pode efetuar a marcação dos três exames. Realizado o exame psicológico, o psicólogo lança diretamente o resultado no sistema. Da mesma forma, realizado o exame médico, o resultado também é lançado no sistema diretamente pelo médico. O exame prático é realizado por um agente de trânsito do Detran que lança o resultado no sistema. O exame teórico é feito no próprio sistema. O sistema possui um banco de questões definidas pelo próprio Detran. Quando o cidadão inicia uma prova o sistema sorteia 20 questões deste banco, apresenta para o cidadão, ele responde a prova e recebe o resultado imediatamente. 

* Para os cidadãos que passam nos exames uma nova carteira é emitida pelo Detran com cpf do cidadão, nome, data da emissão, data de validade (4 anos após a emissão) e assinatura do cidadão. Essa carteira é impressa pelo Detran e entregue ao cidadão. Para os que perdem em algum dos testes, é possível realizar mais uma vez cada um dos testes. Se novamente for reprovado o cidadão deve emitir outro boleto e reiniciar o processo após 6 meses.

* A emissão de segunda via de carteira também é realizada mediante o pagamento de um boleto. Neste caso o cidadão paga e a carteira é reimpressa e entregue a ele pelo Detran.

* No caso de renovação de carteira vencida é preciso pagar o boleto para renovação, agendar o exame médico (somente este exame), realizar o exame (o médico lança o resultado no sistema) e então o Detran pode reimprimir a carteira e entregar ao cidadão. 

* A solicitação de boleto para pagamento, seja para nova carteira, segunda via ou renovação, é feita diretamente pelo cidadão através do site do Detran. Da mesma forma que o agendamento dos exames e a consulta dos resultados. 





## Diagrama de Classes
![Classes ](https://i.imgur.com/NZfEMMk.png)

## Diagrama de Caso de Uso
![CasoDeUso ](https://i.imgur.com/vZgb56b.png)

## Diagrama ER
<img src="https://raw.githubusercontent.com/gist/santyasm/f8a0d7d9e03eb75734bc6a16c0729b64/raw/c1163f08bacef803274c2eb2d22b6204af2acdb3/ER.svg">

## Programas pra rodar o software
* https://download.oracle.com/java/19/archive/jdk-19.0.2_windows-x64_bin.exe - JDK 19
* https://dlcdn.apache.org/netbeans/netbeans-installers/17/Apache-NetBeans-17-bin-windows-x64.exe - NetBeans 17
* https://dev.mysql.com/downloads/file/?id=518834 - MySql 
* https://drive.google.com/file/d/1yHQNdGL22YSC-tjBaMblB73Ps2NYG7Gc/view - mysql-connector-java


# Passo a Passo para execução do software
*    1º Git clone https://github.com/danielmenezesjj/trabalho-faculdade-a3.git
*    Caso não tenha o git instalado na sua maquina, basta baixar o winrar do projeto, segue o link: https://github.com/danielmenezesjj/trabalho-faculdade-a3/archive/refs/heads/main.zip.

*    2º Importe a dependecia do mysql-conector

*    3º Mudar o login e senha da sua database local -> src/controle/ConexaoDAO.java -   String url = "jdbc:mysql://localhost:3306/detran?user=`SEU USUARIO`&password=`SUA SENHA`";


## Primeiros passos
 *  Executar o script que está no repositorio com nome de `DETRAN_SCHEMA.sql`
 *  Ou então copiar as querys e colar no MySQL Workbench 8.0 CE


## Tecnologias utilizadas
*    JDK-19.0.2 
*    NetBeans-17
*    MySql
*    Mysql-connector-java-5.1.47






## Interfaces 
![Interfaces ](https://i.imgur.com/BtOKIVW.png)
