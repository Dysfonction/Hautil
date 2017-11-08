import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "helloWorld")
public class helloWorld extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        try (PrintWriter writer = response.getWriter()) {
            String nom = request.getParameter("nom");
            String courriel = request.getParameter("courriel");
            String message = request.getParameter("message");
            writer.println("<html>");
            writer.println("<head>");
            writer.println("<meta charset=\"UTF-8\" />");
            writer.println("<title>Bienvenue "+nom+"</title>");
            writer.println("</head>");
            writer.println("<body>");
            writer.println("Bonjour "+nom+", votre adresse email est "+courriel+" et votre message est le suivant :");
            writer.println(message);
            writer.println("</body>");
            writer.println("</html>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
