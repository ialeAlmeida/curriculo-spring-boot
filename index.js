//instanciando express 
const express = require('express');

const PORT = 3000;
const HOST = '0.0.0.0';

//ou seja, todo comando expresse pode ser acessado pela variável app
const app = express();

app.get('/', (req, res) => {
    res.send('Currículo de Iale Almeida com JavaScript,');
})

app.get('/perfil', (req, res) => {
    res.send(`
            - Nome: Iale Almeida
            - Idade: 21 anos
            - Cargo almejado: Estagiária de desenvolvimento
            - Descrição: Busco oportunidade para empregar os conhecimentos teóricos e
              práticos adquiridos em desenvolvimento, obtidoS por meio de estudos de-
              dicados à área. Como estagiária de desenvolvimento, almejo aplicar minhas
              habilidades na criação e manutenção eficiente de códigos, promovendo 
              práticas ágeis e colaborativas para alcançar resultados excepcionais.
            `);
})

app.get('/contatos', (req, res) => {
    res.send(`
            Contatos 

            - Telefone: (81) 985094772
            - E-mail: almeidaialesantos@gmail.com 
            - LinkedIn: 
            - GitHub: 
            `);
})

app.get('/educacao', (req, res) => {
    res.send(`
            Educação

            Formação 01
                - Ensino médio técnico
                - Curso: Desenvolvimento de Sistemas
                - Instituição: ETE Porto Digital
                - Conclusão: Dezembro/2020

            Formação 02
                - Tecnólogo
                - Curso: Sistemas para Internet
                - Instituição: Universidade Católica de Pernambuco
                - Conclusão: Dezembro/2024
            `);
})

app.get('/experiencias', (req, res) => {
    res.send(`
            Experiência profissional

            - Cargo: Gerente de projetos
            - Empresa: Arco Educação
            - Duração: jul/2023 - nov/2023
            `);
})

app.get('/softs', (req, res) => {
    res.send(`
            Soft Skills

            - Comunicação assertiva
            - Gestão de atividades
            - Organização
            - Trabalho em equipe
            - Métodos ágeis
            - Colaboração
            - Melhoramento contínuo
            `);
})

app.get('/hards', (req, res) => {
    res.send(`
            Hard Skills

            - Git e GitHub
            - Java
            - Spring Boot
            - JavaScript
            - Express
            - Prisma
            `);
})

app.get('/completo', (req, res) => {
    res.send(`
            Currículo de Iale Almeida com JavaScript, Node.JS e Express
            
            - Idade: 21 anos
            - Cargo almejado: Estagiária de desenvolvimento
            - Descrição: Busco oportunidade para empregar os conhecimentos teóricos e
              práticos adquiridos em desenvolvimento, obtidoS por meio de estudos de-
              dicados à área. Como estagiária de desenvolvimento, almejo aplicar minhas
              habilidades na criação e manutenção eficiente de códigos, promovendo 
              práticas ágeis e colaborativas para alcançar resultados excepcionais.

            ---------------------------------------------------------------

            Contatos 
            
            - Telefone: (81) 985094772
            - E-mail: almeidaialesantos@gmail.com 
            - LinkedIn: 
            - GitHub:
            
            ---------------------------------------------------------------

            Educação

                Formação 01
                    - Ensino médio técnico
                    - Curso: Desenvolvimento de Sistemas
                    - Instituição: ETE Porto Digital
                    - Conclusão: Dezembro/2020

                Formação 02
                    - Tecnólogo
                    - Curso: Sistemas para Internet
                    - Instituição: Universidade Católica de Pernambuco
                    - Conclusão: Dezembro/2024

            ---------------------------------------------------------------

            Experiência profissional

                - Cargo: Gerente de projetos
                - Empresa: Arco Educação
                - Duração: jul/2023 - nov/2023

            ---------------------------------------------------------------

            Soft Skills

            - Comunicação assertiva
            - Gestão de atividades
            - Organização
            - Trabalho em equipe
            - Métodos ágeis
            - Colaboração
            - Melhoramento contínuo

            ---------------------------------------------------------------

            Hard Skills

            - Git e GitHub
            - Java
            - Spring Boot
            - JavaScript
            - Express
            - Prisma
            `);
}) 

app.listen(PORT, HOST);