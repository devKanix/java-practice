
//Encapsulation = it is a mechanism of wrapping the data (variables) and code acting on the data (methods) togther as single unit.

class employee {
    private int empId; // Data-hiding

    public void setEmpId(int empId1) {
        empId = empId1;
    }

    public int getEmpId() {
        return empId;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        employee e = new employee();
        e.setEmpId(1234);
        System.out.println(e.getEmpId());
    }

}
