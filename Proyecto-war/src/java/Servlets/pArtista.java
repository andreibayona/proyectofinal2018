/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import co.edu.uniminuto.proyectoCamisetaEjb.sessions.CatalogoEstampasFacade;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author andre
 */
@WebServlet(name = "pArtista", urlPatterns = {"/pArtista"})
public class pArtista extends HttpServlet {

    @EJB
    private CatalogoEstampasFacade catalogoEstampasFacade;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        processRequest(request, response);
        try {
            request.setAttribute("items", catalogoEstampasFacade.mostrar());
        String action = request.getParameter("action");
        int idEstampa=0;
        String nombre = request.getParameter("nombre");
        String categoria = request.getParameter("categoria");
        String autor = request.getParameter("autor");
        String informacion = request.getParameter("informacion");
        String tamano = request.getParameter("tamano");
        String precio = request.getParameter("precio");
        String imagen = request.getParameter("imagen");
        

        if ("Insert".equalsIgnoreCase(action)) {

            if (catalogoEstampasFacade.Insertar(idEstampa, nombre, categoria, autor, informacion, tamano, precio, imagen)) {
                request.setAttribute("items", catalogoEstampasFacade.findAll());
                request.getRequestDispatcher("pArtista.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("invalid.jsp.jsp").forward(request, response);
            }
        } else if ("Update".equalsIgnoreCase(action)) {
            if (catalogoEstampasFacade.Actualizar(idEstampa, nombre, categoria, autor, informacion, tamano, precio, imagen)) {
                  request.setAttribute("items", catalogoEstampasFacade.findAll());
                request.getRequestDispatcher("pArtista.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("invalid.jsp").forward(request, response);
            }
        } else if ("Delete".equalsIgnoreCase(action)) {
            if (catalogoEstampasFacade.Eliminar(idEstampa)) {
                request.setAttribute("items", catalogoEstampasFacade.findAll());
                request.getRequestDispatcher("pArtista.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("invalid.jsp").forward(request, response);
            }
        } else {
            request.getRequestDispatcher("invalid.jsp").forward(request, response);
        }
  
        } catch (Exception e) {
            
        }
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
        processRequest(request, response);
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
