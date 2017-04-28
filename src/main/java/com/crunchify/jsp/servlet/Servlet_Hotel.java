package com.crunchify.jsp.servlet;

import edu.co.sergio.mundo.dao.Fecha;
import edu.co.sergio.mundo.dao.ServiceHotel;
import edu.co.sergio.mundo.dao.Conexion;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Servlet_Menu", urlPatterns = {"/Servlet_Menu"})
public class Servlet_Hotel extends HttpServlet {

    Fecha date = new Fecha();
    ServiceHotel service = new ServiceHotel();
    Conexion conexion = new Conexion();
    Connection connection = null;
    ResultSet rs = null;
    Boolean b;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, URISyntaxException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //connection = service.GenerarConexion();
        connection = conexion.getConnection();
        int opcion = Integer.parseInt(request.getParameter("opcion"));

        switch (opcion) {
            case 1:
                int id = Integer.parseInt(request.getParameter("IdUserReg"));
                String pass = request.getParameter("NPassUserReg");
                String Nombre = request.getParameter("NombreUserReg");
                String Apellido = request.getParameter("ApellidoUserReg");
                String Correo = request.getParameter("CorreoUserReg");
                String Telefono = request.getParameter("TelUserReg");

                //b = service.insertarUser(connection, id, pass, Nombre, Apellido, Correo, Telefono);
                if (b == true) {
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Servlet Servlet_Menu</title>");
                    out.println("<meta http-equiv=" + "Refresh" + " content=" + "3;url=" + "indexMainMenu.html" + ">");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>El Usuario Se Agrego Satisfactoriamente...</h1>");
                    out.println("<p>Serás dirigido automáticamente en cinco segundos al menu principal. En caso contrario, puedes acceder registrar otro Lote, haciendo click <a href=" + "CrearUser.html" + ">Aquí</a></p>");
                    out.println("</body>");
                    out.println("</html>");
                } else {
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Servlet Servlet_Menu</title>");
                    out.println("<meta http-equiv=" + "Refresh" + " content=" + "3;url=" + "indexMainMenu.html" + ">");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>No fue posible agregar el Usuario, el Id ya existe, intente nuevamente...</h1>");
                    out.println("<p>Serás dirigido automáticamente en cinco segundos al menu principal. En caso contrario, puedes acceder registrar otro Lote, haciendo click <a href=" + "CrearUser.html" + ">Aquí</a></p>");
                    out.println("</body>");
                    out.println("</html>");
                }
                ;

            case 2:
                int IdLote = Integer.parseInt(request.getParameter("IdLoteReg"));
                String NombreLote = request.getParameter("NombreLoteReg");
                //b = service.inertarLote(connection, IdLote, NombreLote);

                if (b == true) {
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Registro Lote</title>");
                    out.println("<meta http-equiv=" + "Refresh" + " content=" + "3;url=" + "indexMainMenu.html" + ">");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>Lote -> " + IdLote + " agregado Satisfactoriamente, con el nombre:'' " + NombreLote + "''</h1>");
                    out.println("<p>Serás dirigido automáticamente en cinco segundos al menu principal. En caso contrario, puedes acceder registrar otro Lote, haciendo click <a href=" + "CrearLote.html" + ">Aquí</a></p>");
                    out.println("</body>");
                    out.println("</html>");
                } else {
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Servlet Servlet_Menu</title>");
                    out.println("<meta http-equiv=" + "Refresh" + " content=" + "3;url=" + "CrearLote.html" + ">");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>Error interno en la creacion del Lote, el Id del lote ya existe, intentelo nuevamente...</h1>");
                    out.println("</body>");
                    out.println("</html>");
                }
                ;
            case 3:
                String nombreProducto = request.getParameter("NombreProductoReg");
                String proveedorProducto = request.getParameter("ProveedorProductoReg");
                int IdProduc = Integer.parseInt(request.getParameter("IdProductoReg"));
                int cantidadProducto = Integer.parseInt(request.getParameter("CantidadProductoReg"));
                //String tipoProducto = request.getParameter("TipoProductoReg");
                int precioProducto = Integer.parseInt(request.getParameter("PrecioProductoReg"));
                int razonProducto = Integer.parseInt(request.getParameter("RazonProductoReg"));
                int idLoteProd = Integer.parseInt(request.getParameter("PathProductoReg"));
                //b = service.insertarItem(connection, IdProduc, idLoteProd, cantidadProducto, nombreProducto, proveedorProducto, precioProducto, razonProducto);

                if (b == true) {
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Creacion Producto</title>");
                    out.println("<meta http-equiv=" + "Refresh" + " content=" + "3;url=" + "indexMainMenu.html" + ">");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>Se creo correctamente el producto: " + nombreProducto + "</h1>");
                    out.println("<p>Serás dirigido automáticamente en cinco segundos al menu principal nuevamente. En caso contrario, puedes ir al Menu, haciendo click <a href=" + "CrearProducto.html" + ">Aquí</a></p>");
                    out.println("</body>");
                    out.println("</html>");
                } else {
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Creacion Producto</title>");
                    out.println("<meta http-equiv=" + "Refresh" + " content=" + "3;url=" + "CrearProducto.html" + ">");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>Error en el ingreso de datos, intentelo nuevamente...</h1>");
                    out.println("</body>");
                    out.println("</html>");
                }

                ;
            case 4:
                //ArrayList<Integer> idsUser = new ArrayList<>();
                //ArrayList<String> NombresUsers = new ArrayList<>();
                //rs = service.ListaGeneral(connection, 4);

                while (rs.next()) {
                    //idsUser.add(rs.getInt(1));
                    //NombresUsers.add(rs.getString(3));
                }

                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<meta charset=\"utf-8\" />");
                out.println("<title>Servlet_Menu</title>");
                out.println("<link rel=\"stylesheet\" href=\"tablas.css\">");
                out.println("<meta name=\"viewport\" content=\"initial-scale=1.0; maximum-scale=1.0; width=device-width;\">");
                out.println("</head>");
                out.println("<body>");
                out.println("<div class=\"table-title\">");
                out.println("<h3>Listado Usuarios</h3>");
                out.println("</div>");
                out.println("<table class=\"table-fill\">");
                out.println("<thead>");
                out.println("<tr>");
                out.println("<th class=\"text-left\">ID</th>");
                out.println("<th class=\"text-left\">Nombre</th>");
                out.println("</tr>");
                out.println("</thead>");
                out.println("<tbody class=\"table-hover\">");
                //for (int x = 0; x < idsUser.size(); x++) {
                out.println("<tr>");
                //    out.println("<td class=\"text-left\">" + idsUser.get(x) + "</td>");
                //    out.println("<td class=\"text-left\">" + NombresUsers.get(x) + "</td>");
                out.println("</tr>");
        }
        out.println("</tbody>");
        out.println("</table>");
        out.println("<center>");
        out.println("<p>Regresar al menu principal <a href=" + "indexMainMenu.html" + "> Click Aquí</a></p>");
        out.println("</center>");
        out.println("</body>");
        out.println("</html>");
        ;
    }
}
