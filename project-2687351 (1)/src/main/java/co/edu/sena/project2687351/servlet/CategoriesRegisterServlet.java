//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package co.edu.sena.projectv2687350.Servlets;

import co.edu.sena.projectv2687350.model.Category;
import co.edu.sena.projectv2687350.repository.CategoryRepositoryImpl;
import co.edu.sena.projectv2687350.repository.repository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet({"registerCategory"})
public class CategoriesRegisterServlet extends HttpServlet {
    public CategoriesRegisterServlet() {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String category_name = request.getParameter("category_name");
        Category category = new Category();
        category.setCategory_name(category_name);
        repository<Category> repository = new CategoryRepositoryImpl();
        boolean rows = false;

        try {
            repository.saveObj(category);
        } catch (SQLException var8) {
            var8.printStackTrace();
        }

        if (!rows) {
            System.out.println("Ocurrio un error");
        } else {
            System.out.println("Registro exitoso");
        }

    }
}
