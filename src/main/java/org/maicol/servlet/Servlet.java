package org.maicol.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//es la llave la cual permite enlazarme al servlet
//esta es una anotacion, un path o una key para enlazarme al servlet
@WebServlet("/servlet")
public class Servlet extends HttpServlet {
    //Indicamos el metodo a utilizar en el Servlet
    //enviamos los datos mediante un link,botones, imagenes utilizando el metodo get
    //enviamos informacion mediante un formulario utilizamos el metodo post

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //seteo el tipo de contenido que va a devolver el servidor
        resp.setContentType("text/html");
        //defino una variable de tipo PrintWriter para mostrar contenido en pantalla
        PrintWriter out = resp.getWriter();
        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<meta charset=\"UTF-8\">");
        out.print("<title> Hola mundo desde Servlet </title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1> Hola mundo desde Servlet</h1");
        out.print("</body>");
        out.print("</html>");



    }
}
