import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 47419119l on 12/04/16.
 */
public class Cesar extends HttpServlet {
    /**
     * Metode per fer la vista de la web
     * @param req Http Servlet Request
     * @param resp Http Servlet Response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher view = req.getRequestDispatcher("CesarGet.jsp");
        view.forward(req,resp);
    }
    /**
     * Metode post per agafar el valor del input
     * @param req Http Servlet Request
     * @param resp Http Servlet Response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String value = req.getParameter("value");

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        out.println("<h1>Hello!</h1>");
        out.println("<p> El text origianl :"+value+"</p>");

        for(int i=0 ; i <26; i++){
            out.println("<p>Valor : "+i+" Resultat : "+ encriptCesar(value,i)+"<p>");
        }
    }
    /**
     * Metode per encriptar un text a Cesar.
     * @param value - Text original
     * @param n - Valor de la encriptació
     * @return Text encriptat.
     */
    public String encriptCesar(String value, int n){
        int i,j;
        char fraseCifrada[] = new char[value.length()];
        fraseCifrada = value.toCharArray();
        for(i=0;i<value.length();i++){
            for(j=0;j<n;j++){
                if((fraseCifrada[i]>=65 && fraseCifrada[i]<90) || (fraseCifrada[i]>=97 && fraseCifrada[i]<122)){
                    fraseCifrada[i]++;
                }
                else if(fraseCifrada[i]==90)
                    fraseCifrada[i]='A';
                else if(fraseCifrada[i]==122)
                    fraseCifrada[i]='a';
            }
        }
         value = String.valueOf(fraseCifrada);
        return value;
    }

}
