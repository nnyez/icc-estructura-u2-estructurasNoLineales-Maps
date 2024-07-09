package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoContoller {
    private HashMap<Integer, Empleado> empleados;

    public EmpleadoContoller() {
        empleados = new HashMap<>();
    }

    public void addEmployee(Empleado empleado) {
        empleados.put(empleado.getId(), empleado);
    }

    public Empleado getEmployee(int id) {
        return empleados.get(id);
    }

    public void imprimirEmployees() {
        // System.out.println(empleados);
        for (Empleado empleado : empleados.values()) {
            System.out.println(empleado);
        }
    }
}