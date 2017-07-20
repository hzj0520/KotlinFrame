import java.text.SimpleDateFormat
import java.util.*
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@WebServlet("/hello")
class HelloServlet : HttpServlet() {

    override fun doPost(req: HttpServletRequest?, resp: HttpServletResponse?) {
        super.doPost(req, resp)
    }

    override fun doGet(req: HttpServletRequest?, resp: HttpServletResponse?) {
        val dataFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        val currentTime = dataFormat.format(Date())
        req!!.setAttribute("currentTime",currentTime)
        req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req,resp)

    }
}