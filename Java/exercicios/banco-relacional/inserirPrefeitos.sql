SELECT * FROM cidades;

INSERT INTO prefeitos (nome, cidade_id)
VALUES 
    ('Rodrigo Neves', 2),
    ('Raquel Lyra', 3),
    ('Zenaldo Coutinho', null);

SELECT * FROM prefeitos;

-- Não dá erro.
INSERT INTO prefeitos (nome, cidade_id)
VALUES
    ('Rafael Greca', null);

-- Dá erro.
-- INSERT INTO prefeitos (nome, cidade_id)
-- VALUES
--     ('Rodrigo Pinheiro', 3);