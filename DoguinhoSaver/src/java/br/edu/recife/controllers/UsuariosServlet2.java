/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.recife.controllers;

import br.edu.ifpe.recife.model.negocio.Usuario;
import br.edu.ifpe.recife.model.repositorios.RepositorioUsuario;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ALUNO
 */
@WebServlet(name = "UsuariosServlet2", urlPatterns = {"/UsuariosServlet2"})
public class UsuariosServlet2 extends HttpServlet {

    

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String codigo = request.getParameter("c");
        String operacao = request.getParameter("op");
        
        if(codigo != null){
            
            Usuario u = RepositorioUsuario.read(Integer.parseInt(codigo));
            
            if(operacao != null){
                
                RepositorioUsuario.delete(u);
                
                request.setAttribute("msg", "usuario deletado com sucesso!");
                
                List<Usuario> usuarios = RepositorioUsuario.readAll();
        
                HttpSession session = request.getSession();
        
                session.setAttribute("usus", usuarios);
            
                request.getRequestDispatcher("/usuarios.jsp")
                    .forward(request, response);
                
            }
            
            request.setAttribute("usuario", u);
            
            request.getRequestDispatcher("/CadastroUsuario.jsp")
                    .forward(request, response);
            
        }
        
        List<Usuario> usuarios = RepositorioUsuario.readAll();
        
        HttpSession session = request.getSession();
        
        session.setAttribute("usus", usuarios);
        
        response.sendRedirect("usuarios.jsp");
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String operacao = request.getParameter("op");
        
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        String email = request.getParameter("email");
        String cidade = request.getParameter("cidade");
        String bairro = request.getParameter("bairro");
        String contato = request.getParameter("contato");
        
        Usuario usuario = new Usuario();
        
        usuario.setCodigo(codigo);
        usuario.setCidade(cidade);
        usuario.setBairro(bairro);
        usuario.setContato(contato);
        usuario.setEmail(email);
        usuario.setLogin(login);
        usuario.setSenha(senha);
        
        if(operacao.equals("cadastro")){
            RepositorioUsuario.create(usuario);
        }else{
            RepositorioUsuario.update(usuario);
        }
        
        HttpSession session = request.getSession();
        session.setAttribute("msg", "Usuario "+
                login+((operacao.equals("cadastro")?"cadastrado ":"editado "))
                +" com sucesso!");
        
        response.sendRedirect("UsuariosServlet2");
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
