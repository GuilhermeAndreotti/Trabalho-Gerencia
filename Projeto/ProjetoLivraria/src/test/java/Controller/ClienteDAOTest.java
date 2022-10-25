
package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Guilherme Andreotti
 */
public class ClienteDAOTest{
    
    clienteDAO controle = new clienteDAO();
    aluguelDAO aluguel = new aluguelDAO();
    
    public ClienteDAOTest() {
    }
    
  
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }


    public clienteDAO criaClienteGenerico(){   
        
        controle.setCaminhoTeste();
        controle.conectar();
        aluguel.conectar();
        aluguel.excluir();
        controle.excluir();  
        
        controle.getCliente().setNome("Teste");
        controle.getCliente().setSobrenome("Teste");
        controle.getCliente().setEstado("SP");
        controle.getCliente().setEndereco("End. Teste");
        controle.getCliente().setCidade("Testalopis");
        controle.getCliente().setCPF("111.111.111-11");
        controle.getCliente().setBairro("Bairro Teste"); 
        
        return controle;
    }
     /**
     * Teste com cadastro dando sucesso.
     */   
    @Test
    public void registroUnicoTest(){
        
        controle = criaClienteGenerico();
        controle.inserir();
        controle.consultarTodos();
        ResultSet rs = controle.getrsdados();
        try{
          assertEquals(true,rs.next());     
          controle.desconectar();
          
        } catch (SQLException ex) {
            fail("Erro ao executar o teste, gerou uma falha de conexão!");
        }          
    }
    
     /**
     * Teste com cadastro duplo dando sucesso.
     */
    
    @Test
    public void registroDuploTest(){
         
        controle.setCaminhoTeste();
        controle.conectar();
        aluguel.conectar();
        aluguel.excluir();
        controle.excluir();
        
        try{ 
            controle.getCliente().setNome("Teste");
            controle.getCliente().setSobrenome("Teste");
            controle.getCliente().setEstado("SP");
            controle.getCliente().setEndereco("End. Teste");
            controle.getCliente().setCidade("Testalopis");
            controle.getCliente().setCPF("111.111.111-11");
            controle.getCliente().setBairro("Bairro Teste");                   
            controle.inserir();
            
            controle.getCliente().setNome("Teste2");
            controle.getCliente().setSobrenome("Teste2");
            controle.getCliente().setEstado("SP");
            controle.getCliente().setEndereco("End. Teste2");
            controle.getCliente().setCidade("Testalopis");
            controle.getCliente().setCPF("444.441.441-44");
            controle.getCliente().setBairro("Bairro Teste");
            controle.inserir();
            
            controle.consultarCount();
                     
            ResultSet rs = controle.getrsdados();
           
            assertEquals(2, rs.getInt(1));
            controle.desconectar();
          
        } catch (SQLException ex) {
            fail("Erro ao executar o teste, gerou uma falha de conexão!");
        }          
    }   
    /**
     * Teste com bairro passando do limite máximo de caracteres.
     */  
    
    @Test
    public void invalidoBairroTest(){
                 
        controle = criaClienteGenerico();
        controle.getCliente().setBairro("Bairro Teste Teste Teste Teste Teste Teste Teste Teste");
        controle.inserir();
        controle.consultarTodos();
        
        try{
            ResultSet rs = controle.getrsdados();           
            assertEquals(false,rs.next());
            controle.desconectar();
          
        } catch (SQLException ex) {
            fail("Erro ao executar o teste, gerou uma falha de conexão!");
        }     
    }
    
     /**
     * Teste com CPF passando do limite máximo de caracteres.
     */ 
    
    @Test
    public void cpfInvalidoTest(){
                     
        controle = criaClienteGenerico();
        controle.getCliente().setCPF("111.1121.111-11");
        controle.inserir();
        controle.consultarTodos();
        
        try{
            ResultSet rs = controle.getrsdados();           
            assertEquals(false,rs.next());
            controle.desconectar();
          
        } catch (SQLException ex) {
            fail("Erro ao executar o teste, gerou uma falha de conexão!");
        }     
    }
    
      /**
     * Teste com CPF vazio.
     */
    
    @Test
    public void cpfVazioTest(){
          
        controle = criaClienteGenerico();
        controle.getCliente().setCPF("");
        controle.inserir();
        controle.consultarTodos();  
        try{
            ResultSet rs = controle.getrsdados();           
            assertEquals(false,rs.next());
            controle.desconectar();
          
        } catch (SQLException ex) {
            fail("Erro ao executar o teste, gerou uma falha de conexão!");
        }     
    }   
    
    
     /**
     * Teste com estado passando do limite máximo de caracteres.
     */
    
    @Test
    public void invalidoEstadoTest(){
        
        controle = criaClienteGenerico();
        controle.getCliente().setEstado("Spp");
        controle.inserir();
        controle.consultarTodos();  
        try{
            ResultSet rs = controle.getrsdados();           
            assertEquals(false,rs.next());
            controle.desconectar();
          
        } catch (SQLException ex) {
            fail("Erro ao executar o teste, gerou uma falha de conexão!");
        }     
    }
    
}