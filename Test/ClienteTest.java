class AlunoTest {

    @Test
    void deveElogiarLoja() {
       Cliente Cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\nA Secretaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A Secretaria agradece a mensagem: Um Exclente atendimento",
               Cliente.elogiarSecretaria("Um Exclente atendimento"));
    }

    @Test
    void deveReclamarLoja() {
       Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\nA Secretaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A Secretaria vai procurar melhorar o serviço da reclamação: Muita demora no atendimento",
              Cliente.reclamarLoja("Muita demora no atendimento"));
    }

    @Test
    void deveSugerirLoja() {
      Cliente Cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\nA Secretaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A Secretaria vai analisar a sugestão:funcionamento mais flexivel ao cliente",
               Cliente.deveSugerirLoja("funcionamento mais flexivel ao cliente"));
    }

}