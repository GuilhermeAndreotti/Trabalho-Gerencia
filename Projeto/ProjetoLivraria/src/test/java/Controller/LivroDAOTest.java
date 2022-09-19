/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
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
public class LivroDAOTest {
    
    LivroDAO controle = new LivroDAO();
    
    public LivroDAOTest() {
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
    
    /**
     * Teste com cadastro dando sucesso.
     */
    
    @Test
    public void testUnicoCadastro(){
          
        controle.conectar();
        controle.excluirTodos();
             
        try{    
            controle.getLivro().setTitulo("Teste");
            controle.getLivro().setGenero("Teste");
            controle.getLivro().setEditora("Teste");
            controle.getLivro().setNomeAutor("Teste");
            controle.getLivro().setSobrenomeAutor("Teste");
            controle.getLivro().setQntPgns(150);
            controle.inserir();
            controle.consultarTodos();
 
            ResultSet rs = controle.getrsdados();
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
    public void testDuploCadastro(){
         
        int i = 0;
        controle.conectar();
        controle.excluirTodos();
             
        try{    
            controle.getLivro().setTitulo("Teste");
            controle.getLivro().setGenero("Teste");
            controle.getLivro().setEditora("Teste");
            controle.getLivro().setNomeAutor("Teste");
            controle.getLivro().setSobrenomeAutor("Teste");
            controle.getLivro().setQntPgns(150);
            controle.inserir();
            controle.getLivro().setTitulo("Teste2");
            controle.getLivro().setGenero("Teste2");
            controle.getLivro().setEditora("Teste2");
            controle.getLivro().setNomeAutor("Teste2");
            controle.getLivro().setSobrenomeAutor("Teste2");
            controle.getLivro().setQntPgns(250);
            controle.inserir();
            
            controle.consultarTodos();
 
            ResultSet rs = controle.getrsdados();
            
            while(rs != null && rs.next()){
                i++;
            }  
            
            assertEquals(2, i);
            
            controle.desconectar();
          
        } catch (SQLException ex) {
            fail("Erro ao executar o teste, gerou uma falha de conexão!");
        }          
    }  
    
    /**
     * Teste com quantidades de páginas inválidas.
     */ 
    
     @Test
    public void testPagsCadastroInvalido(){
          
        controle.conectar();
        controle.excluirTodos();           
        try{    
            controle.getLivro().setTitulo("Teste");
            controle.getLivro().setGenero("Teste");
            controle.getLivro().setEditora("Teste");
            controle.getLivro().setNomeAutor("Teste");
            controle.getLivro().setSobrenomeAutor("Teste");
            controle.getLivro().setQntPgns(0);
            controle.inserir();
            controle.consultarTodos();
 
            ResultSet rs = controle.getrsdados();
            assertEquals(false,rs.next());
            
            controle.desconectar();
          
        } catch (SQLException ex) {
            fail("Erro ao executar o teste, gerou uma falha de conexão!");
        }          
    }
      
    /**
     * Nome com titulo maior que 100.
     */ 
    
    @Test
    public void testNomeInvalido(){
          
        controle.conectar();
        controle.excluirTodos();         
        try{    
            controle.getLivro().setTitulo("Teste Teste Teste Teste Teste Teste Teste Teste Teste Teste Teste"
            + "Teste Teste Teste Teste Teste Teste Teste");
            controle.getLivro().setGenero("Teste");
            controle.getLivro().setEditora("Teste");
            controle.getLivro().setNomeAutor("Teste");
            controle.getLivro().setSobrenomeAutor("Teste");
            controle.getLivro().setQntPgns(78);
            controle.inserir();
            controle.consultarTodos();
 
            ResultSet rs = controle.getrsdados();
            assertEquals(false,rs.next());
            
            controle.desconectar();
          
        } catch (SQLException ex) {
            fail("Erro ao executar o teste, gerou uma falha de conexão!");
        }          
    }
    
     /**
     * Nome com campo em branco.
     */
    
    @Test
    public void testCampoInvalido(){
          
        controle.conectar();
        controle.excluirTodos();           
        try{    
            controle.getLivro().setTitulo("");
            controle.getLivro().setGenero("Teste");
            controle.getLivro().setEditora("Teste");
            controle.getLivro().setNomeAutor("Teste");
            controle.getLivro().setSobrenomeAutor("Teste");
            controle.getLivro().setQntPgns(0);
            controle.inserir();
            controle.consultarTodos();
 
            ResultSet rs = controle.getrsdados();
            assertEquals(false,rs.next());
            
            controle.desconectar();
          
        } catch (SQLException ex) {
            fail("Erro ao executar o teste, gerou uma falha de conexão!");
        }          
    }
    
}