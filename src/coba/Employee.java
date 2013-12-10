/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;

/**
 *
 * @author admin
 */
public class Employee implements Comparable {

    int EmpID;
    String Ename;
    double Sal;
    static int i;

    public Employee() {
        EmpID = i++;
        Ename = "dont know";
        Sal = 0.0;
    }

    public Employee(String ename, double sal) {
        EmpID = i++;
        Ename = ename;
        Sal = sal;
    }

    public String toString() {
        return "EmpID " + EmpID + "\n" + "Ename " + Ename + "\n" + "Sal" + Sal;
    }

    @Override
    public int compareTo(Object t) {
        if (this.Sal == ((Employee) t).Sal) {
            return 0;
        } else if ((this.Sal) > ((Employee) t).Sal) {
            return 1;
        } else {
            return -1;
        }
    }

    void add(Employee employee) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
