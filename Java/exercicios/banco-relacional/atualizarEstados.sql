UPDATE estados
SET nome = 'Maranhão'
WHERE sigla = 'MA'

-- Você pode dar um 'apelido' para a tabela e usá-lo pra definí-la. Também pode usar o 
-- próprio nome da tabela.
SELECT est.nome FROM estados est WHERE sigla = 'MA'

UPDATE estados
SET nome = 'Paraná', populacao = 11.32
WHERE sigla = 'PR'

SELECT nome, populacao FROM estados WHERE sigla = 'PR'