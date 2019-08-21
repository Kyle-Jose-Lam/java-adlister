import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

    int visits = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        this.visits++;
        String name = req.getParameter("name");
        if (name == null) name = "World";
        res.setContentType("text/html");
        res.getWriter().printf("<h1>Hello %s!</h1>%n", name);
        res.getWriter().printf("<p>You have visited %d times</p>", visits);
    }
}
