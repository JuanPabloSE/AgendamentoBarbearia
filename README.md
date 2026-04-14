# 💈 Agendamento Barbearia

Sistema de agendamento de serviços para barbearia desenvolvido em Java, com foco em organização de horários, clientes e serviços oferecidos pelo estabelecimento.

---

## 📋 Índice

- [Sobre o Projeto](#sobre-o-projeto)
- [Funcionalidades](#funcionalidades)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Pré-requisitos](#pré-requisitos)
- [Como Executar](#como-executar)
- [Contribuição](#contribuição)
- [Licença](#licença)
- [Autor](#autor)

---

## 📖 Sobre o Projeto

O **Agendamento Barbearia** é uma aplicação desenvolvida em Java com o objetivo de facilitar o gerenciamento de agendamentos em uma barbearia. O sistema permite o cadastro de clientes, controle de horários disponíveis e organização dos serviços prestados, tornando o atendimento mais eficiente e profissional.

---

## ✅ Funcionalidades

- [x] Cadastro de clientes
- [x] Agendamento de horários
- [x] Gerenciamento de serviços disponíveis
- [x] Consulta de agendamentos por data

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Descrição |
|---|---|
| **Java** | Linguagem principal do projeto |
| **IntelliJ IDEA** | IDE utilizada no desenvolvimento |
| **POO** | Paradigma de Programação Orientada a Objetos |

---

## 📁 Estrutura do Projeto

```
AgendamentoBarbearia/
├── .idea/                          # Configurações da IDE IntelliJ IDEA
├── src/                            # Código-fonte principal
│   ├── application/                # Ponto de entrada da aplicação
│   │   └── Main.java               # Classe principal com o método main()
│   ├── entities/                   # Entidades do domínio
│   │   ├── Clientes.java           # Modelo de dados do cliente
│   │   └── Agendamentos.java       # Modelo de dados do agendamento
│   └── service/                    # Camada de serviços e regras de negócio
│       └── BarbeariaService.java   # Lógica de negócio da barbearia
├── .gitignore                      # Arquivos ignorados pelo Git
├── untitled.iml                    # Arquivo de módulo do IntelliJ
└── README.md                       # Documentação do projeto
```

---

## ⚙️ Pré-requisitos

Antes de executar o projeto, certifique-se de ter instalado:

- [Java JDK 11+](https://www.oracle.com/java/technologies/javase-downloads.html) ou superior
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) (recomendado) ou outra IDE Java de sua preferência

---

## 🚀 Como Executar

### Clonando o repositório

```bash
git clone https://github.com/JuanPabloSE/AgendamentoBarbearia.git
cd AgendamentoBarbearia
```

### Executando via IntelliJ IDEA

1. Abra o IntelliJ IDEA
2. Clique em **File > Open** e selecione a pasta do projeto clonado
3. Aguarde o IntelliJ indexar e configurar o projeto
4. Localize a classe principal (`main`) dentro de `src/`
5. Clique com o botão direito sobre ela e selecione **Run**

### Executando via linha de comando

```bash
# Compile o projeto
javac -d out src/**/*.java

# Execute a aplicação
java -cp out NomeDaClassePrincipal
```

> ⚠️ Substitua `NomeDaClassePrincipal` pelo nome da classe que contém o método `main`.

---

## 🤝 Contribuição

Contribuições são bem-vindas! Para contribuir com este projeto:

1. Faça um **fork** do repositório
2. Crie uma branch para a sua feature:
   ```bash
   git checkout -b feature/minha-feature
   ```
3. Faça commit das suas alterações:
   ```bash
   git commit -m 'feat: adiciona minha feature'
   ```
4. Faça o push para a sua branch:
   ```bash
   git push origin feature/minha-feature
   ```
5. Abra um **Pull Request**

---

## 📄 Licença

Este projeto está sob a licença **MIT**. Consulte o arquivo [LICENSE](./LICENSE) para mais detalhes.

---

## 👤 Autor

Desenvolvido por **Juan Pablo**

[![GitHub](https://img.shields.io/badge/GitHub-JuanPabloSE-181717?style=flat&logo=github)](https://github.com/JuanPabloSE)

---

> 💡 *Projeto desenvolvido para fins de aprendizado e aprofundamento em Java.*
