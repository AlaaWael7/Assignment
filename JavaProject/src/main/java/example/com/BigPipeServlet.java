package example.com;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/bigpipe")
public class BigPipeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Perform any necessary processing

        // Set content type
        response.setContentType("text/html");

        // Get the PrintWriter
        try {
            response.getWriter().println("<html><head><title>BigPipe Example</title></head><body>");

            // Simulate asynchronous loading of pagelets
            simulateAsyncPageletLoading(response, "pagelet1");
            simulateAsyncPageletLoading(response, "pagelet2");

            // Render the closing tags
            response.getWriter().println("</body></html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void simulateAsyncPageletLoading(HttpServletResponse response, String pageletId) throws IOException {
        // Simulate asynchronous loading of pagelet content
        String pageletContent = loadPageletContent(pageletId);

        // Render the loaded pagelet content
        response.getWriter().println("<div id='" + pageletId + "'>" + pageletContent + "</div>");
    }

    private String loadPageletContent(String pageletId) {
        // Simulate loading of content for the given pagelet
        // You would typically fetch content from a database or external service
        return "Content for " + pageletId;
    }
}

