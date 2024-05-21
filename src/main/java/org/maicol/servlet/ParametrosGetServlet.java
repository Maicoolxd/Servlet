package org.maicol.servlet;
/*
 * Nombre del programador: Michael Guaman
 * Materia: Lenguajes de Programacion 2
 * Fecha: 20/05/2024
 * Detalle: La clase ParametrosGetServlet permite la declarion de varibales
 * el ingreso de datos e imprimir los datos
 * Version:1.1.0
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//esta es una anotacion, un path o una key para enlazarme al servlet
@WebServlet("/miservlet")
public class ParametrosGetServlet extends HttpServlet {

    //el metodo post permite enviar los datos al servidor
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        //declaracion de variables que se usara
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String edad = request.getParameter("edad");
        String curso = request.getParameter("curso");
        String genero = request.getParameter("genero");
        String lenguaje = request.getParameter("lenguaje");
        String descripcion = request.getParameter("descripcion");

        //se imprime los datos de acuerdo al html
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Datos</title>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Datos del Formulario</h1>");
        out.println("<p>Nombre: " + nombre + "</p>");
        out.println("<p>Apellido: " + apellido + "</p>");
        out.println("<p>Edad: " + edad + "</p>");
        out.println("<p>Curso: " + curso + "</p>");
        out.println("<p>Género: " + genero + "</p>");
        out.println("<p>Lenguaje de Programación: " + lenguaje + "</p>");
        out.println("<p>Descripción: " + descripcion + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
