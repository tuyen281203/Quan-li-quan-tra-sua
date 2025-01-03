package main;

import controllers.EmployeeDashboardController;
import dao.EmployeeDao;
import models.Employee;
import views.EmployeeDashboardView;


/**
 * @author tuyendz
 */
public class TestStaff {

    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDao();
        try {
            javax.swing.UIManager.setLookAndFeel("com.formdev.flatlaf.FlatIntelliJLaf");
            System.out.println("Khởi tạo look and feel thành công!");
            Employee e = employeeDao.get(2);
            SessionManager.create(e);
            new EmployeeDashboardController(new EmployeeDashboardView()).getView().requestFocus();
            Runtime.getRuntime().addShutdownHook(new ShutdownHook());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
