## Checkpoint Programação Orientada a Objeto - JAVA
### Projeto consistia em criar uma case para resolver algum problema com POO.
#### Abaixo segue a descrição da case em que trabalhei.


### A escola “DH” possui uma grande quantidade de professores e alunos, onde todas as atividades são encaminhadas de maneira desorganizada e são perdidas com facilidade. 
### A diretoria da escola resolveu contratar uma equipe para resolver o problema, pedindo que toda atividade sempre seja cadastrada com data, matéria, turma, nome do aluno, nota da atividade e qual o professor da matéria.
### Dados:
<ul>Todo professor possui uma matéria;
    <li> Professor possui: Nome, Sobrenome, Matrícula, Especialidades</li>
</ul>
<ul> Todo aluno possui mais de uma matéria;
<li>Aluno possui: Nome, Sobrenome, RA, Turma, </ul>

### Ao final deve ser impresso a atividade como todos os dados requeridos no cadastro.
# <h2 align = center> Relacionamentos entre as classes
### No projeto foram utilizados relacionamentos de associação entre as classes escola e pessoa e entre a classe professor e aluno.
### As classes professor e aluno herdam os atributos da classe Pessoa.
### A classe atividade é uma composição das classes Aluno e professores.
### Os métodos estão sobrescritos por @Override to string para que possa ficar organizado a impressão.

### Observações: Para utilizar o código você poderá descomentar alguns códigos na classe Main, mas também poderá escrever algumas linhas de impressão para testes da aplicação.
### Checkpoint executado com base nos conhecimentos adquiridos até a data de apresentação do mesmo, no caso até heranças e métodos ToString.

# <h2 align = center> UML criado

<img align = center width = "100%" src = uml-img.png>






