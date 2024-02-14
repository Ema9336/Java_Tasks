package jd_tasks_13;
// 3.3 CydeoStudent:
//       - Additional Attributes:
//           - batchNumber: int
//           - groupNumber: int
//           - programmingLanguage: String
//       - Encapsulation:
//           - Same as previous tasks.
//       - Constructor:
//           - Same as previous tasks.
//       - Actions:
//           - Override the study method.
//           - Override the toString method.
public class CydeoStudent extends Student{
    int batchNumber;
    int groupNumber;
    String programmingLanguage;

    public CydeoStudent(String name, int age, String gender, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender);
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.programmingLanguage = programmingLanguage;
    }
    public int getBatchNumber(){
        return batchNumber;
    }
    public void setBatchNumber(){
        if (batchNumber<0){
            System.err.println("Batch number can not be negative.");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }
    public int getGroupNumber(){
        return groupNumber;
    }
    public void setGroupNumber(){
        if (groupNumber<0){
            System.err.println("Group number can not be negative.");
            System.exit(1);
        }
    }
    public String getProgrammingLanguage(){
        return programmingLanguage;
    }
    public void setProgrammingLanguage(String programmingLanguage){
        this.programmingLanguage = programmingLanguage;
    }
    public void study(){
        System.out.println(getName()+ " is studying programming language");
    }
    @Override
    public String toString() {
        return super.toString()+ "{" +
                "batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}